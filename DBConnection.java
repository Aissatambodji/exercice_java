package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
private static  String driver="com.mysql.cj.jdbc.Drivers";
private static String urlDB="jdbc:mysql://localhost:3306/gestion_medicaments";
private static String user="root";
private static String password="";
private static Connection  con;
public static Connection getConnection()  throws ClassNotFoundException{
			try {
				Class.forName(driver);
				con=DriverManager.getConnection(urlDB, user, password);
				System.out.println("connexion reusssie");
				return con;
				
			} catch (SQLException e) {
				System.out.println("erreur de connexion"+e.getMessage());
				return null;
			}
}
}

