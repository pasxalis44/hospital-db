package project;

import java.awt.EventQueue;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class doclist extends test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					doclist window = new doclist();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public doclist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 11, 382, 85);
		try {
			 	String url = "jdbc:mysql://localhost:3306/project?autoReconnect=true&useSSL=false";//localhost:3306/Peoples?autoReconnect=true&useSSL=false
		        String username = "root";
				String password = "password";
				String prints ;  
		        	
		            Connection con = getConnection(username,password);
		            PreparedStatement statement = con.prepareStatement("SELECT * FROM doc ORDER BY idDoc ASC LIMIT 99");
		           
		            ResultSet result = statement.executeQuery();
		           
		            ArrayList<String> array = new ArrayList<String>();
		            while(result.next()){
		            	prints=result.getString("DocName");
		            	textArea.setText("doctor's name : ");
		            	textArea.setText(result.getString("DocName"));
		            	textArea.setText(" doctor's title :");
		            	textArea.setText(result.getString("DocTitle"));
		            	textArea.setText(prints);
		            	//textArea.setText(prints);
		            	array.add(result.getString("idDoc"));
		            }
		        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.getContentPane().add(textArea);
	}
}
