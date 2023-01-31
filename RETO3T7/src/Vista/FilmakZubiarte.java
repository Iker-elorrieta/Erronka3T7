package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;
import javax.swing.JButton;

public class FilmakZubiarte extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;

	/**
	 * Launch the application.
	 */
	/*Million Dollar Baby,Alien, el octavo pasajero,Aterriza como puedas,Cisne negro*/
	/**
	 * Create the frame.
	 * @param filmakZ 
	 */
	public FilmakZubiarte(Filmak[] filmakZ) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 227, 89, 23);
		contentPane.add(btnBueltatu);
	}

}
