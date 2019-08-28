package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Connection conn = ConnectionUtils.getMySQLConnection();

		Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

		String sql = "Select a.avail_balance, a.cust_id, i.first_name, i.last_name from individual as i, account as a where i.cust_ID = a.cust_id and i.cust_ID=8";                                
		String sql2 = "Select a.avail_balance, a.cust_id, a.account_id from account as a where a.cust_ID=8";                                

//
//		PreparedStatement pstm = conn.prepareStatement(sql);
//		
//		
//		pstm.setInt(1, 8);
		
		
		ResultSet rs = statement.executeQuery(sql2);
		
		rs.absolute(2);
//		while (rs.next()) {
			float solde = rs.getFloat(1);
			solde = solde + 1000;
			rs.updateFloat(1,solde);
			rs.updateRow();
			
	
			
			
			int custId = rs.getInt(2);
//			String firstName = rs.getString(3);
//			String lastName = rs.getString(4);
//			if (custId == 8) {
				System.out.println("==========================");
				System.out.println("Solde : " +rs.getFloat(1));
				System.out.println("custId: " +custId);
//				System.out.println("Prenom: " + firstName);
//				System.out.println("Nom   : " + lastName);
				
				System.out.println();
				System.out.println("entrez n'importe quoi");	
				sc.nextLine();
				
//				rs.refreshRow();
				
				
				System.out.println("==========================");
				System.out.println("Solde : " +rs.getFloat(1));
				System.out.println("custId: " +custId);
			}

//		}
	}

//}
