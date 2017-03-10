package testProject3;

import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
	Connection con=null;
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:/home/dom/workspace/test_darabase.sqlite");
			JOptionPane.showMessageDialog(null, "Connection succesfull to database");
			return con;
		
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}

		
		
		
	}
}