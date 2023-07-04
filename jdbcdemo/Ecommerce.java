package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ecommerce {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/ecommerce";
		String username ="root";
		String password ="Aspirine1102#";
		String query = "select * from products;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(dbUrl,username,password);
		Statement stmt =con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("Product_id: " + rs.getString("product_id") + "\t");
			System.out.println("Product_name: " + rs.getString("product_name") + "\t");
			System.out.println("Product_Price: " + rs.getString("product_price") + "\t");
		}
		
	}

}
