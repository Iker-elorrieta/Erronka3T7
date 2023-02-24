package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Metodoak.Metodoak;
import Objetos.Filma;
import Objetos.Zinema;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ZinemaV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	OrdutegiaV ventOrdutegia;
	LaburpenaV ventLabur;
	FilmaV ventfilmak;
	Metodoak Metodoak = new Metodoak();
	String zinemaH;
	private Filma[] filmak = new Filma[0];
	private Zinema[] zinema = new Zinema[1];
	private JTextField txtinfokantfilma;
	public JTextField textfilmkop; //esta public para poder pasarle los datos de ordutegia
	JComboBox<String> cines = new JComboBox<String>();
	Filma[] aukeratua;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZinemaV frame = new ZinemaV();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ZinemaV() {
		setTitle("zinemak");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblZineAretoak = new JLabel("Zinema Areto Erakusgarriak");
		lblZineAretoak.setBounds(10, 25, 180, 14);
		contentPane.add(lblZineAretoak);
		
		
		
		
		
		
		
	//boton bukatu	
		JButton btnBukatu = new JButton("Bukatu");
		btnBukatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				/*ventOrdutegia.filmkont;*/
				
				int filmacont=1;
				if( filmacont != 0) {
					ventLabur = new LaburpenaV(filmak);
					ventLabur.setVisible(true);
				}else { //cerrar app
					System.exit(JFrame.EXIT_ON_CLOSE); //accion cerrar la app
				}
			}
		});
		btnBukatu.setBounds(10, 198, 89, 23);
		contentPane.add(btnBukatu);
		
		
		//----COMBOBOX-------

		

		cines.setBounds(80, 100, 249, 22);
		contentPane.add(cines);
		
		txtinfokantfilma = new JTextField();
		txtinfokantfilma.setText("Aukeratutako film kopurua:");
		txtinfokantfilma.setEditable(false);
		txtinfokantfilma.setBounds(214, 230, 154, 20);
		contentPane.add(txtinfokantfilma);
		txtinfokantfilma.setColumns(10);
		
		textfilmkop = new JTextField();
		textfilmkop.setText("0");
		textfilmkop.setEditable(false);
		textfilmkop.setBounds(378, 230, 46, 20);
		contentPane.add(textfilmkop);
		textfilmkop.setColumns(10);
		
		zinema = Metodoak.ZinemaHasieratu();
		for (int i = 0; i < zinema.length; i++) {
			cines.addItem(zinema[i].getIzZinema());
			
		}
		JButton btnAukeratu = new JButton("Aukeratu");
		btnAukeratu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventfilmak = new FilmaV();
				ventfilmak.setVisible(true);
				dispose();
				String cinelegido = (String) cines.getSelectedItem();
				System.out.println("Zinema: "+cinelegido);
				ventfilmak.setTitle(cinelegido+" Zinema");
				ventfilmak.textFieldzinemaizena.setText(cinelegido+" dauden filmak:");
				zinemaH = String.valueOf(cines.getSelectedItem());
				ventfilmak.filmak2.setToolTipText(zinemaH);
				aukeratua = new Filma[1];
				aukeratua = Metodoak.FilmakErakutsi(zinemaH, zinema);
					for(int i=0;i<aukeratua.length;i++) {
						cines.addItem(aukeratua[i].getNomFilma());
						
					}
				
			}
		});
		btnAukeratu.setBounds(279, 198, 89, 23);
		contentPane.add(btnAukeratu);

	//-------------------------------------------------
		
		//------------------------------------------------
	}
}