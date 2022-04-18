package JavaBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url ="jdbc:mysql://127.0.0.1:3306/employees_database";
		try {
			Connection conn = DriverManager.getConnection(url, "root","Puneetkul13@");
			Statement statement =  conn.createStatement();
//			int resultset = statement.executeUpdate("insert into employees_tbl(id,full_name,dept,salary) "
//					+ "values(53,'Punni','tech',5000 )");
//			int resultset = statement.executeUpdate("DELETE FROM employees_tbl WHERE id=2");
			int resultset  = statement.executeUpdate("UPDATE employees_tbl SET salary = 70000 where id =3");
			System.out.println("Row Affected--"+resultset);
			
		} catch (SQLException e) {
			System.out.println("error Occured");
			
		}

	}

}
