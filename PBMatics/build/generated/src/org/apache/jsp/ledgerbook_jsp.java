package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ledgerbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
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
      out.write("\t\tfont-weight: bolder;\n");
      out.write("\t\tmargin-top: -15px;\n");
      out.write("\t\tfont-style: italic;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\t.well\n");
      out.write("\t{\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t\tbackground-color: gold;\n");
      out.write("\t}\n");
      out.write("\ta \n");
      out.write("\t{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor: #000123;\n");
      out.write("\t}\n");
      out.write("\ta:hover\n");
      out.write("\t{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\t.cardcontainer\n");
      out.write("\t{\n");
      out.write("\t\tbox-shadow: 0px 5px 10px 0px rgba(0, 0, 0, 0.5);\n");
      out.write("\t\ttransition: 0.3s;\n");
      out.write("\t}\n");
      out.write("\t.cardcontainer:hover\n");
      out.write("\t{\n");
      out.write("\t\tbox-shadow: 0px 10px 20px 0px rgba(0, 0, 0, 0.5);\n");
      out.write("\t}\n");
      out.write("\t.add_data\n");
      out.write("\t{\n");
      out.write("\t\tbackground-color: deeppink;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\tpadding: 10px;\n");
      out.write("\t\tpadding-bottom: 20px;\n");
      out.write("\t}\n");
      out.write("\t.showamt\n");
      out.write("\t{\n");
      out.write("\t\tcolor: gold;\n");
      out.write("\t\tfont-size: 20px;\n");
      out.write("\t}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

                ResultSet rs_client=null,rs_emp=null,rs_vendor=null;
                
                try{
                    Class.forName("com.mysql.jdbc.Driver");           
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmatics_db","root","");
      
                    Statement st=con.createStatement();
                    String sql_client="select sum(pay_amt)'tot_cpay' from client_pay_entry";
                     rs_client=st.executeQuery(sql_client);
                    
                    String sql_emp="select sum(final_amt)'tot_epay' from employee_pay_entry";
                     rs_emp=st.executeQuery(sql_emp);
                    
                    String sql_vendor="select sum(pay_amt)'tot_pay' from vendor_pay_entry";
                    rs_vendor=st.executeQuery(sql_vendor);
                    
                    
                    
                   
                   
                    
      out.write("\n");
      out.write("                \n");
      out.write("     \n");
      out.write("   \n");
      out.write("   <div class=\"jumbotron\">\n");
      out.write("   \t <h2 style=\"color: gold;\">PB Matics CRM</h2>\n");
      out.write("   \t <p>Digital Software Solution</p>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("   <div class=\"container-fluid text-center\">\n");
      out.write("   \t   <h3>Ledger Book Profit & Loss</h3>\n");
      out.write("\n");
      out.write("   \t   <div class=\"row\">\n");
      out.write("   \t   \t  <div class=\"col-sm-3\">\n");
      out.write("   \t   \t  \t<div class=\"cardcontainer\">\n");
      out.write("   \t   \t  \t\t<img src=\"Book/client.jpg\" style=\"width: 100%;\">\n");
      out.write("   \t   \t  \t\t<div class=\"add_data\">\n");
      out.write("   \t   \t  \t\t\t<h3>Client Payment</h3>\n");
      out.write("   \t   \t  \t\t\t<br>\n");
      out.write("                                     ");

                                        while(rs_client.next())
                                        {
                                            
                                        
      out.write("\n");
      out.write("   \t   \t  \t\t\t<p class=\"showamt\">&#8377\n");
      out.write("                                            ");
      out.print(rs_client.getInt("tot_cpay"));
      out.write("/-\n");
      out.write("                                        </p>\n");
      out.write("                                        ");
 }
      out.write("\n");
      out.write("   \t   \t  \t\t</div>\n");
      out.write("   \t   \t  \t</div>\n");
      out.write("   \t   \t  </div>\n");
      out.write("\n");
      out.write("   \t   \t  <div class=\"col-sm-3\">\n");
      out.write("   \t   \t  \t<div class=\"cardcontainer\">\n");
      out.write("   \t   \t  \t\t<img src=\"Book/emp_pay.jpg\" style=\"width: 100%;\">\n");
      out.write("   \t   \t  \t\t<div class=\"add_data\">\n");
      out.write("   \t   \t  \t\t\t<h3>Employee Payment</h3>\n");
      out.write("   \t   \t  \t\t\t<br>\n");
      out.write("   \t   \t  \t\t\t<p class=\"showamt\">&#8377 22, 00, 000/-</p>\n");
      out.write("   \t   \t  \t\t</div>\n");
      out.write("   \t   \t  \t</div>\n");
      out.write("   \t   \t  </div>\n");
      out.write("\n");
      out.write("   \t   \t  <div class=\"col-sm-3\">\n");
      out.write("   \t   \t  \t<div class=\"cardcontainer\">\n");
      out.write("   \t   \t  \t\t<img src=\"Book/vendor.png\" style=\"width: 100%;\">\n");
      out.write("   \t   \t  \t\t<div class=\"add_data\">\n");
      out.write("   \t   \t  \t\t\t<h3>Vendor Payment</h3>\n");
      out.write("   \t   \t  \t\t\t<br>\n");
      out.write("   \t   \t  \t\t\t<p class=\"showamt\">&#8377 22, 00, 000/-</p>\n");
      out.write("   \t   \t  \t\t</div>\n");
      out.write("   \t   \t  \t</div>\n");
      out.write("   \t   \t  </div>\n");
      out.write("\n");
      out.write("   \t   \t  <div class=\"col-sm-3\">\n");
      out.write("   \t   \t  \t<div class=\"cardcontainer\">\n");
      out.write("   \t   \t  \t\t<img src=\"Book/profit.jpg\" style=\"width: 100%;\">\n");
      out.write("   \t   \t  \t\t<div class=\"add_data\">\n");
      out.write("   \t   \t  \t\t\t<h3>Final Payment</h3>\n");
      out.write("   \t   \t  \t\t\t<br>\n");
      out.write("   \t   \t  \t\t\t<p class=\"showamt\">&#8377 15, 00, 000/-</p>\n");
      out.write("   \t   \t  \t\t</div>\n");
      out.write("   \t   \t  \t</div>\n");
      out.write("   \t   \t  </div>\n");
      out.write("\n");
      out.write("   \t   </div>\n");
      out.write("   </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");

 con.close();
                }
                catch(Exception e)
                            {
                            System.out.println(e);
  
                          }
 
      out.write("             ");
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
