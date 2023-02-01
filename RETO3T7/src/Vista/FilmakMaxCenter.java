package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FilmakMaxCenter extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;

	/**
	 * Launch the application.
	 */
	/*La lista de Schindler,La novia de Frankenstein,El gran Lebowsky,El resplandor*/

	/**
	 * Create the frame.
	 * @param filmak 
	 */
	public FilmakMaxCenter(Filmak[] filmakM) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 227, 89, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 8, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(298, 23, 89, 23);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 22, 257, 41);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 93, 257, 22);
		contentPane.add(textArea_1);
	}

}
