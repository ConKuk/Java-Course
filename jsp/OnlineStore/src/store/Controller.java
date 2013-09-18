package store;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.StoreItems;

/**
 * Servlet implementation class Controller
 */
@WebServlet(
		urlPatterns = { "/Controller" }, 
		initParams = { 
				@WebInitParam(name = "email", value = "support@online.store")
		})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String supportMail;
	private int hitCounter;
	private StoreItems store;


	public void init(ServletConfig config) {
		supportMail=config.getInitParameter("email");
		store=new StoreItems();
		System.out.println("loaded");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("served");
	}

}
