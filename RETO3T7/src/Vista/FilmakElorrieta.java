package Vista;

import java.awt.Component;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FilmakElorrieta extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;
	Zinemak vent;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param filmak 
	 */
	public FilmakElorrieta(Filmak[] filmakE) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 310, 89, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblHandia = new JLabel("Handia");
		lblHandia.setBounds(10, 2, 46, 14);
		contentPane.add(lblHandia);
		
		JLabel lblOdisea = new JLabel("2001: Odisea en el espacio Duraci\u00F3n");
		lblOdisea.setBounds(10, 98, 179, 14);
		contentPane.add(lblOdisea);
		
		JLabel lblScary = new JLabel("Scary movie");
		lblScary.setBounds(10, 181, 58, 14);
		contentPane.add(lblScary);
		
		JLabel lblPsicosis = new JLabel("Psicosis");
		lblPsicosis.setBounds(10, 246, 46, 14);
		contentPane.add(lblPsicosis);
		
		JTextArea txtrEnMartn = new JTextArea();
		txtrEnMartn.setText("En 1843, \nMart\u00EDn vuelve a su casa \ndespu\u00E9s de haber luchado \nen la Primera Guerra Carlista.");
		txtrEnMartn.setBounds(10, 15, 257, 76);
		contentPane.add(txtrEnMartn);
		
		JButton btnHandia = new JButton("Handia");
		btnHandia.setBounds(277, 46, 89, 23);
		contentPane.add(btnHandia);
		
		JTextArea txtrInspiradaEnLa = new JTextArea();
		txtrInspiradaEnLa.setText("Inspirada en la novela hom\u00F3nima \r\nde Robert Bloch.");
		txtrInspiradaEnLa.setBounds(10, 259, 257, 40);
		contentPane.add(txtrInspiradaEnLa);
		
		JButton btnOdisea = new JButton("Odisea");
		btnOdisea.setBounds(277, 131, 89, 23);
		contentPane.add(btnOdisea);
		
		JTextArea txtrLaPelculaSupone = new JTextArea();
		txtrLaPelculaSupone.setText("La pel\u00EDcula supone un \"viaje\" a \r\ntrav\u00E9s de diferentes periodos \r\nde la historia de la humanidad.");
		txtrLaPelculaSupone.setBounds(10, 112, 257, 58);
		contentPane.add(txtrLaPelculaSupone);
		
		JTextArea txtrEsUnaPelcula = new JTextArea();
		txtrEsUnaPelcula.setText("Es una pel\u00EDcula estadounidense \nde humor negro del a\u00F1o 2000.");
		txtrEsUnaPelcula.setBounds(10, 195, 257, 40);
		contentPane.add(txtrEsUnaPelcula);
		
		JButton btnScary = new JButton("Scary Movie");
		btnScary.setBounds(277, 206, 101, 23);
		contentPane.add(btnScary);
		
		JButton btnPsicosis = new JButton("Psicosis");
		btnPsicosis.setBounds(277, 271, 89, 23);
		contentPane.add(btnPsicosis);
		
	}
}
