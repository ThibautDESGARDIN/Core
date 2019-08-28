package fr.formation.inti.utils;

import java.sql.Connection;
import java.sql.SQLException;

import JDBC.ConnectionUtils;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Get Connection ...");

		Connection conn = ConnectionUtils.getMySQLConnection();
		System.out.println("Get connection " + conn);

		System.out.println("Done !");
	}

}
