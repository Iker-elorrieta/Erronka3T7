package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ErosketafinalaV extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ZinemaV ventZinemak;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ErosketafinalaV frame = new ErosketafinalaV();
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
	public ErosketafinalaV() {
		setTitle("TIKET");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sakatu \"bai\" zure erosketaren tiketa lortzeko");
		lblNewLabel.setBounds(104, 69, 299, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnbai = new JButton("Bai");
		btnbai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int kantpelis = 5; //cantidad de lineas que guardara
				
				String[] filmak= new String [kantpelis];
			//datos inventados	
				filmak[0]= "hulk,19:30,getxo";
					filmak[1]= "handia,9:40,elorrieta-errekamari";
						filmak[2]= "alien,11:00,max-center";
							filmak[3]= "perro,10:30,getxo";
								filmak[4]= "juan,21:00,elorrieta-errekamari";
			//---------------------------
	
				
				File file = new File("tiket.txt"); //nombre del fichero
				
				BufferedWriter fichero;
				
					try {
						
						fichero = new BufferedWriter(new FileWriter(file));
							
						for(int i =0;i<kantpelis;i++)
						{
							fichero.write(filmak[i]+"&"+"\n"); //sintaxia: dato + "diferencial" + intro
						}
						fichero.close(); //cerrar el fichero para que no de problemas
					
					} catch (IOException e1) {
						e1.printStackTrace(); //syso de error
					}
				
					
					
				
			//info del archivo	
				System.out.println(file.exists()); //si el fichero existe(importante para saber en la zona de "File file = new File("tiket.txt");" )
				System.out.println("Ruta: "+file.getAbsolutePath()); //rita del fichero(en caso de existencia)
				//diferencia de fichero y carpeta
				System.out.println("archibo bat da? "+file.isFile());
				System.out.println("karpeta bat da? "+file.isDirectory());
				
				System.out.println(file.length()); //cant de lineas
				
				
				JOptionPane.showMessageDialog(null, "Tiket sarrerak era egokian erosi dira!"); //POP UP
				
			}
				
		});
		btnbai.setBounds(155, 123, 89, 23);
		contentPane.add(btnbai);
		
		JButton btnbultatuasierara = new JButton("Bueltatu asierara");
		btnbultatuasierara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				ventZinemak = new ZinemaV(); //enlace con la siguiente ventana(creacion)
				ventZinemak.setVisible(true);
				dispose(); //cerrar ventana actual (si cierras lade ahora se deja la antetior(volver))
			}
		});
		btnbultatuasierara.setBounds(10, 227, 149, 23);
		contentPane.add(btnbultatuasierara);
	}

}
