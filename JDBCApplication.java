package JDBCLesson1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApplication {

	public static void main(String [] args) {
		String url ="jdbc:mysql://127.0.0.1:3306/employess_database";
		try {
			Connection conn = DriverManager.getConnection(url, "root","Puneetkul13@");
			Statement statement =  conn.createStatement();
			ResultSet resultset = statement.executeQuery("select * from employees_tbl");
			while(resultset.next()) {
				System.out.println(resultset.getString("name"));
				
			}
		} catch (SQLException e) {
			
		}
		
		
		
		

	}

}
