package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Objetos.Filma;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LaburpenaV extends JFrame {
//crear los extends del jFrame
	private static final long serialVersionUID = 1L;
	private JPanel resumen;
	private JTable table;
	
	ZinemaV ventzinema;
	LoginV ventlogin;

	/**
	 * Launch the application.
	 */
	//Extender los bounds del JFrame
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaburpenaV frame = new LaburpenaV(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param filmak 
	 */
	public LaburpenaV(Filma[] filmak) {
		setTitle("RESUMEN");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		resumen = new JPanel();
		resumen.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(resumen);
		resumen.setLayout(null);
		//Object patata1 = ventzinema.cines.getSelectedObjects();
		table = new JTable();
		table.setModel(new DefaultTableModel(
			
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(0, 0, 1, 1);
		resumen.add(table);
		
		JButton btnbueltatu = new JButton("BUELTATU");
		btnbueltatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventzinema = new ZinemaV();
				ventzinema.setVisible(true);
				dispose();
				
			}
		});
		btnbueltatu.setBounds(47, 227, 107, 23);
		resumen.add(btnbueltatu);
		
		JButton btnerosi = new JButton("EROSI");
		btnerosi.setBounds(279, 227, 107, 23);
		btnerosi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventlogin = new LoginV();
				ventlogin.setVisible(true);
				dispose();
			}
		});
		/***
		 * https://www.youtube.com/watch?v=QNg5uTCew14 AQUI !!!
		 */
		resumen.add(btnerosi);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 41, 325, 156);
		resumen.add(scrollPane);
		
		JTextArea TextArea = new JTextArea();
		scrollPane.setViewportView(TextArea);
		
		JScrollPane scroll = new JScrollPane();
		scrollPane.setRowHeaderView(scroll);
		//Termina el Scroll
	}
	
	public void tables() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,800);
		getContentPane().setLayout(null);
		setVisible(true);
	}
}
