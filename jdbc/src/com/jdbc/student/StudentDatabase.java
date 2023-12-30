package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDatabase {
	
	private static Connection  connection;

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/jdbcdb";
			String user ="root";
			String password="E$$Loy21@";
			connection=DriverManager.getConnection(dbUrl, user, password);
			PreparedStatement statement=connection.prepareStatement("select *from student");
			ResultSet rows=statement.executeQuery();
			while(rows.next()) {
				String name = rows.getString(2);
				String name1=name;
				String name2=name1;
				System.out.println(name2);
			}
		}catch(Exception ex) {
			System.out.println("something wrong happened");
		}
		
		
	}

}
