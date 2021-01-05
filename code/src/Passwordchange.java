

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Passwordchange
 */
@WebServlet("/Passwordchange")
public class Passwordchange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Passwordchange() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String pass1 = request.getParameter("pwd1");
		String user = request.getParameter("uname");
		String pass2 = request.getParameter("pwd2");
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "poori");
			stmt = conn.createStatement();
			Boolean t = pass1.equals(pass2);
			if(t == true)
			{
				String sql="update usertable set Password = '"+pass1+"' where Username = '"+user+"'";
				stmt.executeUpdate(sql);
					out.println("Password Changed Successfully");
					out.println("<br><br><a href='loginpg.jsp'>Return to previous page</a>");
			}
		}
		catch(Exception e)
		{
			
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
