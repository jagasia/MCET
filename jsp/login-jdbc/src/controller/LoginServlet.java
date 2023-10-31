package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		//load the driver
		Connection con=null;
		try {
			new com.mysql.jdbc.Driver();
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mcet","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM USER_MASTER WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'");
			if(rs.next())
			{
				out.print("Success..Welcome "+rs.getString("FULLNAME"));
			}else
			{
				out.println("Failed");
			}
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//connect to database
		//execute the statement
		
		
//		if(username.equals(password))
//		{
//			out.println("Success");
//		}else
//		{
//			out.print("Failure");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
