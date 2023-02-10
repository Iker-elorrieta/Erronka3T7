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

public class Zinema extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	FilmaElorrieta ventElorrieta;
	FilmaZubiarte ventZubiarte;
	FilmaGetxo ventGetxo;
	Laburpena ventLabur;
	
	
	private Filma[] filmak = new Filma[0];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zinema frame = new Zinema();
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
	public Zinema() {
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
	//elorrieta boton	
		JButton btnElorrieta = new JButton("Elorrieta-errekamari\r\n Zinema");
		btnElorrieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventElorrieta = new FilmaElorrieta(filmak);
				ventElorrieta.setVisible(true);
				dispose();//cerrar ventana actual
				
			}
		});
		btnElorrieta.setBounds(110, 139, 218, 23);
		contentPane.add(btnElorrieta);
		
		JButton btnGetxo = new JButton("Getxo Zinema");
		btnGetxo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventGetxo = new FilmaGetxo(filmak);
				ventGetxo.setVisible(true);
				dispose();//cerrar ventana actual
			}
		});
		btnGetxo.setBounds(273, 50, 125, 23);
		contentPane.add(btnGetxo);
		
	//boton bukatu	
		JButton btnBukatu = new JButton("Bukatu");
		btnBukatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filmaKont=0;
				if(filmaKont<0) {
					ventLabur = new Laburpena(filmak);
					ventLabur.setVisible(true);
				}else { //cerrar app
					System.exit(JFrame.EXIT_ON_CLOSE); //accion cerrar la app
				}
			}
		});
		btnBukatu.setBounds(10, 198, 89, 23);
		contentPane.add(btnBukatu);
		
		JButton btnZubiarte = new JButton("Zubiarte Zinema");
		btnZubiarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventZubiarte = new FilmaZubiarte(filmak);
				ventZubiarte.setVisible(true);
				dispose();//cerrar ventana actual
			}
		});
		btnZubiarte.setBounds(20, 50, 135, 23);
		contentPane.add(btnZubiarte);
	}
}
