package Vista;

import java.awt.EventQueue;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FilmakGetxo extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;
	Zinemak vent;
	/**
	 * Launch the application.
	 */
	/*Cadena Perpetua,El planeta de los simios,La vida de Brian,Drácula*/
	/**
	 * Create the frame.
	 * @param filmakG 
	 */
	public FilmakGetxo(Filmak[] filmakG) {
		setTitle("GETXO ZINEMA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vent = new Zinemak(); //enlace con la siguiente ventana(creacion)
				vent.setVisible(true); //despues de 3 segs vemos la ventana
				dispose(); //cerrar ventana actual (si cierras lade ahora se deja la antetior(volver))
			}
		});
		btnBueltatu.setBounds(10, 316, 89, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblSchindler = new JLabel("La lista de Schindler");
		lblSchindler.setBounds(10, 11, 115, 14);
		contentPane.add(lblSchindler);
		
		JTextArea txtrSchindlerBuscabaHacer = new JTextArea();
		txtrSchindlerBuscabaHacer.setEditable(false);
		txtrSchindlerBuscabaHacer.setText("Schindlerrek dirutza egin nahi \ndu nazien bidez Bigarren Mundu \nGerran.");
		txtrSchindlerBuscabaHacer.setBounds(10, 23, 265, 58);
		contentPane.add(txtrSchindlerBuscabaHacer);
		
		JButton btnSchindler = new JButton("Schindler");
		btnSchindler.setBounds(285, 35, 89, 23);
		contentPane.add(btnSchindler);
		
		JLabel lblFrankenstein = new JLabel("La novia de Frankenstein");
		lblFrankenstein.setBounds(10, 85, 148, 14);
		contentPane.add(lblFrankenstein);
		
		JTextArea txtrContinuacinDeLa = new JTextArea();
		txtrContinuacinDeLa.setEditable(false);
		txtrContinuacinDeLa.setText("Mary Shelleyren historiaren \njarraipena. Baroiak lagun bat \negitea nahi du munstroak.");
		txtrContinuacinDeLa.setBounds(10, 100, 265, 58);
		contentPane.add(txtrContinuacinDeLa);
		
		JButton btnFrankestein = new JButton("Frankenstein");
		btnFrankestein.setBounds(285, 120, 108, 23);
		contentPane.add(btnFrankestein);
		
		JLabel lblLebowsky = new JLabel("El gran Lebowsky");
		lblLebowsky.setBounds(10, 166, 115, 14);
		contentPane.add(lblLebowsky);
		
		JTextArea txtrUnBorrachoDe = new JTextArea();
		txtrUnBorrachoDe.setEditable(false);
		txtrUnBorrachoDe.setText("Los Angelesko mozkor bat eta \nharen lagunak bahitu dituzte.");
		txtrUnBorrachoDe.setBounds(10, 181, 265, 40);
		contentPane.add(txtrUnBorrachoDe);
		
		JButton btnLebowsky = new JButton("El gran Lebowsky");
		btnLebowsky.setBounds(286, 192, 138, 23);
		contentPane.add(btnLebowsky);
		
		JLabel lblresplandor = new JLabel("El resplandor");
		lblresplandor.setBounds(10, 226, 89, 14);
		contentPane.add(lblresplandor);
		
		JButton btnresplandor = new JButton("El resplandor");
		btnresplandor.setBounds(285, 254, 121, 23);
		contentPane.add(btnresplandor);
		
		JTextArea txtrJackTorranceEs = new JTextArea();
		txtrJackTorranceEs.setEditable(false);
		txtrJackTorranceEs.setText("Familiarekin hotel batera \nbizitzera joan da gizon bat, \nbere idazkeraren sormenezko \nblokeotik ateratzeko asmoz.");
		txtrJackTorranceEs.setBounds(10, 239, 265, 73);
		contentPane.add(txtrJackTorranceEs);
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
