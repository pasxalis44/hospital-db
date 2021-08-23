package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class insertcust extends test  {

	private JFrame frame;
	private JTextField textFieldName;
	private JTextField textFieldPhone;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertcust window = new insertcust();
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
	public insertcust() {
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
		
		textFieldName = new JTextField();
		textFieldName.setBounds(94, 52, 237, 30);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(94, 93, 237, 30);
		frame.getContentPane().add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String username = "root";
				String password = "password";
		        try {
					Connection con = getConnection(username,password);
					
					
					
					//PreparedStatement posted = con.prepareStatement("INSERT INTO `project`.`customers` (customersPhone ,customersName) VALUES ('"+phone+"','"+Name+"')");
					
					//posted.executeUpdate();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(94, 147, 237, 57);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		label.setBounds(10, 60, 74, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		label_1.setBounds(10, 101, 74, 14);
		frame.getContentPane().add(label_1);
	}
}
