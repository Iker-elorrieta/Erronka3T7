package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TiketV extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ZinemaV ventzinema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TiketV frame = new TiketV();
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
	public TiketV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblinfo = new JLabel("Sakatu \"bai\" zure erosketaren tiketa lortzeko");
		lblinfo.setBounds(88, 67, 289, 14);
		contentPane.add(lblinfo);
		
		JButton btnbai = new JButton("Bai");
		btnbai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Tiket sarrerak era egokian erosi dira!"); //POP UP
			}
		});
		btnbai.setBounds(159, 117, 89, 23);
		contentPane.add(btnbai);
		
		
		JButton btnbueltatuasiera = new JButton("Bueltatu asierara");
		btnbueltatuasiera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ventzinema = new ZinemaV();
				ventzinema.setVisible(true);
				dispose();
				
			}
		});
		btnbueltatuasiera.setBounds(10, 227, 139, 23);
		contentPane.add(btnbueltatuasiera);
	}
}
