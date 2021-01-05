

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
 * Servlet implementation class Usernchk
 */
@WebServlet("/Usernchk")
public class Usernchk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Usernchk() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("user");
		String phone = request.getParameter("phonee");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSet rs1 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "poori");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from usertable");
			while(rs.next()) {
				Boolean t = rs.getString(1).equals(uname);
				if(t == true)
				{ 
					stmt = conn.createStatement();
					rs1 = stmt.executeQuery("select * from register where Phone ='"+phone+"'");
					while(rs1.next())
					{
						out.println("hello");
					Boolean tt = rs1.getString(7).equals(phone);
					if(tt == true)
					{
						HttpSession session = request.getSession();
						session.setAttribute("uname", uname);
						response.sendRedirect("pwd.jsp");
					}
					}
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
