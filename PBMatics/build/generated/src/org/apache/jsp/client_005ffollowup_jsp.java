package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class client_005ffollowup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Display User</title>\n");
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
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\ta:hover\n");
      out.write("\t{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\t.formdiv\n");
      out.write("\t{\n");
      out.write("\t\twidth: 40%;\n");
      out.write("\t\tmargin-left: 30%;\n");
      out.write("\t}\n");
      out.write("\t.btn\n");
      out.write("\t{\n");
      out.write("\t\tbackground: linear-gradient(to left,deeppink,purple);\n");
      out.write("\t\tborder: 2px solid white;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\tborder-radius: 20px;\n");
      out.write("\t\tpadding: 5px 20px;\n");
      out.write("\t}\n");
      out.write("\t.btn:hover\n");
      out.write("    {\n");
      out.write("    \tbackground: linear-gradient(to left,purple,deeppink);\n");
      out.write("    \tcolor: white;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("  <div class=\"jumbotron\">\n");
      out.write("  \t  <h2 style=\"color: gold;\">PB Matics CRM</h2>\n");
      out.write("  \t  <p>Digital Software Solution</p>\n");
      out.write("  </div>\n");
      out.write("  \t\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("  \t<button class=\"btn btn-primary\">\n");
      out.write("  \t\t<a href=\"logout.html\">Log Out</a>\n");
      out.write("  \t</button>\n");
      out.write("  \n");
      out.write("  \t<button class=\"btn\">\n");
      out.write("  \t\t<a href=\"new_client_enquiry.html\">\n");
      out.write("  \t\t\t<span class=\"glyphicon glyphicon-plus\"></span>\n");
      out.write("  \t\t\tAdd New Client Enquiry\n");
      out.write("  \t\t</a>\n");
      out.write("  \t</button>\n");
      out.write("\n");
      out.write("  \t<table class=\"table table-bordered\">\n");
      out.write("  \t\t<tr bgcolor=\"gold\">\n");
      out.write("  \t\t\t<th>Client Id</th>\n");
      out.write("  \t\t\t<th>Enquiry Date</th>\n");
      out.write("  \t\t\t<th>First Name</th>\n");
      out.write("  \t\t\t<th>Last Name</th>\n");
      out.write("  \t\t\t<th>Phone No</th>\n");
      out.write("  \t\t\t<th>Email Id</th>\n");
      out.write("  \t\t\t<th>Profession</th>\n");
      out.write("  \t\t\t<th>Client Info</th>\n");
      out.write("  \t\t\t<th>Suggest Info</th>          \n");
      out.write("  \t\t\t<th>Client Status</th>          \n");
      out.write("  \t\t</tr>\n");
      out.write("  \t\t");

                try{
                    Class.forName("com.mysql.jdbc.Driver");           
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmatics_db","root","");
                 
                    Statement st=con.createStatement();
                    
                    String sql="select * from client_enquiry where select_status='FollowUP' order by client_id desc";
                    ResultSet rs=st.executeQuery(sql);
                    
                    while(rs.next())
                    {
                       
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                          <td>");
      out.print(rs.getInt("CLIENT_ID"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("CLIENT_ENTRY_DATE"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("FNAME"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("LNAME"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("PHONENO"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("EMAIL"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("PROFESSION"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("CLIENT_INFO"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("CLIENT_SUGG_PROF"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("SELECT_STATUS"));
      out.write("</td>\n");
      out.write("                          \n");
      out.write("                         \n");
      out.write("                      </tr>\n");
      out.write("                     \n");
      out.write("                     ");

                    }
                    con.close();
                }
                catch(Exception e)
                            {
                            System.out.println(e);
                            }
                    
      out.write("\n");
      out.write("  \t</table>\n");
      out.write("  </div>\n");
      out.write("\n");
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
