package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryResultSet {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection conn = ConnectionUtils.getMySQLConnection();

		Statement statement = conn.createStatement();

		String sql = "Select emp_id, first_name, last_name from employee";

		ResultSet rs = statement.executeQuery(sql);
		
		while(rs.next()) {
			int empId=rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString("Last_Name");
			System.out.println("==========================");
			System.out.println("EmpId: "+empId);
			System.out.println("Prenom: "+firstName);
			System.out.println("Nom: "+lastName);
		}
	}

}
