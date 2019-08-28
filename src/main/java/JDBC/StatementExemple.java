package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExemple {
	public static final String INSERT_EMP = "Insert into Employee (FIRST_NAME, LAST_NAME, START_DATE) values ('JEAN', 'BATEAU', '2003-04-01')";
	public static final String INSERT_EMP2 = "Insert into Employee (FIRST_NAME, LAST_NAME, START_DATE) " + " values ('tttt', 'tttt', '2019-01-01')";
	public static final String DELETE_EMP = "Delete from Employee where FIRST_NAME='JEAN' and LAST_NAME='BATEAU'";
	public static final String UPDATE_EMP = "Update employee set FIRST_NAME = 'John' where First_name = 'Baptiste'";
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection conn = ConnectionUtils.getMySQLConnection();
		
		Statement statement = conn.createStatement();
		
		int rowCount = statement.executeUpdate(UPDATE_EMP);
		
		System.out.println("Row Count affected = "+ rowCount);
		
		}

}
