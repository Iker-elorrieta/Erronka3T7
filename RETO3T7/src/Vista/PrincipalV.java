package Vista;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;

public class PrincipalV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Principal;
	private JTextField ongietorria;
	ZinemaV vent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalV frame = new PrincipalV();
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
	public PrincipalV() {
		setTitle("printzipala");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Principal = new JPanel();
		Principal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) { //si clicas mas de una vez te abrira tantas ventanas como clikes
				try {
					Thread.sleep(2000);// hiru segundu itxaroteko beste pantailara joan aurretik
				} catch (Exception e1) {
					System.out.println(e1);
				}
				vent = new ZinemaV(); //enlace con la siguiente ventana(creacion)
				vent.setVisible(true); //despues de 3 segs vemos la ventana
				dispose(); //cerrar ventana actual
			}
		});
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Principal);
		Principal.setLayout(null);
		
		ongietorria = new JTextField();
		ongietorria.setBackground(Color.LIGHT_GRAY);
		ongietorria.setEditable(false);
		ongietorria.setText("Ongi etorri elorrieta-errekamari zinemaren webgunera");
		ongietorria.setBounds(62, 109, 310, 20);
		Principal.add(ongietorria);
		ongietorria.setColumns(10);
	}
	
}
