import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException {
		//load the driver (optional)
		new com.mysql.jdbc.Driver();
		//connect to database
		String url="jdbc:mysql://localhost:3306/mcet";
		String username="root";
		String password="";		//enter your db password
		Connection con = DriverManager.getConnection(url,username,password);
		//execute the statement
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEES");
		while(rs.next())
		{
			System.out.printf("%d\t%-15s\t%-15s\t%d\n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
		}
	}

}
