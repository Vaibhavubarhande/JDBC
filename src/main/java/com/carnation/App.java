package com.carnation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver"); // Mobile (cntrl+shift+T) and driver
		String url = "jdbc:mysql://localhost:3306/day1";
		String username = "root";
		String password = "root";

		Connection connection = DriverManager.getConnection(url, username, password); // connection
		Statement stmt = connection.createStatement(); // Statement
		ResultSet rs = stmt.executeQuery("SELECT * FROM school"); // query

		while (rs.next()) { // agar data hai to---checked by next method

			System.out.println(rs.getInt("roll_no") + " " + rs.getString("name") + " " + rs.getString("city"));
		}
		connection.close(); // cut
	}
}
