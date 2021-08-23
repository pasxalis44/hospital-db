package project;



import java.awt.Color;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;

public class test1 {

	public static void main(String[] args) {
		MyCompoFrame frame  = new MyCompoFrame();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
	class MyCompoFrame extends JFrame{
		
		MyCompoFrame(){
			this.setSize(400,300);
			this.setTitle("red");
			this.getContentPane().setBackground(Color.GRAY );
			this.setLayout(null);
			JLabel label = new JLabel("First name");
			label.setBounds(10,20,500,50);
			this.add(label);
			JTextField text = new JTextField();
			text.setBounds(130,20,100,25);
			add(text);
			JButton btn = new JButton();
			btn.setBounds(90,20,39,39);
			add(btn);
			MyListener btnListener = new MyListener();
			btn.addActionListener(btnListener);
		}
}
	class MyListener extends test implements ActionListener{
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null,"0_0");
			Scanner met = new Scanner(System.in);
			System.out.println("Enter username:");
			String uName = met.nextLine();
			System.out.println("Enter password:");
			String pass = met.nextLine();
			
			try {
				getdoctors(uName,pass);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}