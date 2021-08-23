package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pageD {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pageD window = new pageD();
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
	public pageD() {
		initialize();
	}
	//doc.SetVisible(true);

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button = new JButton("\u039B\u03AF\u03C3\u03C4\u03B1 \u03C6\u03B1\u03C1\u03BC\u03AC\u03BA\u03C9\u03BD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medlist mel = new medlist();
				
				
				mel.NewScreen();
			}
			
		});
		button.setBounds(134, 29, 143, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u03A3\u03C5\u03BD\u03C4\u03B1\u03B3\u03BF\u03B3\u03C1\u03AC\u03C6\u03B7\u03C3\u03B7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perscription prt = new perscription();
				
				
				prt.NewScreen();
			}
		});
		button_1.setBounds(134, 80, 143, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("\u03A1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03CD");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seedate sed = new seedate();
				
				
				sed.NewScreen();
			}
		});
		button_2.setBounds(134, 129, 143, 23);
		frame.getContentPane().add(button_2);
		
		
	}
}
