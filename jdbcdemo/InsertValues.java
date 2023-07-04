package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {
	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
		String username ="root";
		String password ="Aspirine1102#";
		String query = "INSERT INTO movies VALUE(3,\"Finding nemo\", \"ComedyDrama\", \"Andrew Stanton\",2003);";
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(dbUrl,username,password);
		Statement stmt = con.createStatement();
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

