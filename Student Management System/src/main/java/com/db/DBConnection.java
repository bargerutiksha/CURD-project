package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

//	connection of db
	
	public static Connection getConnection(){  
		 Connection con=null;  
	        try{  

	        	// Register JDBC driver
		         Class.forName("com.mysql.cj.jdbc.Driver");

		         // Open a connection
		          con = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "root");
		          
	        }catch(Exception e){System.out.println(e);}  
	        return con;  
	    }  
	
	
	
	
}