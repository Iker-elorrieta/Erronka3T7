package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginV extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField txtpasahitza;
	AltaV ventAlta;
	ZinemaV ventZinemak;
	ErosketafinalaV venterosketafinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginV frame = new LoginV();
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
	public LoginV() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmesgidentifica = new JLabel("erosi baino lehen identifikatu zaitez");
		lblmesgidentifica.setBounds(126, 0, 205, 14);
		contentPane.add(lblmesgidentifica);
		
		JLabel lblNANmsg = new JLabel("NAN ZENBAKIA:");
		lblNANmsg.setBounds(27, 41, 92, 14);
		contentPane.add(lblNANmsg);
		
		JLabel lblpasswrdmsg = new JLabel("PASAHITZA:");
		lblpasswrdmsg.setBounds(27, 118, 92, 14);
		contentPane.add(lblpasswrdmsg);
		
		JButton btnalta = new JButton("Altan eman");
		btnalta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventAlta = new AltaV();
				ventAlta.setVisible(true);
				dispose();//cerrar ventana actual
				
			}
		});
		btnalta.setBounds(316, 83, 108, 23);
		contentPane.add(btnalta);
		
		JButton btnbueltatuasiera = new JButton("Bueltatu asierara");
		btnbueltatuasiera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//SE TIENEN QUE BORRAR TODOS LOS DATOS
				ventZinemak = new ZinemaV(); //enlace con la siguiente ventana(creacion)
				ventZinemak.setVisible(true);
				dispose(); //cerrar ventana actual (si cierras lade ahora se deja la antetior(volver))
			}
		});
		btnbueltatuasiera.setBounds(27, 214, 154, 23);
		contentPane.add(btnbueltatuasiera);
		
		JLabel lblbalioakmsg = new JLabel("balio guztiak berraraziko dira !");
		lblbalioakmsg.setBackground(new Color(255, 255, 255));
		lblbalioakmsg.setBounds(27, 247, 183, 14);
		contentPane.add(lblbalioakmsg);
		
		JButton btnerosi = new JButton("Erosi");
		btnerosi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				venterosketafinal = new ErosketafinalaV();
				venterosketafinal.setVisible(true);
				dispose();
				
			}
		});
		btnerosi.setBounds(335, 214, 89, 23);
		contentPane.add(btnerosi);
		
		textField = new JTextField();
		textField.setBounds(33, 66, 174, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtpasahitza = new JPasswordField();
		txtpasahitza.setBounds(37, 143, 170, 20);
		contentPane.add(txtpasahitza);
	}
}
