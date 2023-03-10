package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filmak;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zinemak extends JFrame {

	private JPanel contentPane;
	FilmakElorrieta ventElorrieta;
	FilmakZubiarte ventZubiarte;
	FilmakGetxo ventGetxo;
	FilmakMaxCenter ventMax;
	Laburpena ventLabur;
	
	
	private Filmak[] filmak = new Filmak[0];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zinemak frame = new Zinemak();
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
	public Zinemak() {
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
		JButton btnElorrieta = new JButton("Elorrieta-errekamari\nZinema");
		btnElorrieta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventElorrieta = new FilmakElorrieta(filmak);
				ventElorrieta.setVisible(true);
				dispose();//cerrar ventana actual
				
			}
		});
		btnElorrieta.setBounds(10, 50, 193, 23);
		contentPane.add(btnElorrieta);
		
		JButton btnGetxo = new JButton("Getxo Zinema");
		btnGetxo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventGetxo = new FilmakGetxo(filmak);
				ventGetxo.setVisible(true);
				dispose();//cerrar ventana actual
			}
		});
		btnGetxo.setBounds(273, 50, 125, 23);
		contentPane.add(btnGetxo);
		
		JButton btnZubiarte = new JButton("Zubiarte Zinema");
		btnZubiarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventZubiarte = new FilmakZubiarte(filmak);
				ventZubiarte.setVisible(true);
				dispose();//cerrar ventana actual
			}
		});
		btnZubiarte.setBounds(10, 121, 165, 23);
		contentPane.add(btnZubiarte);
		
		JButton btnMaxCenter = new JButton("Max Center Zinema");
		btnMaxCenter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventMax = new FilmakMaxCenter(filmak);
				ventMax.setVisible(true);
				dispose();//cerrar ventana actual
			}
		});
		btnMaxCenter.setBounds(267, 121, 145, 23);
		contentPane.add(btnMaxCenter);
		
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
	}
}
