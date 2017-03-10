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
		
		JButton btnNewButton_receptie = new JButton("New button");
		add(btnNewButton_receptie);
		
		JButton btnNewButton_cabinete = new JButton("New button");
		add(btnNewButton_cabinete);
		
		JButton btnNewButton_LabAnalize = new JButton("New button");
		add(btnNewButton_LabAnalize);
		
		JButton btnNewButton_LabRadiologie = new JButton("New button");
		add(btnNewButton_LabRadiologie);
		
		btnNewButton_LabRadiologie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				try{
					Receptie receptie = new Receptie();
					Login.frame.setContentPane(receptie);
				} catch (Exception ex){
					JOptionPane.showMessageDialog(null, ex);
				} 
			}
		});
		
		btnNewButton_LabRadiologie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				try{
					LaboratorRadiologie radiologie = new LaboratorRadiologie();
					Login.frame.setContentPane(radiologie);
				} catch (Exception ex){
					JOptionPane.showMessageDialog(null, ex);
				} 
			}
		});
		
		btnNewButton_LabAnalize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				try{
					LaboratorAnalize analize = new LaboratorAnalize();
					Login.frame.setContentPane(analize);
				} catch (Exception ex){
					JOptionPane.showMessageDialog(null, ex);
				} 
			}
		});
		
		btnNewButton_cabinete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				try{
					Cabinete cabinete = new Cabinete();
					Login.frame.setContentPane(cabinete);
				} catch (Exception ex){
					JOptionPane.showMessageDialog(null, ex);
				} 
			}
		});
		
		btnNewButton_receptie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				try{
					Receptie receptie = new Receptie();
					Login.frame.setContentPane(receptie);
				} catch (Exception ex){
					JOptionPane.showMessageDialog(null, ex);
				} 
			}
		});
	}
		
		
		

	

}
