package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Ordutegiak extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ordutegiak frame = new Ordutegiak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ordutegiak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton Aukeratu = new JButton("Aukeratu");
		Aukeratu.setBounds(335, 10, 89, 23);
		contentPane.add(Aukeratu);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 61, 283, 78);
		contentPane.add(textPane);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(7, 227, 89, 23);
		contentPane.add(btnBueltatu);
	}

}
