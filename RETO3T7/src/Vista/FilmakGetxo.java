package Vista;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;

public class FilmakGetxo extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;
	
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param filmakG 
	 */
	public FilmakGetxo(Filmak[] filmakG) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
	}

}
