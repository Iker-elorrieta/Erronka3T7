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

public class FilmakGetxo extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;
	
	/**
	 * Launch the application.
	 */
	/*Cadena Perpetua,El planeta de los simios,La vida de Brian,Drácula*/
	/**
	 * Create the frame.
	 * @param filmakG 
	 */
	public FilmakGetxo(Filmak[] filmakG) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 316, 73, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblSchindler = new JLabel("La lista de Schindler");
		lblSchindler.setBounds(10, 11, 99, 14);
		contentPane.add(lblSchindler);
		
		JTextArea txtrSchindlerBuscabaHacer = new JTextArea();
		txtrSchindlerBuscabaHacer.setText("Schindler busca hacer fortuna en \r\nla Segunda Guerra Mundial \r\nmediante los nazis.");
		txtrSchindlerBuscabaHacer.setBounds(10, 23, 265, 58);
		contentPane.add(txtrSchindlerBuscabaHacer);
		
		JButton btnSchindler = new JButton("Schindler");
		btnSchindler.setBounds(285, 35, 89, 23);
		contentPane.add(btnSchindler);
		
		JLabel lblFrankenstein = new JLabel("La novia de Frankenstein");
		lblFrankenstein.setBounds(10, 85, 148, 14);
		contentPane.add(lblFrankenstein);
		
		JTextArea txtrContinuacinDeLa = new JTextArea();
		txtrContinuacinDeLa.setText("Continuaci\u00F3n de la historia de \r\nMary Shelley, donde el monstruo\r\nquiere que el Bar\u00F3n haga un amigo.");
		txtrContinuacinDeLa.setBounds(10, 100, 265, 58);
		contentPane.add(txtrContinuacinDeLa);
		
		JButton btnFrankestein = new JButton("Frankenstein");
		btnFrankestein.setBounds(285, 120, 108, 23);
		contentPane.add(btnFrankestein);
		
		JLabel lblLebowsky = new JLabel("El gran Lebowsky");
		lblLebowsky.setBounds(10, 166, 89, 14);
		contentPane.add(lblLebowsky);
		
		JTextArea txtrUnBorrachoDe = new JTextArea();
		txtrUnBorrachoDe.setText("Un borracho de Los \u00C1ngeles y sus \ncompa\u00F1eros son secuestrados.");
		txtrUnBorrachoDe.setBounds(10, 181, 265, 40);
		contentPane.add(txtrUnBorrachoDe);
		
		JButton btnLebowsky = new JButton("El gran Lebowsky");
		btnLebowsky.setBounds(286, 192, 121, 23);
		contentPane.add(btnLebowsky);
		
		JLabel lblresplandor = new JLabel("El resplandor");
		lblresplandor.setBounds(10, 226, 73, 14);
		contentPane.add(lblresplandor);
		
		JButton btnresplandor = new JButton("El resplandor");
		btnresplandor.setBounds(285, 254, 108, 23);
		contentPane.add(btnresplandor);
		
		JTextArea txtrJackTorranceEs = new JTextArea();
		txtrJackTorranceEs.setText("Un hombre que se va a vivir con \nsu familia a un hotel con la \nesperanza de salir del bloqueo \ncreativo de su escritura.");
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
