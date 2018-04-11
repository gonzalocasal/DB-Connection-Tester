package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	private static final String FAILED = "CONNECTION FAILED";
	private static final String SUCCESS = "CONNECTION SUCCESS";
	private static final String ERROR = "ERROR TRYING TO CONNECT";

	private static final String MYSQL = "MySql";
	private static final String JDBC_MYSQL = "jdbc:mysql://";
	private static final String JDBC_MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	
	private static final String ORACLE = "oracle";
	private static final String JDBC_ORACLE = "jdbc:oracle:thin:@";
	private static final String JDBC_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	private static final String MSSQL = "mssql";
	private static final String JDBC_MSSQL = "jdbc:sqlserver://";
	private static final String JDBC_MSSQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private static final String POSTGRE = "postgre";
	private static final String JDBC_POSTGRE = "jdbc:postgresql://";
	private static final String JDBC_POSTGRE_DRIVER = "org.postgresql.Driver";
	
	private static final String HIVE1 = "hive1";
	private static final String JDBC_HIVE = "jdbc:hive://";
	private static final String JDBC_HIVE_DRIVER = "org.apache.hive.jdbc.HiveDriver";
	
	private static final String HIVE2 = "hive2";
	private static final String JDBC_HIVE2 = "jdbc:hive2://";
	private static final String JDBC_HIVE2_DRIVER = "org.apache.hive.jdbc.HiveDriver";

	
	public static void main(String[] args) {

		  	String driver = args[0];
		  	String host   = args[1];
			String user   = args[2];
			String pass   = args[3];
			
			Connection connection = null;
			
			if(MYSQL.equalsIgnoreCase(driver)) {
				registerDriver(JDBC_MYSQL_DRIVER);
				connection = connect(JDBC_MYSQL,host,user,pass);
			}
			
			if(ORACLE.equalsIgnoreCase(driver)) {
				registerDriver(JDBC_ORACLE_DRIVER);
				connection = connect(JDBC_ORACLE,host,user,pass);
			}
			
			if(MSSQL.equalsIgnoreCase(driver)) {
				registerDriver(JDBC_MSSQL_DRIVER);
				connection = connect(JDBC_MSSQL,host,user,pass);
			}
			
			if(POSTGRE.equalsIgnoreCase(driver)) {
				registerDriver(JDBC_POSTGRE_DRIVER);
				connection = connect(JDBC_POSTGRE,host,user,pass);
			}
			
			if(HIVE1.equalsIgnoreCase(driver)) {
				registerDriver(JDBC_HIVE_DRIVER);
				connection = connect(JDBC_HIVE,host,user,pass);
			}
			
			if(HIVE2.equalsIgnoreCase(driver)) {
				registerDriver(JDBC_HIVE2_DRIVER);
				connection =  connect(JDBC_HIVE2,host,user,pass);
			}
			
			String result = (connection != null) ? SUCCESS : FAILED;
			System.out.println(result);
	
	}
	
	private static void registerDriver(String driver) {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static Connection connect(String jdbc, String host, String user, String pass) {
		Connection connection = null;
		try {
			System.out.println("Connecting to: "+jdbc + host);
			connection = DriverManager.getConnection(jdbc + host,user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(ERROR);
			return null;
		}
		return connection;
	
	}
	
	
}
