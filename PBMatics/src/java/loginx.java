
import java.io.*;

import java.sql.*;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

//import java.util.logging.Logger;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;

public class loginx extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        String login_name = request.getParameter("uname");

        String login_password = request.getParameter("pass");

        Connection con;

        HttpSession session = request.getSession();

        session.setAttribute("session_username", login_name);

        session.setAttribute("session_password", login_password);

        try {

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/pbmatics_db";

            String user = "root";

            String password = "";

            con = DriverManager.getConnection(url, user, password);

            PreparedStatement ps = con.prepareStatement("select * from users where uname='" + login_name + "' and pass='" + login_password + "'");

            ResultSet rs = ps.executeQuery();

            String uname = "";

            String upass = "";

            int uid = 0;

            while (rs.next()) {

                uname = rs.getString("uname");

                upass = rs.getString("pass");

                uid = rs.getInt("userid");

            }

            session.setAttribute("session_uid", uid);

            if (uname.equals(login_name) && upass.equals(login_password)) {

                response.sendRedirect("employee_dashboard.html");

            } else if (login_name.equals("admin") && login_password.equals("admin1234")) {

                response.sendRedirect("dashboard_admin.html");

            } else {

                out.println("<center><h2>You are not registered with us</h2></center>");

            }

        } catch (Exception e) {

// Logger.getLogger(LoginServlet.class.getName()).log(Lavel.SERVE,null)
            out.println(e);

        }

    }

}
