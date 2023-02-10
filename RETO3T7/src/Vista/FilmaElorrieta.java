package Vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filma;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FilmaElorrieta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Filma[] filmak = null;
	Zinema vent;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param filmak 
	 */
	public FilmaElorrieta(Filma[] filmakE) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ELORRIETA ZINEMA");
		setBounds(100, 100, 472, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				vent = new Zinema(); //enlace con la siguiente ventana(creacion)
				vent.setVisible(true); //despues de 3 segs vemos la ventana
				dispose(); //cerrar ventana actual (si cierras lade ahora se deja la antetior(volver))
			}
		});
		btnBueltatu.setBounds(10, 276, 101, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblHandia = new JLabel("Handia");
		lblHandia.setBounds(10, 2, 64, 14);
		contentPane.add(lblHandia);
		
		JLabel lblOdisea = new JLabel("2001: Odisea en el espacio Duraci\u00F3n");
		lblOdisea.setBounds(10, 109, 232, 14);
		contentPane.add(lblOdisea);
		
		JLabel lblScary = new JLabel("Scary movie");
		lblScary.setBounds(10, 163, 101, 14);
		contentPane.add(lblScary);
		
		JLabel lblPsicosis = new JLabel("Psicosis");
		lblPsicosis.setBounds(10, 214, 89, 14);
		contentPane.add(lblPsicosis);
		
		JTextArea txtrEnMartn = new JTextArea();
		txtrEnMartn.setEditable(false);
		txtrEnMartn.setText("1843an, Martin etxera itzuli zen \nLehen Karlistaldian borrokatu \nondoren.Ohartzen da \nbere anaia, ohi baino askoz \naltuagoa dela.");
		txtrEnMartn.setBounds(10, 15, 260, 94);
		contentPane.add(txtrEnMartn);
		
		JButton btnHandia = new JButton("Handia");
		btnHandia.setBounds(289, 46, 89, 23);
		contentPane.add(btnHandia);
		
		JTextArea txtrInspiradaEnLa = new JTextArea();
		txtrInspiradaEnLa.setEditable(false);
		txtrInspiradaEnLa.setText("Robert Bloch-en izen bereko \neleberrian oinarritua.");
		txtrInspiradaEnLa.setBounds(10, 227, 260, 40);
		contentPane.add(txtrInspiradaEnLa);
		
		JButton btnOdisea = new JButton("Odisea");
		btnOdisea.setBounds(289, 126, 89, 23);
		contentPane.add(btnOdisea);
		
		JTextArea txtrLaPelculaSupone = new JTextArea();
		txtrLaPelculaSupone.setEditable(false);
		txtrLaPelculaSupone.setText("Gizateriaren historiako hainbat\ngaraitako \"bidaia\" da filma.");
		txtrLaPelculaSupone.setBounds(10, 125, 260, 40);
		contentPane.add(txtrLaPelculaSupone);
		
		JTextArea txtrEsUnaPelcula = new JTextArea();
		txtrEsUnaPelcula.setEditable(false);
		txtrEsUnaPelcula.setText("2000. urteko umore beltzeko \nfilm estatubatuarra da.");
		txtrEsUnaPelcula.setBounds(10, 176, 260, 40);
		contentPane.add(txtrEsUnaPelcula);
		
		JButton btnScary = new JButton("Scary Movie");
		btnScary.setBounds(289, 177, 110, 23);
		contentPane.add(btnScary);
		
		JButton btnPsicosis = new JButton("Psicosis");
		btnPsicosis.setBounds(289, 236, 89, 23);
		contentPane.add(btnPsicosis);
		
	}

	public Filma[] getFilmak() {
		return filmak;
	}

	public void setFilmak(Filma[] filmak) {
		this.filmak = filmak;
	}
}
