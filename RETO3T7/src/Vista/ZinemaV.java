package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filma;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ZinemakV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	LaburpenaV ventLabur;
	FilmakV ventfilmak;
	
	
	private Filma[] filmak = new Filma[0];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZinemakV frame = new ZinemakV();
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
	public ZinemakV() {
		setTitle("zinemak");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblZineAretoak = new JLabel("Zine Areto Erakusgarriak");
		lblZineAretoak.setBounds(10, 25, 145, 14);
		contentPane.add(lblZineAretoak);
		
		
		
		
		
		
		
	//boton bukatu	
		JButton btnBukatu = new JButton("Bukatu");
		btnBukatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filmaKont=0;
				if(filmaKont<0) {
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

		JComboBox<String> cines = new JComboBox<String>();

		cines.setBounds(80, 100, 249, 22);
		contentPane.add(cines);



		String cantcines = "Elorrieta,Getxo,Max center"; //pillamos pelis de la base de datos


		String[] cantcines2 = cantcines.split(","); //separamos por "," para saber cuantos hay y valor en posicion


		int cantcinescant = cantcines2.length; //cantidad de cines segun split 1 , 2 , 3..
		//String[] itemscant = new String[cantcinescant]; //array de length segun cantidad de cines


		for(int i = 0; i< cantcinescant ; i++) {

		cines.addItem(cantcines2[i]);

		};
		
		
	//EVENTO DE CAMBIO SE SELECCION---------------------	
		cines.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				String cinelegido = (String) cines.getSelectedItem(); //guardamos lo que se selecciona(no se porqeu guarda 2)
				
				if(cinelegido !="") { //evento al cambio de seleccion
					
					ventfilmak = new FilmakV();
					ventfilmak.setVisible(true);
					dispose();

				}
				
			}
		});

	//-------------------------------------------------
		
		//------------------------------------------------
	}
}
