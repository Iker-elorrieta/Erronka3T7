package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Metodoak.Metodoak;
import Objetos.Filma;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;

public class FilmaV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	FilmaV ventfilmak;
	OrdutegiaV ventordutegia;
	ZinemaV ventzinema;
	Metodoak Metodoak = new Metodoak();
	
	
	//private Filma[] filmak = new Filma[0];
	public JTextField textFieldzinemaizena; //public porqeu si no no le pasamos los datos de zinema
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmaV frame = new FilmaV();
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
	public FilmaV() {
		setTitle("filmak");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	
		
	//----COMBOBOX-------

		JComboBox<String> filmak2 = new JComboBox<String>();

		filmak2.setBounds(80, 50, 249, 22);
		contentPane.add(filmak2);
		//TEXTFIELD ZINEMA IZENA(datuak de seleccion de zinema)
			textFieldzinemaizena = new JTextField();
			textFieldzinemaizena.setEditable(false);
			textFieldzinemaizena.setBounds(10, 11, 268, 20);
			contentPane.add(textFieldzinemaizena);
			textFieldzinemaizena.setColumns(10);
		//--------------------------------------
		
		Filma[] arrayfilma = Metodoak.FilmakErakutsi(null, null, null, null, null);
		
		String  listafilma = arrayfilma.toString();
		

		String defaultselected = "Aukeratu film bat...,"; 
		String cantfilma = defaultselected+listafilma; //pillamos pelis de la base de datos


		String[] cantfilma2 = cantfilma.split(","); //separamos por "," para saber cuantos hay y valor en posicion


		int cantfilmacant = cantfilma2.length; //cantidad de cines segun split 1 , 2 , 3..
		//String[] itemscant = new String[cantcinescant]; //array de length segun cantidad de cines


		for(int i = 0; i< cantfilmacant ; i++) {

			filmak2.addItem(cantfilma2[i]);

		};
			
		//EVENTO DE CAMBIO SE SELECCION---------------------	
		filmak2.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					
					  if (e.getStateChange() == ItemEvent.SELECTED) {	//solo activarse al hacer clic en opcion y no en el cuadrado y luego en la opcion (si no en getselecteditem se repite 2 veces(1por abrir cuadrado, 1 por seleccionar))	
	
						  String filmaelegido = (String) filmak2.getSelectedItem(); //guardamos lo que se selecciona(no se porqeu guarda 2)
						
							System.out.println("Filma: "+filmaelegido);
							if(filmaelegido !="") { //evento al cambio de seleccion
								
								ventordutegia = new OrdutegiaV();
								ventordutegia.setVisible(true);
								dispose();
								
								ventordutegia.setTitle(filmaelegido+" saioak");
								ventordutegia.textFieldfilma.setText(filmaelegido);	
								}
							}
					 	}
			});
	
	 	//-------------------------------------------------
		
	//------------------------------------------------
			
			
		//boton bukatu	
			JButton btnBueltatu = new JButton("Bueltatu");
			btnBueltatu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

						ventzinema = new ZinemaV();
						ventzinema.setVisible(true);
						dispose();
				}
			});
			btnBueltatu.setBounds(10, 198, 89, 23);
			contentPane.add(btnBueltatu);
			
	}
}