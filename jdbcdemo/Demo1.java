package jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/animated_movies";
		String username ="root";
		String password ="Aspirine1102#";
		String query = "select * from movies;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(dbUrl,username,password);
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("S.no: " + rs.getString("s.no") + "\t");
			System.out.println("Title: " + rs.getString("title") + "\t");
			System.out.println("Genre: " + rs.getString("genre") + "\t");
			System.out.println("Director: " + rs.getString("director") + "\t");
			System.out.println("Release_year: " + rs.getString("release_year") + "\t");
		}
		
	}

}
