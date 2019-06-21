import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SqServlet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        processRequest(req, res); //To change body of generated methods, choose Tools | Templates.
    

	int k=0;
	Cookie cookies[]=req.getCookies();
	for(Cookie c: cookies)
	{
		if(c.getName().equals("k"))
			k=Integer.parseInt(c.getValue());
	}
	k=k*k;
	PrintWriter out =res.getWriter();
	out.println("ReSult is :" + k);
	}

	private void processRequest(HttpServletRequest req, HttpServletResponse res) {
		// TODO Auto-generated method stub
		
	}

}
