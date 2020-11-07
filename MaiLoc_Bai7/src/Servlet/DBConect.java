package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletOutputStream;

public class DBConect {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:sqlserver://localhost:1433;databaseName=UploadFileServletDB";
		String user="sa";
		String password="sapassword";
		Connection con=DriverManager.getConnection(url, user, password);
		
		System.out.println(con.toString());
	}

}
