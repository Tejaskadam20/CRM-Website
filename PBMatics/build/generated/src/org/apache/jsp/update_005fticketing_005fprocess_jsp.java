package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_005fticketing_005fprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");

    int id=Integer.parseInt(request.getParameter("id"));
    
    try{
        Class.forName("com.mysql.jdbc.Driver");           
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmatics_db","root","");
      
        Statement st=con.createStatement();
        
        String sql="select * from add_ticketing where ticketing_id="+id;
        
        ResultSet rs=st.executeQuery(sql);
        
        
        while(rs.next())
        {
          
      out.write("\r\n");
      out.write("         <html>\r\n");
      out.write("          <head>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.jumbotron\r\n");
      out.write("\t{\r\n");
      out.write("\t\tpadding: 10px;\r\n");
      out.write("\t\tfont-family: sans-serif;\r\n");
      out.write("\t\tbackground-color: #ED3196;\r\n");
      out.write("\t}\r\n");
      out.write("\tp \r\n");
      out.write("\t{\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tfont-weight: bolder;\r\n");
      out.write("\t\tmargin-top: -15px;\r\n");
      out.write("\t\tfont-style: italic;\r\n");
      out.write("\t}\r\n");
      out.write("\t.well\r\n");
      out.write("\t{\r\n");
      out.write("\t\tfont-size: 20px;\r\n");
      out.write("\t\tbackground-color: gold;\r\n");
      out.write("\t}\r\n");
      out.write("\t.well:hover\r\n");
      out.write("\t{\r\n");
      out.write("\t\tbackground-color: #ED3196;\r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tcursor: pointer;\r\n");
      out.write("\t}\r\n");
      out.write("\ta \r\n");
      out.write("\t{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t\tcolor: #000123;\r\n");
      out.write("\t}\r\n");
      out.write("\ta:hover\r\n");
      out.write("\t{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("        color: white;\r\n");
      out.write("\t}\r\n");
      out.write("\t.formdiv\r\n");
      out.write("\t{\r\n");
      out.write("\t\twidth: 40%;\r\n");
      out.write("\t\tmargin-left: 30%;\r\n");
      out.write("\t\tbackground: linear-gradient(to right bottom,deeppink,purple);\r\n");
      out.write("\t\tpadding: 10px;\r\n");
      out.write("                color: white;\r\n");
      out.write("\t}\r\n");
      out.write("\t.btn\r\n");
      out.write("\t{\r\n");
      out.write("\t\tbackground-color: gold;\r\n");
      out.write("\t\tborder: none;\r\n");
      out.write("\t}\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction validation()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t// validation for entry_date\r\n");
      out.write("\t\tif(document.f1.entry_date.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter the Entry Date\");\r\n");
      out.write("\t\t\tdocument.f1.entry_date.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("      // validation for dname\r\n");
      out.write("\t\tif(document.f1.dname.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter the Department Name\");\r\n");
      out.write("\t\t\tdocument.f1.dname.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tvar data=/^[A-Za-z]+$/;\r\n");
      out.write("\t\tif(!document.f1.dname.value.match(data))\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter the valid Department Name\");\r\n");
      out.write("\t\t\tdocument.f1.dname.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("      // validation for client name\r\n");
      out.write("\t\tif(document.f1.client_name.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter Client Name\");\r\n");
      out.write("\t\t\tdocument.f1.client_name.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("      if(!document.f1.client_name.value.match(data))\r\n");
      out.write("      {\r\n");
      out.write("      \talert(\"Please enter valid Client Name\");\r\n");
      out.write("      \tdocument.f1.client_name.focus();\r\n");
      out.write("      \treturn false;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("\t\t// validation for Project  \r\n");
      out.write("\r\n");
      out.write("\t\tif(document.f1.project.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter Project Name\");\r\n");
      out.write("\t\t\tdocument.f1.project.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t if(!document.f1.project.value.match(data))\r\n");
      out.write("      {\r\n");
      out.write("      \talert(\"Please enter valid Project Name\");\r\n");
      out.write("      \tdocument.f1.project.focus();\r\n");
      out.write("      \treturn false;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("\t\t// validation for description of issue\r\n");
      out.write("\t\tif(document.f1.issue.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter the Description of Issue\");\r\n");
      out.write("\t\t\tdocument.f1.issue.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t if(!document.f1.issue.value.match(data))\r\n");
      out.write("      {\r\n");
      out.write("      \talert(\"Please enter valid Issue\");\r\n");
      out.write("      \tdocument.f1.issue.focus();\r\n");
      out.write("      \treturn false;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      // validation for handoverto\r\n");
      out.write("\t\tif(document.f1.handoverto.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please enter the Name of hand over to\");\r\n");
      out.write("\t\t\tdocument.f1.handoverto.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t if(!document.f1.handoverto.value.match(data))\r\n");
      out.write("      {\r\n");
      out.write("      \talert(\"Please enter valid Name of hand over to\");\r\n");
      out.write("      \tdocument.f1.handoverto.focus();\r\n");
      out.write("      \treturn false;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      // validation for remark\r\n");
      out.write("\t\tif(document.f1.remark.value==\"\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please select the Remark\");\r\n");
      out.write("\t\t\tdocument.f1.remark.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}// end of validation\r\n");
      out.write("         \r\n");
      out.write("          function showDate()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tvar d=new Date();\r\n");
      out.write("\t\tvar dd=d.getDate();\r\n");
      out.write("\r\n");
      out.write("\t\tvar month_list=[\"JAN\",\"FEB\",\"MAR\",\"APR\",\"MAY\",\"JUNE\",\"JULY\",\"AUG\",\"SEPT\",\"OCT\",\"NOV\",\"DEC\"];\r\n");
      out.write("\r\n");
      out.write("\t\tvar mm=month_list[d.getMonth()];\r\n");
      out.write("\r\n");
      out.write("\t\tvar yy=d.getFullYear();\r\n");
      out.write("\r\n");
      out.write("\t\tvar cdate=dd+\"/\"+mm+\"/\"+yy;\r\n");
      out.write("\r\n");
      out.write("\t\tdocument.f1.entry_date.value=cdate;\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"showDate()\">\r\n");
      out.write("                  <div class=\"jumbotron\">\r\n");
      out.write("   \t  <h2 style=\"color: gold;\">PB Matics CRM</h2>\r\n");
      out.write("   \t  <p>Digital Software Solution</p>\r\n");
      out.write("   </div>\r\n");
      out.write("\r\n");
      out.write("   <button class=\"btn btn-primary\">\r\n");
      out.write("   \t<a href=\"logout.html\">Log Out</a>\r\n");
      out.write("   </button>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"form formdiv\">\r\n");
      out.write("                      <h2 class=\"text-center\" style=\"color:white;\">Update User</h2>\r\n");
      out.write("           <form name=\"f1\" action=\"update_ticketing.jsp\" method=\"POST\">\r\n");
      out.write("   \t \t\r\n");
      out.write("   \t \t<div class=\"form-group\">\r\n");
      out.write("   \t \t   \r\n");
      out.write("                    <input type=\"hidden\" name=\"ticketing_id\" class=\"form-control\" value=\"");
      out.print(rs.getInt("TICKETING_ID"));
      out.write("\">\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("\r\n");
      out.write("   \t \t<div class=\"form-group\">\r\n");
      out.write("                    Entry Date\r\n");
      out.write("                    <input type=\"text\" name=\"entry_date\" class=\"form-control\" value=\"");
      out.print(rs.getString("ENTRY_DATE"));
      out.write("\">\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("\r\n");
      out.write("   \t \t<div class=\"form-group\">\r\n");
      out.write("                   Enter Department Name\r\n");
      out.write("                    <input type=\"text\" name=\"dname\" class=\"form-control\" value=\"");
      out.print(rs.getString("DNAME"));
      out.write("\">\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("\r\n");
      out.write("   \t \t<div class=\"form-group\">\r\n");
      out.write("                    Enter Client Name\r\n");
      out.write("                    <input type=\"text\" name=\"client_name\" class=\"form-control\" value=\"");
      out.print(rs.getString("CLIENT_NAME"));
      out.write("\">\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("\r\n");
      out.write("   \t \t<div class=\"form-group\">\r\n");
      out.write("                    Project Name\r\n");
      out.write("                    <input type=\"text\" name=\"project_name\"  class=\"form-control\" value=\"");
      out.print(rs.getString("PROJECT"));
      out.write("\">\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("\r\n");
      out.write("   \t \t<div class=\"form-group\">\r\n");
      out.write("                    Description of Issue\r\n");
      out.write("                    <input type=\"text\" name=\"issue\"  class=\"form-control\" value=\"");
      out.print(rs.getString("ISSUE"));
      out.write("\">\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    Mention Hand Over\r\n");
      out.write("                    <input type=\"text\" name=\"handoverto\"  class=\"form-control\" value=\"");
      out.print(rs.getString("HANDOVERTO"));
      out.write("\">\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("                \r\n");
      out.write("               <div class=\"form-group\">\r\n");
      out.write("   \t \t\t<select name=\"remark\" class=\"form-control\" value=\"");
      out.print(rs.getString("REMARK"));
      out.write("\">\r\n");
      out.write("   \t \t\t\t<option value=\"\">--Select Remark--</option>\r\n");
      out.write("   \t \t\t\t<option value=\"Issue Resolve\">Issue Resolve</option>\r\n");
      out.write("   \t \t\t\t<option value=\"Issue in Progress\">Issue in Progress</option>\r\n");
      out.write("   \t \t\t\t<option value=\"Issue on Hold\">Issue on Hold</option>\r\n");
      out.write("   \t \t\t</select> \r\n");
      out.write("               </div>\r\n");
      out.write("                \r\n");
      out.write("   \t \t<div class=\"form-group text-center\">\r\n");
      out.write("   \t \t\t<button class=\"btn btn-info\">Go To dashboard</button>\r\n");
      out.write("\r\n");
      out.write("                        <button class=\"btn btn-info\" type=\"submit\" value=\"Update Ticketing\" onclick=\"return validation()\">Update Ticketing</button>\r\n");
      out.write("   \t \t\t<button class=\"btn btn-info\">Reset</button>\r\n");
      out.write("   \t \t</div>\r\n");
      out.write("   \t </form>\r\n");
      out.write("                  </div>\r\n");
      out.write("                ");

        }// end of while loop
         
        con.close();
        
    }// end of try
    catch(Exception e)
    {
        System.out.print(e);
    }
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
