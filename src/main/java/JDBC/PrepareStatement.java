package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrepareStatement {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int i=1;
		
		Connection conn = ConnectionUtils.getMySQLConnection();
		
		Statement statement = conn.createStatement();
		
		String sql = "Select emp_id, first_name, last_name from employee where employee.first_name like ? and employee.dept_id = ?";
		
		PreparedStatement pstm = conn.prepareStatement(sql);
		
		pstm.setString(1,"%s");
		pstm.setInt(2, 1);
		
		ResultSet rs = pstm.executeQuery();
		
		while(rs.next()) {
			int empId=rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getString("Last_Name");
			System.out.println("=========================="+i++);
			System.out.println("EmpId: "+empId);
			System.out.println("Prenom: "+firstName);
			System.out.println("Nom: "+lastName);
		}
		
		
		}

}

