package och02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Add3
 */
public class Add3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// console창에 나타나는 명령어 = 개발자만 볼 수 있는 것이다
		System.out.println("doGet start ... ");
		// num의 누적분을 return 하는 것이 목표이다
		int num = Integer.parseInt(request.getParameter("num"));
		int sum = 0;
	    for(int i = 1; i <= num ; i++) {
	    	sum +=i;
	    }
	    // browser에 display 하기 위한 방식
	    // 화면에 보여주기 위한 것은 response 객체에 넣어준다
	    response.setContentType("text/html;charset=utf-8");
	    // 한글 세팅용 utf-8
	    // 화면에 올려주기 위한 메소드이다
	    // out객체를 뿌려준다
	    PrintWriter out = response.getWriter();
	    out.println("<html><body>");
	    out.printf("<h1>1부터 %d까지 합계</h1>",num);
	    out.println(sum);
	    out.println("</body></html>");
	    out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost Start....");
	}

}
