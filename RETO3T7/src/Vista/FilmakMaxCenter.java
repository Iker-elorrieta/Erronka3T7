package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FilmakMaxCenter extends JFrame {

	private JPanel contentPane;
	private Filmak[] filmak = null;

	/**
	 * Launch the application.
	 */
	/*La lista de Schindler,La novia de Frankenstein,El gran Lebowsky,El resplandor*/

	/**
	 * Create the frame.
	 * @param filmak 
	 */
	public FilmakMaxCenter(Filmak[] filmakM) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(10, 366, 89, 23);
		contentPane.add(btnBueltatu);
		
		JLabel lblSimios = new JLabel("El planeta de los simios");
		lblSimios.setBounds(10, 8, 109, 14);
		contentPane.add(lblSimios);
		
		JButton btnSimios = new JButton("El planeta de los simios");
		btnSimios.setBounds(294, 46, 149, 23);
		contentPane.add(btnSimios);
		
		JTextArea txtrEnUnaMisin = new JTextArea();
		txtrEnUnaMisin.setText("Ohiko misio batean, astronauta \nbat planeta bitxi batera iritsi \nda. Tximinoek gobernatzen dute \nplaneta hau.");
		txtrEnUnaMisin.setBounds(10, 22, 274, 76);
		contentPane.add(txtrEnUnaMisin);
		
		JLabel lblBrian = new JLabel("La vida de Brian");
		lblBrian.setBounds(10, 99, 89, 14);
		contentPane.add(lblBrian);
		
		JTextArea txtrEnLapoca = new JTextArea();
		txtrEnLapoca.setText("Bibliaren garaian, badirudi \ngizon bat Mesias dela, eta \nerlijio-mugimendu baten \nburuzagitzat ikusten da.");
		txtrEnLapoca.setBounds(10, 115, 274, 72);
		contentPane.add(txtrEnLapoca);
		
		JButton btnBrian = new JButton("La vida de Brian");
		btnBrian.setBounds(298, 140, 149, 23);
		contentPane.add(btnBrian);
		
		JLabel lblCadena = new JLabel("Cadena Perpetua");
		lblCadena.setBounds(10, 190, 89, 14);
		contentPane.add(lblCadena);
		
		JTextArea txtrAndrewDufresneGizon = new JTextArea();
		txtrAndrewDufresneGizon.setText("Emaztearen hilketa leporatu \ndiote Andrew Dufresne gizon \nerrugabeari. Eta betiko \nkartzela-zigorra ezarri diote.");
		txtrAndrewDufresneGizon.setBounds(10, 205, 274, 72);
		contentPane.add(txtrAndrewDufresneGizon);
		
		JButton btnCadena = new JButton("Cadena Perpetua");
		btnCadena.setBounds(298, 229, 149, 23);
		contentPane.add(btnCadena);
		
		JLabel lblDrácula = new JLabel("Dr\u00E1cula");
		lblDrácula.setBounds(10, 278, 52, 14);
		contentPane.add(lblDrácula);
		
		JTextArea txtrBanpiroBihurtuAurretik = new JTextArea();
		txtrBanpiroBihurtuAurretik.setText("Banpiro bihurtu aurretik, \nDrakula kondea Vlad printzea zen, \neta, maitearen heriotzaren berri \nizan zuenean, deabruari saldu zion arima.");
		txtrBanpiroBihurtuAurretik.setBounds(10, 287, 274, 76);
		contentPane.add(txtrBanpiroBihurtuAurretik);
		
		JButton btnDrácula = new JButton("Dr\u00E1cula");
		btnDrácula.setBounds(332, 310, 89, 23);
		contentPane.add(btnDrácula);
	}
}
