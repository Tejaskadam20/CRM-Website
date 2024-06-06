package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_005fdayplan_005fprocess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        
        String sql="select * from dayplan_entry where plan_id="+id;
        
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
      out.write("                color: white;\n");
      out.write("\t}\n");
      out.write("\t.formdiv\n");
      out.write("\t{\n");
      out.write("\t\twidth: 40%;\n");
      out.write("\t\tmargin-left: 30%;\n");
      out.write("\t\tbackground: linear-gradient(to right bottom,deeppink,purple);\n");
      out.write("\t\tpadding: 10px;\n");
      out.write("                color:white;\n");
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
      out.write("\t\t// validation for plan_date\n");
      out.write("\t\tif(document.f1.plan_date.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Plan Date\");\n");
      out.write("\t\t\tdocument.f1.plan_date.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("      // validation for plan day\n");
      out.write("\t\tif(document.f1.plan_day.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the Plan Day\");\n");
      out.write("\t\t\tdocument.f1.plan_day.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tvar data=/^[A-Za-z]+$/;\n");
      out.write("\t\t\n");
      out.write("      // validation for plan time\n");
      out.write("\t\tif(document.f1.plan_time.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter Plan time\");\n");
      out.write("\t\t\tdocument.f1.plan_time.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("\t\t// validation for task details \n");
      out.write("\n");
      out.write("\t\tif(document.f1.task_details.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please enter the task details\");\n");
      out.write("\t\t\tdocument.f1.task_details.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("                 \n");
      out.write("                // validation for status\n");
      out.write("\t\tif(document.f1.status.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please select the status\");\n");
      out.write("\t\t\tdocument.f1.status.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t// valiadtion for task\n");
      out.write("\t\tif(document.f1.task.value==\"\")\n");
      out.write("\t\t{\n");
      out.write("\t\t\talert(\"Please select the remark\");\n");
      out.write("\t\t\tdocument.f1.task.focus();\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t}\n");
      out.write("     \n");
      out.write("\t}// end of validation\n");
      out.write("\n");
      out.write("\t\n");
      out.write("         function showDate()\n");
      out.write("\t{\n");
      out.write("\t\tvar d=new Date();\n");
      out.write("\t\tvar dd=d.getDate();\n");
      out.write("\n");
      out.write("\t\tvar month_list=[\"JAN\",\"FEB\",\"MAR\",\"APR\",\"MAY\",\"JUNE\",\"JULY\",\"AUG\",\"SEPT\",\"OCT\",\"NOV\",\"DEC\"];\n");
      out.write("                var day=[\"SUNDAY\",\"MONDAY\",\"TUESDAY\",\"WEDNESDAY\",\"THURSDAY\",\"FRIDAY\",\"SATURDAY\"];\n");
      out.write("\t\tvar mm=month_list[d.getMonth()];\n");
      out.write("\n");
      out.write("\t\tvar yy=d.getFullYear();\n");
      out.write("\n");
      out.write("\t\tvar cdate=dd+\"/\"+mm+\"/\"+yy;\n");
      out.write("\n");
      out.write("\t\tdocument.f1.plan_date.value=cdate;\n");
      out.write("                document.f1.plan_day.value=day[d.getMonth()];\n");
      out.write("                \n");
      out.write("                var h=d.getHours();\n");
      out.write("                var m=d.getMinutes();\n");
      out.write("                var ctime=h+\":\"+m;\n");
      out.write("                \n");
      out.write("                document.f1.plan_time.value=ctime;\n");
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
      out.write("           <form name=\"f1\" action=\"update_dayplan.jsp\" method=\"POST\">\n");
      out.write("   \t \t <div class=\"form-group\">\n");
      out.write("   \t \t\t<input type=\"hidden\" name=\"plan_id\" class=\"form-control\" value=\"");
      out.print(rs.getInt("PLAN_ID"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("               <div class=\"form-group\">\n");
      out.write("   \t \t\tPlan Date \n");
      out.write("   \t \t\t<input type=\"text\" name=\"plan_date\" class=\"form-control\" value=\"");
      out.print(rs.getString("DATE"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                        Plan Day \n");
      out.write("   \t \t\t<input type=\"text\" name=\"plan_day\" class=\"form-control\"value=\"");
      out.print(rs.getString("DAY"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                         Plan Time \n");
      out.write("   \t \t\t<input type=\"text\" name=\"plan_time\" class=\"form-control\" value=\"");
      out.print(rs.getString("TIME"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                        Task Details\n");
      out.write("   \t \t\t<input type=\"text\" name=\"task_details\" placeholder=\"Task Details\" class=\"form-control\" value=\"");
      out.print(rs.getString("DETAILS"));
      out.write("\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                    <label>Task Status</label>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("                            ");

                                String data=rs.getString("STATUS");
                            
      out.write("\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"STATUS\" value=\"");
      out.print((data.equals("Urgent and Important")?"checked":""));
      out.write("\">Urgent and Important\n");
      out.write("   \t \t\t</div>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"STATUS\" value=\"");
      out.print((data.equals("Not Urgent But Important")?"checked":""));
      out.write("\">Not Urgent But Important\n");
      out.write("                        </div>\n");
      out.write("   \t \t</div>\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label value=\"");
      out.print(rs.getString("REMARK"));
      out.write("\">Reamrk</label>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"task\" value=\"In Progress\">In Progress\n");
      out.write("   \t \t\t</div>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"task\" value=\"Task Completed\">Task Completed\n");
      out.write("   \t \t\t</div>\n");
      out.write("   \t \t\t<div class=\"radio-inline\">\n");
      out.write("   \t \t\t\t<input type=\"radio\" name=\"task\" value=\"On Hold\">On Hold\n");
      out.write("   \t \t\t</div>\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \t \t<div class=\"form-group\">\n");
      out.write("                      Plan By\n");
      out.write("   \t \t\t<input type=\"text\" name=\"plan_by\" class=\"form-control\">\n");
      out.write("   \t \t</div>\n");
      out.write("\n");
      out.write("   \t \t\n");
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
