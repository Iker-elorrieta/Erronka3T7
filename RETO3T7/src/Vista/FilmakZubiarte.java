package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

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
		setBounds(100, 100, 497, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 392, 89, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblBaby = new JLabel("Million Dollar Baby");
		lblBaby.setBounds(10, 11, 89, 14);
		contentPane.add(lblBaby);
		
		JTextArea txtrFrankieDunnEntrenatzailea = new JTextArea();
		txtrFrankieDunnEntrenatzailea.setText("Frankie Dunn entrenatzailea \nMaggie Fitzgerald entrenatzen \namaitu du, zakarra eta neskak \nez entrenatzeko araua den arren.");
		txtrFrankieDunnEntrenatzailea.setBounds(10, 25, 276, 76);
		contentPane.add(txtrFrankieDunnEntrenatzailea);
		
		JButton btnBaby = new JButton("Million Dollar Baby");
		btnBaby.setBounds(320, 55, 134, 23);
		contentPane.add(btnBaby);
		
		JLabel lblNewLabel_1 = new JLabel("Alien, el octavo pasajero");
		lblNewLabel_1.setBounds(10, 100, 134, 14);
		contentPane.add(lblNewLabel_1);
		
		JTextArea txtrAlienElOctavo = new JTextArea();
		txtrAlienElOctavo.setText("Nostromo atoiontzi espazialeko \ntripulazioak sorospen-seinale bati \nerantzuten dio eta,estralurtar \nhilgarri bat igotzen du.");
		txtrAlienElOctavo.setBounds(10, 112, 276, 74);
		contentPane.add(txtrAlienElOctavo);
		
		JButton btnNewButton = new JButton("Alien, el octavo pasajero");
		btnNewButton.setBounds(320, 124, 151, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Aterriza como puedas");
		lblNewLabel.setBounds(10, 186, 116, 14);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrLosAngelesetikChicagorako = new JTextArea();
		txtrLosAngelesetikChicagorako.setText("Los Angelesetik Chicagorako \nhegaldi batean,hegazkin komertzial \nbateko tripulazioa, bi pilotuak \nbarne,gaixo erori ziren elikagaien \nintoxikazioaren ondorioz.");
		txtrLosAngelesetikChicagorako.setBounds(10, 200, 276, 94);
		contentPane.add(txtrLosAngelesetikChicagorako);
		
		JButton btnNewButton_1 = new JButton("Aterriza como puedas");
		btnNewButton_1.setBounds(320, 201, 151, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 294, 46, 14);
		contentPane.add(lblNewLabel_2);
	}

}
