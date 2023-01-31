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
		setBounds(100, 100, 472, 273);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/*Handia,2001: Odisea en el espacio Duración,Scary movie,Psicosis*/
		JLabel lbl1Filma = new JLabel("HULK");
		lbl1Filma.setBounds(20, 13, 46, 14);
		contentPane.add(lbl1Filma);
		
		JTextArea txtrBruceBannerUn = new JTextArea();
		txtrBruceBannerUn.setText("Bruce Banner,\r\nun investigador de gen\u00E9tica,\r\nabsorbi\u00F3 una dosis letal de rayos gamma.\r\n");
		txtrBruceBannerUn.setBounds(10, 37, 274, 122);
		contentPane.add(txtrBruceBannerUn);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\IN1DAM\\Erronka3T7\\Imagenes\\hulk.jpg"));
		btnNewButton.setBounds(318, 38, 89, 121);
		contentPane.add(btnNewButton);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 200, 89, 23);
		contentPane.add(btnBueltatu);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(439, 0, 17, 234);
		contentPane.add(scrollBar);
		
	}
}
