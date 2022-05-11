import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Calculator extends HttpServlet
{
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
        		try{
        			response.setContentType("text/html");
        			PrintWriter out= response.getWriter();
        			int a1= Integer.parseInt(request.getParameter("n1"));
        			int a2= Integer.parseInt(request.getParameter("n2"));
    				String op = request.getParameter("r1");
        			if(op.equals("add"))
            			out.println("<h1>Addition is </h1>"+(a1+a2));
        			else if (op.equals("sub"))
            			out.println("<h1>Subtraction is </h1>"+(a1-a2));
        			else if (op.equals("mul"))
            			out.println("<h1>Multiplication is </h1>"+(a1*a2));
        			else if (op.equals("div"))
             			out.println("<h1>Division</h1>"+(a1/a2));
        			else 
						out.println("Please select the operator");
        			}
        		catch(Exception e)
			{
        			e.printStackTrace();
         		}
   	}
}

