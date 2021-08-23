package project;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test2 {

	public JFrame frame;
	private JFrame AFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2 window = new test2();
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
	public test2() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 528, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u03A0\u03B1\u03C1\u03B1\u03BA\u03B1\u03BB\u03CE \u03B5\u03C0\u03B5\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03BC\u03B9\u03B1 \u03B1\u03C0\u03CC \u03C4\u03B9\u03C2 \u03C0\u03B1\u03C1\u03B1\u03BA\u03AC\u03C4\u03C9 \u03B5\u03C0\u03B9\u03BB\u03BF\u03B3\u03AD\u03C2:");
		label.setBounds(66, 11, 332, 84);
		frame.getContentPane().add(label);
		
		JButton button = new JButton("\u0395\u03C0\u03B9\u03C3\u03BA\u03AD\u03C0\u03C4\u03B7\u03C2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pageC cust = new pageC();
				
				
				cust.NewScreen();
			}
		});
		button.setBounds(198, 124, 117, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u03A1\u03B5\u03C3\u03B5\u03C8\u03B9\u03CC\u03BD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PageR  rec = new PageR();
				
				rec.NewScreen();
			}
		});
		button_1.setBounds(198, 200, 117, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u0393\u03B9\u03B1\u03C4\u03C1\u03CC\u03C2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pageD doc = new pageD();
				
				doc.NewScreen();
				
			}
		});
		button_2.setBounds(198, 269, 117, 23);
		frame.getContentPane().add(button_2);
		ButtonGroup memory = new ButtonGroup();
	}

	}
