package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel Principal;
	private JTextField ongietorria;
	Zinemak vent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Principal = new JPanel();
		Principal.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				try {
					Thread.sleep(2000);// hiru segundu itxaroteko beste pantailara joan aurretik
				} catch (Exception e1) {
					System.out.println(e1);
				}
				vent = new Zinemak();
				vent.setVisible(true);
			}
		});
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Principal);
		Principal.setLayout(null);
		
		ongietorria = new JTextField();
		ongietorria.setText("Ongi etorri elorrieta-errekamari zinemaren webgunera");
		ongietorria.setBounds(73, 108, 311, 44);
		Principal.add(ongietorria);
		ongietorria.setColumns(10);
		
	}
	
}
