package testProject3;

import java.sql.*;
import javax.swing.*;

public class sqliteConnection {
	Connection con=null;
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			JOptionPane.showMessageDialog(null, "Connection succesfull to database");
			return con;
		
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
			
		}

		
		
		
	}
	public static Connection setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		return null;
	}
}