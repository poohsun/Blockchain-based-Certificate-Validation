

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String dob = request.getParameter("dob");
		String classs = request.getParameter("classss");
		String school = request.getParameter("school");
		String code = request.getParameter("code");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");

		Connection conn = null;
		PreparedStatement stmt = null;
		//ResultSet rs = null;
		try {
			String s1 = code;
			String s2 = phone;
			String finall = s1.concat(s2);
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "poori");
			String sql = "insert into register(First_Name, Last_Name, DOB, Class, School, Code, Phone, Email, Rollno ) values (?,?,?,?,?,?,?,?,?)";
			stmt = conn.prepareStatement(sql);

			stmt.setString(1, fname);
			stmt.setString(2, lname);
			stmt.setString(3, dob);
			stmt.setString(4, classs);
			stmt.setString(5, school);
			stmt.setString(6, code);
			stmt.setString(7, phone);
			stmt.setString(8, email);
			stmt.setString(9, finall);
			stmt.executeUpdate();
			out.println("Registered successfully");
			out.println("<br><br><a href='studentchoose.jsp'>Return to previous page</a>");
			String sql1 = "insert into usertable(Username, Password) values (?,?)";
			PreparedStatement stmt1 = null;
			stmt1 = conn.prepareStatement(sql1);
	

			stmt1.setString(1, finall);
			stmt1.setString(2, finall);
			stmt1.executeUpdate();

		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
