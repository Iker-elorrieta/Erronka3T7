package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ErosketafinalaV extends JFrame {

	private JPanel contentPane;
	ZinemakV ventZinemak;

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
				//popup joptionpanelshowmessagedialog
			}
		});
		btnbai.setBounds(173, 138, 89, 23);
		contentPane.add(btnbai);
		
		JButton btnbultatuasierara = new JButton("Bueltatu asierara");
		btnbultatuasierara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				ventZinemak = new ZinemakV(); //enlace con la siguiente ventana(creacion)
				ventZinemak.setVisible(true);
				dispose(); //cerrar ventana actual (si cierras lade ahora se deja la antetior(volver))
			}
		});
		btnbultatuasierara.setBounds(10, 227, 149, 23);
		contentPane.add(btnbultatuasierara);
	}

}
