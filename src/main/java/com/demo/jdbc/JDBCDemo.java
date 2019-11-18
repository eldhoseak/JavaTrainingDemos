package com.demo.jdbc;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException; 
import java.sql.Statement;  

public class JDBCDemo { 
	// JDBC driver name and database URL 
	static final String JDBC_DRIVER = "org.h2.Driver";   
	static final String DB_URL = "jdbc:h2:mem:test_mem";  

	//  Database credentials 
	static final String USER = "sa"; 
	static final String PASS = ""; 
	static Connection conn = null;

	/**
	 * Method to get a DB connection.
	 * @throws Exception
	 */
	static void intializeConnection() throws Exception{

		// Register the JDBC driver.
		Class.forName(JDBC_DRIVER); 

		//Open a connection 
		System.out.println("Connecting to database..."); 
		if(conn == null) {
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		}
	}

	/**
	 * Method to create a table.
	 * @throws Exception
	 */
	private void createTable() throws Exception{
		Statement stmt = conn.createStatement(); 

		// create table statement.
		String sql =  "CREATE TABLE EMPLOYEE " + 
				"(id INTEGER not NULL, " + 
				" first VARCHAR(255), " +  
				" last VARCHAR(255), " +  
				" age INTEGER, " +  
				" PRIMARY KEY ( id ))";  
		stmt.executeUpdate(sql);
		System.out.println("Created table in given database..."); 
	}


	/**
	 * Method to insert sample data in the table.
	 * @throws Exception
	 */
	private void insertData() throws Exception{

		Statement stmt = conn.createStatement();  
		String sql = "INSERT INTO EMPLOYEE " + "VALUES (100, 'David', 'Jones', 30)"; 

		stmt.executeUpdate(sql); 
		sql = "INSERT INTO EMPLOYEE " + "VALUES (101, 'Mark', 'Hall', 35)";  

		stmt.executeUpdate(sql); 
		sql = "INSERT INTO EMPLOYEE " + "VALUES (102, 'Scot', 'Roberts', 39)"; 

		stmt.executeUpdate(sql); 
		sql = "INSERT INTO EMPLOYEE " + "VALUES(103, 'Yoav', 'Keren', 28)"; 

		stmt.executeUpdate(sql); 
		System.out.println("Inserted records into the table..."); 
	}

	/**
	 * Method to read data from the table.
	 * @throws Exception
	 */
	private void readData() throws Exception{
		Statement stmt = conn.createStatement(); 
		String sql = "SELECT id, first, last, age FROM EMPLOYEE"; 
		ResultSet rs = stmt.executeQuery(sql); 

		System.out.println("\n data from table");
		// Extract data from result set 
		while(rs.next()) { 
			// Retrieve by column name 
			int id  = rs.getInt("id"); 
			int age = rs.getInt("age"); 
			String first = rs.getString("first"); 
			String last = rs.getString("last");  

			// Display values 
			System.out.print("ID: " + id); 
			System.out.print(", Age: " + age); 
			System.out.print(", First: " + first); 
			System.out.println(", Last: " + last); 
		} 

	}

	/**
	 * Method to update a record in the table.
	 * @throws Exception
	 */
	private void updateData() throws Exception{

		System.out.println("\n update the data");
		Statement stmt = conn.createStatement(); 
		String sql = "UPDATE EMPLOYEE " + "SET age = 31 WHERE id = 103"; 
		stmt.executeUpdate(sql);  
	}


	public static void main(String[] args) { 
		try {  
			JDBCDemo demo = new JDBCDemo();

			// Initialize connection.
			intializeConnection();

			// create table.
			demo.createTable();

			// insert data
			demo.insertData();

			// read data.
			demo.readData();

			//update data
			demo.updateData();

			// read data again. See result is updated.
			demo.readData();

		} catch(SQLException se) { 
			se.printStackTrace(); 
		} catch(Exception e) { 
			e.printStackTrace(); 
		} finally { 
			// nothing we can do 
			try { 
				if(conn!=null) conn.close(); 
			} catch(SQLException se){ 
				se.printStackTrace(); 
			} //end finally try 
		} 
	} 
}