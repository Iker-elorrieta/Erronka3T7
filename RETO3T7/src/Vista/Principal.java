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
		Principal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Principal);
		Principal.setLayout(null);
		
		ongietorria = new JTextField();
		ongietorria.setText("Ongi etorri elorrieta-errekamari zinemaren webgunera");
		ongietorria.setBounds(73, 108, 311, 44);
		Principal.add(ongietorria);
		ongietorria.setColumns(10);
		
		JButton btnNewButton = new JButton("Ongi etorri");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vent = new Zinemak();
				vent.setVisible(true);
			}
		});
		btnNewButton.setBounds(156, 163, 147, 33);
		Principal.add(btnNewButton);
	}
	
}
