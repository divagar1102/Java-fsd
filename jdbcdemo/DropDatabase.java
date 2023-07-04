package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropDatabase {
	public static void main(String[] args)throws ClassNotFoundException, SQLException{
		String dbUrl = "jdbc:mysql://localhost:3306";
		String username ="root";
		String password ="Aspirine1102#";
		String query = "Drop Database action_movies;";
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt =con.createStatement();
		stmt.execute(query);
}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
}
}

