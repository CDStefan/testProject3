package testProject3;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.miginfocom.swing.MigLayout;

public class PanelOptions extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelOptions() {
		setLayout(new GridLayout(0, 4, 0, 0));
		
		JButton btnNewButton_3 = new JButton("New button");
		add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
	}
		
		
		

	

}
