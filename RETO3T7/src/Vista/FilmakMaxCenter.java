package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;

public class FilmakMaxCenter extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;

	/**
	 * Launch the application.
	 */
	

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
	}

}
