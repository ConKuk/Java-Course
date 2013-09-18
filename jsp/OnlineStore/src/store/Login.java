package store;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet(urlPatterns = { "/Login" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		
	}


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("userName");
		String visited = null;
		
		if (name==null || name.length()<1){
			name = "Guest";
		}
		request.setAttribute("userName", name);
		
		Cookie [] cookies = request.getCookies();
		if (cookies!=null && cookies.length>0){
			for (Cookie c : cookies){
				if (c.getName().equals("lastVisited")){
					visited = "Last visit: " + c.getValue();
					break;
				}
				visited = "It's your first visit.";
			}
		} else {
			visited = "It's your first visit.";
		}
		
		
		
		Cookie c=new Cookie("lastVisited",(new Date()).toString());
		c.setMaxAge(10);
		response.addCookie(c);
		
		PrintWriter pw = response.getWriter();
		pw.print("<html><body><h1>");
		pw.print("Online Store</h1><hr/>");
		pw.print("<h3> Welcome "+name+" !</h3><br/>");
		pw.print("<hr/>");
		pw.print(visited);
		pw.print("</body></html>");
		pw.close();
	}

}
