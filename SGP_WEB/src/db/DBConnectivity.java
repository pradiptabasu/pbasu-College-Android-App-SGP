package db;

import java.sql.*;

import java.lang.*;

public class DBConnectivity {

	public static Connection getCon() {

		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://ec2-3-17-74-12.us-east-2.compute.amazonaws.com:3306/sgp", "root", "root");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return con;

	}

}
