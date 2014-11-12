package Radio_BUTTON;

import java.awt.EventQueue;

import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;

public class JON_RADIOBUTTON {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JON_RADIOBUTTON window = new JON_RADIOBUTTON();
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
	public JON_RADIOBUTTON() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(120, 98, 109, 75);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		buttonGroup.add(rdbtnSmall);
		rdbtnSmall.setBounds(0, 0, 109, 23);
		panel.add(rdbtnSmall);
		rdbtnSmall.setSelected(true);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		buttonGroup.add(rdbtnMedium);
		rdbtnMedium.setBounds(0, 26, 109, 23);
		panel.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		buttonGroup.add(rdbtnLarge);
		rdbtnLarge.setBounds(0, 52, 109, 23);
		panel.add(rdbtnLarge);
	}
}
