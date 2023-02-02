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
		setBounds(100, 100, 472, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 276, 89, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblHandia = new JLabel("Handia");
		lblHandia.setBounds(10, 2, 46, 14);
		contentPane.add(lblHandia);
		
		JLabel lblOdisea = new JLabel("2001: Odisea en el espacio Duraci\u00F3n");
		lblOdisea.setBounds(10, 109, 179, 14);
		contentPane.add(lblOdisea);
		
		JLabel lblScary = new JLabel("Scary movie");
		lblScary.setBounds(10, 163, 58, 14);
		contentPane.add(lblScary);
		
		JLabel lblPsicosis = new JLabel("Psicosis");
		lblPsicosis.setBounds(10, 214, 46, 14);
		contentPane.add(lblPsicosis);
		
		JTextArea txtrEnMartn = new JTextArea();
		txtrEnMartn.setText("1843an, Martin etxera itzuli zen \nLehen Karlistaldian borrokatu \nondoren.Ohartzen da \nbere anaia, ohi baino askoz \naltuagoa dela.");
		txtrEnMartn.setBounds(10, 15, 260, 94);
		contentPane.add(txtrEnMartn);
		
		JButton btnHandia = new JButton("Handia");
		btnHandia.setBounds(289, 46, 89, 23);
		contentPane.add(btnHandia);
		
		JTextArea txtrInspiradaEnLa = new JTextArea();
		txtrInspiradaEnLa.setText("Robert Bloch-en izen bereko \neleberrian oinarritua.");
		txtrInspiradaEnLa.setBounds(10, 227, 260, 40);
		contentPane.add(txtrInspiradaEnLa);
		
		JButton btnOdisea = new JButton("Odisea");
		btnOdisea.setBounds(289, 126, 89, 23);
		contentPane.add(btnOdisea);
		
		JTextArea txtrLaPelculaSupone = new JTextArea();
		txtrLaPelculaSupone.setText("Gizateriaren historiako hainbat\ngaraitako \"bidaia\" da filma.");
		txtrLaPelculaSupone.setBounds(10, 125, 260, 40);
		contentPane.add(txtrLaPelculaSupone);
		
		JTextArea txtrEsUnaPelcula = new JTextArea();
		txtrEsUnaPelcula.setText("2000. urteko umore beltzeko \nfilm estatubatuarra da.");
		txtrEsUnaPelcula.setBounds(10, 176, 260, 40);
		contentPane.add(txtrEsUnaPelcula);
		
		JButton btnScary = new JButton("Scary Movie");
		btnScary.setBounds(289, 177, 101, 23);
		contentPane.add(btnScary);
		
		JButton btnPsicosis = new JButton("Psicosis");
		btnPsicosis.setBounds(289, 236, 89, 23);
		contentPane.add(btnPsicosis);
		
	}
}
