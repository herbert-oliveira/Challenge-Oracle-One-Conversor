import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class conversorDeMoedas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					conversorDeMoedas window = new conversorDeMoedas();
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
	public conversorDeMoedas() {
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
		
		JLabel lblNewLabel = new JLabel("...conversor de moedas");
		lblNewLabel.setBounds(10, 11, 123, 26);
		frame.getContentPane().add(lblNewLabel);
	}

}
