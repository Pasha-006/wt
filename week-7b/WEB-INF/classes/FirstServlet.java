import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

  
public class FirstServlet extends HttpServlet {  
  	public void doPost(HttpServletRequest request, HttpServletResponse response){  
    		try{  
     			response.setContentType("text/html");  
    			PrintWriter out = response.getWriter();  
           		String n=request.getParameter("FirstName");  
    			out.print("Welcome "+n);  
           		String n1=request.getParameter("LastName");  
    			out.print("<br/>"+n1); 
      			Cookie first=new Cookie("Firs-tName",n);  
      			Cookie last=new Cookie("Last-Name",n1);    										response.addCookie(first);  												response.addCookie(last);
  			out.print("<form action='servlet2' method='post'>");  
  			out.print("<input type='submit' value='go'>");  
    			out.print("</form>");  
           		out.close();  
          	}
		catch(Exception e)
		{
			System.out.println(e);
		}  
  	}  
}  
