package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TraitementExemple {

	private static void creditCompte(Connection conn, double credit) throws SQLException {

		PreparedStatement pstm = conn.prepareStatement("update account set avail_balance = avail_balance + ? where account_id = 19");
//			PreparedStatement pstm = conn.prepareStatement(constantes.UPDATE_EMPLOYEE);
		pstm.setDouble(1, credit);
		pstm.executeUpdate();

	}

	private static void debitCompte(Connection conn, double debit) throws SQLException {

		PreparedStatement pstm = conn.prepareStatement("update account set avail_balance = avail_balance - ? where account_id = 18");
		pstm.setDouble(1, debit);
		pstm.executeUpdate();

	}

	public static void main(String[] args) {

		try {
			Connection conn = ConnectionUtils.getMySQLConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Quel montant voulez vous transférer ?");
			double montant = sc.nextDouble();
			creditCompte(conn, montant);
			debitCompte(conn, montant);
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
