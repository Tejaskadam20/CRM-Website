package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dashboard_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/brandname_with_SessionName.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("</script>\n");
      out.write("\t<title></title>\n");
      out.write("\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\t\t.jumbotron\n");
      out.write("\t\t{\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tbackground-color: #ED3196;\n");
      out.write("\t\t}\n");
      out.write("\t\tp \n");
      out.write("\t\t{\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-weight: bolder;\n");
      out.write("\t\t\tmargin-top: -15px;\n");
      out.write("\t\t\tfont-style: italic;\n");
      out.write("\t\t}\n");
      out.write("\t\t.well\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tbackground-color: gold;\n");
      out.write("\t\t}\n");
      out.write("\t\t.well:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: #ED3196;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("\t\ta \n");
      out.write("\t\t{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\ta:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\t.btn\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: gold;\n");
      out.write("\t\t}\n");
      out.write("                h4\n");
      out.write("                {\n");
      out.write("                    margin-left: 85%;\n");
      out.write("                    color:gold;\n");
      out.write("                }\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("     \n");
      out.write("   \n");
      out.write("  ");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\">\n");
      out.write("  </script>\n");
      out.write("  \n");
      out.write("  <style type=\"text/css\">\n");
      out.write("\t\t.jumbotron\n");
      out.write("\t\t{\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\tfont-family: sans-serif;\n");
      out.write("\t\t\tbackground-color: #ED3196;\n");
      out.write("\t\t}\n");
      out.write("\t\tp \n");
      out.write("\t\t{\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-weight: bolder;\n");
      out.write("\t\t\tmargin-top: -15px;\n");
      out.write("\t\t\tfont-style: italic;\n");
      out.write("\t\t}\n");
      out.write("\t\t.well\n");
      out.write("\t\t{\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tbackground-color: gold;\n");
      out.write("\t\t}\n");
      out.write("\t\t.well:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: #ED3196;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tcursor: pointer;\n");
      out.write("\t\t}\n");
      out.write("\t\ta \n");
      out.write("\t\t{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\ta:hover\n");
      out.write("\t\t{\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t}\n");
      out.write("\t\t.btn\n");
      out.write("\t\t{\n");
      out.write("\t\t\tbackground-color: gold;\n");
      out.write("\t\t}\n");
      out.write("                h4\n");
      out.write("                {\n");
      out.write("                    margin-left: 85%;\n");
      out.write("                    color:gold;\n");
      out.write("                }\n");
      out.write("\t</style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("   \t  <h2 style=\"color: gold;\">PB Matics CRM</h2>\n");
      out.write("   \t  <p>Digital Software Solution</p>\n");
      out.write("          ");

        String sname=(String)session.getAttribute("sname");
        
        out.print("<h4>Welcome "+sname+"</h4>");
     
      out.write("  \n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("   <button class=\"btn btn-primary\">\n");
      out.write("   \t   <a href=\"logout.html\">Log Out</a>\n");
      out.write("   </button>\n");
      out.write("\n");
      out.write("   <div class=\"container-fluid text-center\">\n");
      out.write("   \t     <h3>Admin Department</h3>\n");
      out.write("\n");
      out.write("   \t  <div class=\"row\">\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"create_user.html\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\tCreate New User\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t \t</a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"display_user.jsp\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\t\tDisplay User\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t    </a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"display_for_update.jsp\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\tUpdate User\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t        </a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"Display_for_remove.jsp\">\n");
      out.write("   \t  \t \t\t<div class=\"well\">\n");
      out.write("   \t  \t \t\t\tRemove User\n");
      out.write("   \t  \t \t\t</div>\n");
      out.write("   \t  \t \t</a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  </div> <!-- end of row-1 --> \n");
      out.write("\n");
      out.write("   \t   <div class=\"row\">\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"petty_cash.html\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\tPetty Cash Entry\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t \t</a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"display_petty_cash.jsp\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\t\tDisplay Petty Cash\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t    </a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"add_ticketing.html\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\tAdd Ticketing\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t    </a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"display_ticketing.jsp\">\n");
      out.write("   \t  \t \t\t<div class=\"well\">\n");
      out.write("   \t  \t \t\t\tDisplay Ticketing\n");
      out.write("   \t  \t \t\t</div>\n");
      out.write("   \t  \t \t</a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  </div> <!-- end of row-2 --> \n");
      out.write("\n");
      out.write("\n");
      out.write("       <div class=\"row\">\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"#\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\tDisplay Client Payment\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t \t</a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"#\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\t\tDisplay Vendor Payment\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t    </a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("   \t  \t \t<a href=\"#\">\n");
      out.write("   \t  \t \t<div class=\"well\">\n");
      out.write("   \t  \t \t\tDisplay Employee Payment\n");
      out.write("   \t  \t \t</div>\n");
      out.write("   \t  \t    </a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  \t <div class=\"col-sm-3\">\n");
      out.write("                            <a href=\"ledgerbook.jsp\">\n");
      out.write("   \t  \t \t\t<div class=\"well\">\n");
      out.write("   \t  \t \t\t\tDisplay Ledger Book\n");
      out.write("   \t  \t \t\t</div>\n");
      out.write("   \t  \t \t</a>\n");
      out.write("   \t  \t </div>\n");
      out.write("\n");
      out.write("   \t  </div> <!-- end of row-3 --> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("   </div><!-- end of container div -->\n");
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
