import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿은 httpservlet을 상속
public class HelloServlet extends HttpServlet {

	// GET 방식의 요청을 처리
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// 응답의 페이지 타입을 결정
		resp.setContentType("text/html; charset=UTF-8");
		// 파라미터 확인
			
		String name = req.getParameter("name");
		if (name == null) {
			name = "Anonymous";
		}
		// 응답 출력을 위한 Writer
		PrintWriter out = resp.getWriter();
		out.println("<h3>Hello Servlet</h3>");
		out.println("<p>Welcome, " + name + "</p>");
		
				
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 페이지 응답 설정
		resp.setContentType("text/html;charset=UTF-8");
		
		// 폼 데이터 받기(파라미터 받기)
		// input 태그의 name 속성의 이름
		String firstName = req.getParameter("first_name");
		String lastName = req.getParameter("last_name");
		
		PrintWriter out = resp.getWriter();
		out.println("<h3>Form Data</h3>");
		out.println("<p>성:" + lastName + "</p>");
		out.println("<p>이름:" + firstName + "</p>");
	}

	
}
