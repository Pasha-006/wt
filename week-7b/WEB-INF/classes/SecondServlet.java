import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondServlet extends HttpServlet {  
  	public void doPost(HttpServletRequest request, HttpServletResponse response){  
    		try{  
  			response.setContentType("text/html");  
    			PrintWriter out = response.getWriter(); 
			Cookie cookie = null;
			Cookie[] cookies = null; 
			cookies = request.getCookies();
      			//Cookie ck[]=request.getCookies(); 
			if(cookies!=null){
                        out.println("<h2> Found Cookies Name and Value</h2>");
			for (int i=0; i<cookies.length; i++){
			cookie = cookies[i];
			out.print("Name : " + cookie.getName( ) + ", ");
			out.print("Value: " + cookie.getValue( )+" <br/>");
			}
			}else{
			out.println("<h2>No cookies founds</h2>");
			}
    			//out.print("Hello "+ck[0].getValue());  
  			out.close();  
           		}catch(Exception e){System.out.println(e);}  
   	}  
    }  
