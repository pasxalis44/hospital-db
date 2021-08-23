package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PageR {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PageR window = new PageR();
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
	public PageR() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame= new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u03A0\u03C1\u03BF\u03B2\u03BF\u03BB\u03AE \u03C1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03CD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				seedate see = new seedate();
				
				
				see.NewScreen();
			}
		});
		button.setBounds(146, 28, 169, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03B1\u03C3\u03B8\u03B5\u03BD\u03CE\u03BD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertcust inc= new insertcust();
				
				
				inc.NewScreen();
			}
		});
		button_1.setBounds(146, 74, 169, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u039B\u03AF\u03C3\u03C4\u03B1 \u03B3\u03B9\u03B1\u03C4\u03C1\u03CE\u03BD");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doclist  dol= new doclist();
				
				
				dol.NewScreen();
			}
		});
		button_2.setBounds(146, 119, 169, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\u0395\u03C6\u03B7\u03BC\u03B5\u03C1\u03B5\u03CD\u03BF\u03BD\u03C4\u03B1 \u039D\u03BF\u03C3\u03BF\u03BA\u03BF\u03BC\u03B5\u03AF\u03B1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hospitals hos = new hospitals();
				
				
				hos.NewScreen();
			}
		});
		button_3.setBounds(146, 169, 169, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03C1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03CD");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertdate ind = new insertdate();
				
				
				ind.NewScreen();
			}
		});
		button_4.setBounds(146, 215, 169, 23);
		frame.getContentPane().add(button_4);
	}
}
