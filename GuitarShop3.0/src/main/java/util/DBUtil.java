package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

	public class DBUtil {
		static Connection conn = null;  
	    static PreparedStatement pst = null; 
	    
		public static Connection getSqliteConnection(){
		    try {
		    	Class.forName("org.sqlite.JDBC");
		    	conn = DriverManager.getConnection("jdbc:sqlite:C:/guitars.db");        
		        return conn;
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    return null; 
	    }
		public static Connection getMysqlConnection(){
				try {  
		            Class.forName("com.mysql.jdbc.Driver");//指定连接类型  
		            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/guitar", "root", "123456");//获取连接  
		            return conn;
				} catch (Exception e) {  
		            e.printStackTrace();  
		        }  
			return null;
	    }
	

	} 
	
	
