import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        processRequest(req, res); //To change body of generated methods, choose Tools | Templates.
    
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
	}

}
