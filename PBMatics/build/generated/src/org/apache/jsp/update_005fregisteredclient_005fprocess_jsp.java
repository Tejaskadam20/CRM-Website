package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_005fregisteredclient_005fprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');

    int id=Integer.parseInt(request.getParameter("id"));
    
    try{
        Class.forName("com.mysql.jdbc.Driver");           
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmatics_db","root","");
      
        Statement st=con.createStatement();
        
        String sql="select * from client_registration where reg_id="+id;
        
        ResultSet rs=st.executeQuery(sql);
        
        
        while(rs.next())
        {
          
      out.write("\n");
      out.write("         <html>\n");
      out.write("          <head>\n");
      out.write("\t<title></title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\t.jumbotron\n");
      out.write("\t{\n");
      out.write("\t\tpadding: 10px;\n");
      out.write("\t\tfont-family: sans-serif;\n");
      out.write("\t\tbackground-color: #ED3196;\n");
      out.write("\t}\n");
      out.write("\tp \n");
      out.write("\t{\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tfont-weight: bolder;\n");
      out.write("\t\tmargin-top: -15px;\n");
      out.write("\t\tfont-style: italic;\n");
      out.write("\t}\n");
      out.write("\t.well\n");
      out.write("\t{\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t\tbackground-color: gold;\n");
      out.write("\t}\n");
      out.write("\t.well:hover\n");
      out.write("\t{\n");
      out.write("\t\tbackground-color: #ED3196;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t}\n");
      out.write("\ta \n");
      out.write("\t{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor: #000123;\n");
      out.write("\t}\n");
      out.write("\ta:hover\n");
      out.write("\t{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("        color: white;\n");
      out.write("\t}\n");
      out.write("\t.formdiv\n");
      out.write("\t{\n");
      out.write("\t\twidth: 40%;\n");
      out.write("\t\tmargin-left: 30%;\n");
      out.write("\t\tbackground: linear-gradient(to right bottom,deeppink,purple);\n");
      out.write("\t\tpadding: 10px;\n");
      out.write("\t}\n");
      out.write("\t.btn\n");
      out.write("\t{\n");
      out.write("\t\tbackground-color: gold;\n");
      out.write("\t\tborder: none;\n");
      out.write("\t}\n");
      out.write("       \n");
      out.write("        \n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tfunction validation()\n");
      out.write("\t{\n");
      out.write("\t\t// validation first name\n");
      out.write("\t\tif(document.f1.fname.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the First Name \");\n");
      out.write("\t\t\tdocument.f1.fname.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar data=/^[A-Za-z]+$/;\n");
      out.write("\t\tif(!document.f1.fname.value.match(data))\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the valid First Name\");\n");
      out.write("\t\t\tdocument.f1.fname.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t// validation last name\n");
      out.write("\t\tif(document.f1.lname.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Last Name\");\n");
      out.write("\t\t\tdocument.f1.lname.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(!document.f1.lname.value.match(data))\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter valid Last Name\");\n");
      out.write("\t\t\tdocument.f1.lname.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// validation for Phone No\n");
      out.write("\n");
      out.write("\t\tif(document.f1.phoneno.value.length!=10)\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the valid Phone No\");\n");
      out.write("\t\t\tdocument.f1.phoneno.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// validation for email\n");
      out.write("\t\tif(document.f1.email.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Email\");\n");
      out.write("\t\t\tdocument.f1.email.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// validation for Profession\n");
      out.write("\t\tif(document.f1.profession.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please select the Profession\");\n");
      out.write("\t\t\tdocument.f1.profession.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t// validation for password\n");
      out.write("\t\tif(document.f1.client_info.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Client Information\");\n");
      out.write("\t\t\tdocument.f1.client_info.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tif(document.f1.comp_name.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Company Name\");\n");
      out.write("\t\t\tdocument.f1.comp_name.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t\tif(document.f1.comp_add.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Company Adsress\");\n");
      out.write("\t\t\tdocument.f1.comp_add.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("\t}// end of validation\n");
      out.write("\n");
      out.write("\tfunction showDate()\n");
      out.write("\t{\n");
      out.write("\t\tvar d=new Date();\n");
      out.write("\t\tvar dd=d.getDate();\n");
      out.write("\n");
      out.write("\t\tvar month_list=[\"JAN\",\"FEB\",\"MAR\",\"APR\",\"MAY\",\"JUNE\",\"JULY\",\"AUG\",\"SEPT\",\"OCT\",\"NOV\",\"DEC\"];\n");
      out.write("\n");
      out.write("\t\tvar mm=month_list[d.getMonth()];\n");
      out.write("\n");
      out.write("\t\tvar yy=d.getFullYear();\n");
      out.write("\n");
      out.write("\t\tvar cdate=dd+\"/\"+mm+\"/\"+yy;\n");
      out.write("\n");
      out.write("\t\tdocument.f1.enq_date.value=cdate;\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"showDate()\">\n");
      out.write("\n");
      out.write("   <div class=\"jumbotron\">\n");
      out.write("   \t  <h2 style=\"color: gold;\">PB Matics CRM</h2>\n");
      out.write("   \t  <p>Digital Software Solution</p>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <button class=\"btn btn-primary\">\n");
      out.write("   \t<a href=\"logout.html\">Log Out</a>\n");
      out.write("   </button>\n");
      out.write("\n");
      out.write("   <div class=\"form formdiv\">\n");
      out.write("       <form name=\"f1\" method=\"POST\" action=\"update_registeredclient.jsp\">\n");
      out.write("   \t \t<h3 class=\"text-center\">Update Client</h3>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("   \t \t\t\n");
      out.write("                    <input type=\"hidden\" name=\"reg_id\" readonly class=\"form-control\" value=\"");
      out.print(rs.getInt("REG_ID"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("   \t \t\tRegistration Date\n");
      out.write("                        <input type=\"text\" name=\"enq_date\" readonly class=\"form-control\" value=\"");
      out.print(rs.getString("REG_DATE"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    First Name\n");
      out.write("                    <input type=\"text\" name=\"fname\" class=\"form-control\" value=\"");
      out.print(rs.getString("FNAME"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Last Name\n");
      out.write("                    <input type=\"text\" name=\"lname\" class=\"form-control\" value=\"");
      out.print(rs.getString("LNAME"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Phone No\n");
      out.write("                    <input type=\"text\" name=\"phoneno\" class=\"form-control\" value=\"");
      out.print(rs.getString("PHONENO"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Email\n");
      out.write("                    <input type=\"email\" name=\"email\" class=\"form-control\" value=\"");
      out.print(rs.getString("EMAIL"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("   \t \t\t<label value=\"");
      out.print(rs.getString("PROFESSION"));
      out.write("\">Profession</label>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"profession\" value=\"JOB\">JOB\n");
      out.write("   \t \t\t</div>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"profession\" value=\"BUSINESS\">BUSINESS\n");
      out.write("   \t \t\t</div>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"profession\" value=\"SELF EMPLOYEE\">SELF EMPLOYEE\n");
      out.write("   \t \t\t</div>\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Client Information\n");
      out.write("                    <input type=\"text\" name=\"client_info\" class=\"form-control\" value=\"");
      out.print(rs.getString("CLIENT_INFO"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Company Name\n");
      out.write("                    <input type=\"text\" name=\"comp_name\" class=\"form-control\" value=\"");
      out.print(rs.getString("COMP_NAME"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Company Address\n");
      out.write("                    <input type=\"text\" name=\"comp_add\" class=\"form-control\" value=\"");
      out.print(rs.getString("COMP_ADD"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group text-center\">\n");
      out.write("   \t \t\t<button class=\"btn btn-info\">Go To dashboard</button>\n");
      out.write("\n");
      out.write("   \t \t\t<button class=\"btn btn-info\" type=\"submit\" onclick=\"return validation()\">Update Client</button>\n");
      out.write("   \t \t\t<button class=\"btn btn-info\">Reset</button>\n");
      out.write("   \t \t</div>\n");
      out.write("   \t </form>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("                ");

        }// end of while loop
         
        con.close();
        
    }// end of try
    catch(Exception e)
    {
        System.out.print(e);
    }
    
      out.write("\n");
      out.write("    \n");
      out.write("</body>\n");
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
