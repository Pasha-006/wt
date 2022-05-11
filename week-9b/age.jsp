<%
	String name=request.getParameter("username");  
	int age=Integer.parseInt(request.getParameter("age"));  
if(age < 18){
		out.println("Hello "+name+ " you are not authorized to visit this site" );  
	} else{  
        		out.println("Welcome " + name + " to this site");  
        	}  
%>
