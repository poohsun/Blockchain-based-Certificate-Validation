

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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Studentauth
 */
@WebServlet("/Studentauth")
public class Studentauth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Studentauth() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("hello");
		String roll= request.getParameter("studid");
		out.println(roll);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		out.println("hellll");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "poori");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from regtable where Rollno = '"+ roll + "'");
			out.println("hello");
			while(rs.next())
			{
				boolean t = rs.getString(1).equals(roll);
				if(t == true)
				{
					HttpSession session = request.getSession();
					session.setAttribute("roll", roll);
					response.sendRedirect("studentchoose.jsp");
				}
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
