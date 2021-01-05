

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
 * Servlet implementation class Institpg
 */
@WebServlet("/Institpg")
public class Institpg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Institpg() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String roll= request.getParameter("roll");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "poori");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from register where Rollno='"+roll+"'");
			while(rs.next())
			{
				out.println("<html>");
				out.println("<body>");
				out.println("<h1 align='center'> <div style=\'background: skyblue;\'> Student Information </div></h1>");
				out.println("<table border='1' align='center'>");
				out.println("<tr><td> Student Name: "+rs.getString(1).concat(rs.getString(2))+"</td></tr>");
				out.println("<tr><td> DOB: "+rs.getString(3)+"</td></tr>");
				out.println("<tr><td>Last Completed Grade: "+rs.getString(4)+"</td></tr>");
				out.println("<tr><td>School studied in 10th Grade: "+rs.getString(6)+"</td></tr>");
				out.println("<tr><td>Phone: "+rs.getString(8)+"</td></tr>");
				out.println("<tr><td>E-mail: "+rs.getString(9)+"</td></tr>");
				out.println("</table>");
				out.println("<button type = button><a href='http://localhost:3001/block-explorer'> Click here to view certificate </a></button><br><br>");
				out.println("<a href='institlogin.jsp'>Logout </a> <br><br>");
				
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
