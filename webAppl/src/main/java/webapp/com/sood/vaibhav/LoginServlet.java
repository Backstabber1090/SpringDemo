package webapp.com.sood.vaibhav;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet {
	private UserValidationService service = new UserValidationService();
	@Override
	protected void doGet (HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	
		
		request.getRequestDispatcher("/WEB-INF/views/newfile.jsp").forward(request, response);
	
		
	}

	
	@Override
	protected void doPost (HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		String test =request.getParameter("name");
		String password =  request.getParameter("password");
		boolean isUserValid  = service.isUserValid(test, password);
		if (!isUserValid) {
			request.setAttribute("message", "invalid Credentials provided");
			request.getRequestDispatcher("/WEB-INF/views/newfile.jsp").forward(request, response);
		}
		else {
			request.setAttribute("test", test);
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
			
		
		
	}
	
	
	
}
