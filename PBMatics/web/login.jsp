<%@page import="java.sql.*"%>

<% 
 String username=request.getParameter("uname");
 String password=request.getParameter("pass");
 
 session.setAttribute("sname",username);
 
 try
 {
      Class.forName("com.mysql.jdbc.Driver");           
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmatics_db","root","");
      
      Statement st=con.createStatement();
      
        String sql="select * from users where uname='"+username+"' and pass='"+password+"'";
        ResultSet rs=st.executeQuery(sql);
        String userx="";
        String passx="";
        int user_id=0;
         while(rs.next())
         {
             userx=rs.getString("uname");
             passx=rs.getString("pass");
             user_id=rs.getInt("userid");
         }
         session.setAttribute("session_user_id",user_id);
            if(userx.equals(username) && passx.equals(password))
            {
                response.sendRedirect("employee_dashboard.jsp");
            }
           else if(username.equals("admin") && password.equals("admin123"))
            {
                response.sendRedirect("dashboard_admin.jsp");
            }
         
            
            else
            {
               out.println("<h1><font color='red'><center>Login Failed</center></font></h1>");

            }
        
 }
 catch(Exception e)
 {
     System.out.print(e);
 }
%>