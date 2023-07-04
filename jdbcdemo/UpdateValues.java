package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateValues {
	public static void main(String[] args) throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
		String username ="root";
		String password ="Aspirine1102#";
		String query = "UPDATE movies SET genre = 'Comedy-Drama' where title = 'Finding nemo';" ;
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

