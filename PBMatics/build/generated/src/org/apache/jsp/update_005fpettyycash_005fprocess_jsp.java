package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_005fpettyycash_005fprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        
        String sql="select * from petty_cash where pid="+id;
        
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
      out.write("\t\t// validation for purchase_date\n");
      out.write("\t\tif(document.f1.purchase_date.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Purchase Date\");\n");
      out.write("\t\t\tdocument.f1.purchase_date.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("      // validation for dname\n");
      out.write("\t\tif(document.f1.dname.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Department Name\");\n");
      out.write("\t\t\tdocument.f1.dname.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar data=/^[A-Za-z]+$/;\n");
      out.write("\t\tif(!document.f1.dname.value.match(data))\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the valid Department Name\");\n");
      out.write("\t\t\tdocument.f1.dname.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t\n");
      out.write("      // validation for product name\n");
      out.write("\t\tif(document.f1.product_name.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter Product Name\");\n");
      out.write("\t\t\tdocument.f1.product_name.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("      if(!document.f1.product_name.value.match(data))\n");
      out.write("      {\n");
      out.write("      \talert(\"Please enter valid Product Name\");\n");
      out.write("      \tdocument.f1.product_name.focus();\n");
      out.write("      \treturn false;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\t\t// validation for rate \n");
      out.write("\n");
      out.write("\t\tif(document.f1.rate.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter Product rate\");\n");
      out.write("\t\t\tdocument.f1.rate.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif(document.f1.rate.value<0)\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter valid Product rate\");\n");
      out.write("\t\t\tdocument.f1.rate.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// validation for qty\n");
      out.write("\t\tif(document.f1.qty.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Product Quantity\");\n");
      out.write("\t\t\tdocument.f1.qty.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif(document.f1.qty.value<0)\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the valid Product Quantity\");\n");
      out.write("\t\t\tdocument.f1.qty.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tif(document.f1.entry_by.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Employee Name\");\n");
      out.write("\t\t\tdocument.f1.entry_by.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("      \n");
      out.write("      if(!document.f1.entry_by.value.match(data))\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the valid Employee Name\");\n");
      out.write("\t\t\tdocument.f1.entry_by.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\t// validation for purpose\n");
      out.write("\t\tif(document.f1.purpose.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the purpose of Purchase\");\n");
      out.write("\t\t\tdocument.f1.purpose.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t\tif(!document.f1.purpose.value.match(data))\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the valid Purpose of Purchase\");\n");
      out.write("\t\t\tdocument.f1.purpose.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\t}// end of validation\n");
      out.write("\n");
      out.write("\tfunction billing()\n");
      out.write("\t{\n");
      out.write("\t\tvar rate=document.f1.rate.value;\n");
      out.write("\t\tvar qty=document.f1.qty.value;\n");
      out.write("\n");
      out.write("\t\tvar finalbill=rate*qty;\n");
      out.write("\n");
      out.write("\t\tdocument.f1.bill.value=finalbill;\n");
      out.write("\t}\n");
      out.write("        function showDate()\n");
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
      out.write("\t\tdocument.f1.purchase_date.value=cdate;\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body onload=\"showDate()\">\n");
      out.write("                  <div class=\"jumbotron\">\n");
      out.write("   \t  <h2 style=\"color: gold;\">PB Matics CRM</h2>\n");
      out.write("   \t  <p>Digital Software Solution</p>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <button class=\"btn btn-primary\">\n");
      out.write("   \t<a href=\"logout.html\">Log Out</a>\n");
      out.write("   </button>\n");
      out.write("\n");
      out.write("                  <div class=\"form formdiv\">\n");
      out.write("                      <h2 class=\"text-center\" style=\"color:white;\">Update User</h2>\n");
      out.write("           <form name=\"f1\" action=\"update_pettycash.jsp\" method=\"POST\">\n");
      out.write("   \t \t\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("   \t \t   \n");
      out.write("                    <input type=\"hidden\" name=\"pid\" class=\"form-control\" value=\"");
      out.print(rs.getInt("PID"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Purchase Date\n");
      out.write("                    <input type=\"text\" name=\"purchase_date\" class=\"form-control\" value=\"");
      out.print(rs.getString("PURCHASE_DATE"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Department Name\n");
      out.write("                    <input type=\"text\" name=\"dname\" class=\"form-control\" value=\"");
      out.print(rs.getString("DNAME"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Product Name\n");
      out.write("                    <input type=\"text\" name=\"product_name\" class=\"form-control\" value=\"");
      out.print(rs.getString("PRODUCT_NAME"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Product Rate\n");
      out.write("                    <input type=\"number\" name=\"rate\"  class=\"form-control\" value=\"");
      out.print(rs.getInt("RATE"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    Product Quantity\n");
      out.write("                    <input type=\"number\" name=\"qty\"  class=\"form-control\" value=\"");
      out.print(rs.getInt("QUANTITY"));
      out.write("\" onkeyup=\"billing()\">\n");
      out.write("   \t \t</div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    Product Bill\n");
      out.write("                    <input type=\"number\" name=\"bill\"  class=\"form-control\" value=\"");
      out.print(rs.getInt("BILL"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    Purchase By\n");
      out.write("                    <input type=\"text\" name=\"enter_by\"  class=\"form-control\" value=\"");
      out.print(rs.getString("ENTER_BY"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("                \n");
      out.write("                 <div class=\"form-group\">\n");
      out.write("                    Description of need\n");
      out.write("                    <input type=\"text\" name=\"purpose\"  class=\"form-control\" value=\"");
      out.print(rs.getString("PURPOSE"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("   \t \t<div class=\"form-group text-center\">\n");
      out.write("   \t \t\t<button class=\"btn btn-info\">Go To dashboard</button>\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-info\" type=\"submit\" value=\"Update Petty Cash\" onclick=\"return validation()\">Update Petty Cash</button>\n");
      out.write("   \t \t\t<button class=\"btn btn-info\">Reset</button>\n");
      out.write("   \t \t</div>\n");
      out.write("   \t </form>\n");
      out.write("                  </div>\n");
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
