package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class display_005fticketing_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.html");
  }

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("</script>\n");
      out.write("<style>\n");
      out.write("    .table{\n");
      out.write("        width:100%;\n");
      out.write("    }\n");
      out.write("    a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        font-size: 17px;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("      ");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("    \r\n");
      out.write("    .jumbotron{\r\n");
      out.write("        padding: 7px;\r\n");
      out.write("        background-color:deeppink;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("       <div class=\"jumbotron\">\r\n");
      out.write("  \t  <h2 style=\"color: gold;\">PB Matics CRM</h2>\r\n");
      out.write("  \t  <p>Digital Software Solution</p>\r\n");
      out.write("       </div>\r\n");
      out.write(" \n");
      out.write("\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("        <a href=\"add_ticketing.html\">\n");
      out.write("            <button class=\"btn btn-info\">\n");
      out.write("                <span class=\"glyphicon glyphicon-plus\"> Add New Ticketing </span>\n");
      out.write("            </button>\n");
      out.write("        </a>\n");
      out.write("            </div>       \n");
      out.write("            <div class=\"col-sm-8\">\n");
      out.write("        <h3 class=\"text-center\">Ticketing entry Details</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <center>\n");
      out.write("        <table class=\"table table-bordered\">\n");
      out.write("            <tr bgcolor=\"gold\">\n");
      out.write("                <th>SR.NO</th>\n");
      out.write("                <th>Ticketing Id</th>\n");
      out.write("                <th>User Id</th>\n");
      out.write("                <th>Entry Date</th>\n");
      out.write("                <th>Department Name</th>\n");
      out.write("                <th>Client Name</th>\n");
      out.write("                <th>Project Name</th>\n");
      out.write("                <th>Discription of Issue</th>\n");
      out.write("                <th>Hand Over To</th>\n");
      out.write("                <th>Remark</th>\n");
      out.write("                <th colspan=\"2\" align=\"center\">Action</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                try{
                    Class.forName("com.mysql.jdbc.Driver");           
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pbmatics_db","root","");
      
                    Statement st=con.createStatement();
                    String sql="select * from add_ticketing order by ticketing_id where userid='"+session_user_id+'" desc";
                    ResultSet rs=st.executeQuery(sql);
                    int x=101;
                    while(rs.next())
                    {
                      
      out.write("\n");
      out.write("                      \n");
      out.write("                      <tr>\n");
      out.write("                          <td>");
      out.print(x);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getInt("TICKETING_ID"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getInt("user_id"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("ENTRY_DATE"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("DNAME"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("CLIENT_NAME"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("PROJECT"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("ISSUE"));
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(rs.getString("HANDOVERTO"));
      out.write("</td>\n");
      out.write("                          <td>\n");
      out.write("                      <marquee scrolldelay=\"150\"> <font color=\"limegreen\"> ");
      out.print(rs.getString("REMARK"));
      out.write("</font></marquee>\n");
      out.write("                          </td>\n");
      out.write("\n");
      out.write("                          \n");
      out.write("                          <td align=\"center\">\n");
      out.write("                              <a href=\"delete_ticketing.jsp?id=");
      out.print(rs.getInt("TICKETING_ID"));
      out.write("\">\n");
      out.write("                              <button class=\"btn btn-info\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-trash\"></span>\n");
      out.write("                              </button>\n");
      out.write("                              </a>\n");
      out.write("                          </td>\n");
      out.write("                          <td align=\"center\">\n");
      out.write("                              <a href=\"update_ticketing_process.jsp?id=");
      out.print(rs.getInt("TICKETING_ID"));
      out.write("\">\n");
      out.write("                              <button class=\"btn btn-info\">\n");
      out.write("                                  <span class=\"glyphicon glyphicon-pencil\"></span>\n");
      out.write("                              </button>\n");
      out.write("                          </td>\n");
      out.write("                      </tr>\n");
      out.write("                      ");

                      x++;
                    }
                    con.close();
                }
                catch(Exception e)
                            {
                            out.println(e);
                            }
                    
      out.write("\n");
      out.write("                \n");
      out.write("     \n");
      out.write("        </table>\n");
      out.write("    </center>            \n");
      out.write("    \n");
      out.write("    </body>\n");
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
