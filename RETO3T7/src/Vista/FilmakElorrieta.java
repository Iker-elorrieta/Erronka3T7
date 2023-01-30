package Vista;

import java.awt.EventQueue;

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

public class FilmakElorrieta extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param filmak 
	 */
	public FilmakElorrieta(Filmak[] filmakE) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setPreferredSize(preferredSize());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1Filma = new JLabel("HULK");
		lbl1Filma.setBounds(10, 11, 46, 14);
		contentPane.add(lbl1Filma);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 38, 102, 122);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\IN1DAM\\Erronka3T7\\Imagenes\\hulk.jpg"));
		contentPane.add(lblNewLabel);
		
		JTextArea txtrBruceBannerUn = new JTextArea();
		txtrBruceBannerUn.setText("Bruce Banner,\r\nun investigador de gen\u00E9tica,\r\nabsorbi\u00F3 una dosis letal de rayos gamma.\r\n");
		txtrBruceBannerUn.setBounds(133, 38, 274, 122);
		contentPane.add(txtrBruceBannerUn);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(417, 0, 17, 261);
		contentPane.add(scrollBar);
	}
}
