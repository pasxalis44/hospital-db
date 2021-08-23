package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pageC {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageC window = new pageC();
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
	public pageC() {
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
		
		JButton btnNewButton = new JButton("\u03A0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03AC \u03C1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03CD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PersonalDate perd = new PersonalDate();
				
				
				perd.NewScreen();
			}
		});
		btnNewButton.setBounds(116, 36, 186, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u03A0\u03C1\u03BF\u03C3\u03C9\u03C0\u03B9\u03BA\u03AD\u03C2 \u03C3\u03C5\u03BD\u03C4\u03B1\u03B3\u03BF\u03B3\u03C1\u03B1\u03C6\u03AE\u03C3\u03B5\u03B9\u03C2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PersonalPer per = new PersonalPer();
			
			
			per.NewScreen();
				
			}
		});
		btnNewButton_1.setBounds(116, 124, 186, 23);
		frame.getContentPane().add(btnNewButton_1);
	}

}
