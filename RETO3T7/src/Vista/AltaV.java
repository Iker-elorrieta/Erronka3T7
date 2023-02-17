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

public class AltaV extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField txtpasahitza;
	LoginV ventLogin;
	ZinemaV ventZinemak;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltaV frame = new AltaV();
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
	public AltaV() {
		setTitle("Alta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblmesgidentifica = new JLabel("Erabiltzaile eta pasahitz bat zehaztu");
		lblmesgidentifica.setBounds(108, 0, 232, 14);
		contentPane.add(lblmesgidentifica);
		
		JLabel lblNANmsg = new JLabel("NAN ZENBAKIA:");
		lblNANmsg.setBounds(27, 41, 92, 14);
		contentPane.add(lblNANmsg);
		
		JLabel lblpasswrdmsg = new JLabel("PASAHITZA:");
		lblpasswrdmsg.setBounds(27, 118, 92, 14);
		contentPane.add(lblpasswrdmsg);
		
		JButton btnbueltatuasiera = new JButton("Bueltatu asierara");
		btnbueltatuasiera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //SE TIENEN QUE BORRAR TODOS LOS DATOS
				ventZinemak = new ZinemaV(); //enlace con la siguiente ventana(creacion)
				ventZinemak.setVisible(true);
				dispose(); //cerrar ventana actual (si cierras lade ahora se deja la antetior(volver))
				
			}
		});
		btnbueltatuasiera.setBounds(27, 214, 154, 23);
		contentPane.add(btnbueltatuasiera);
		
		JLabel lblbalioakmsg = new JLabel("balio guztiak berraraziko dira !");
		lblbalioakmsg.setBackground(new Color(255, 255, 255));
		lblbalioakmsg.setBounds(37, 247, 170, 14);
		contentPane.add(lblbalioakmsg);
		
		JButton btnerosi = new JButton("Alta eman");
		btnerosi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventLogin = new LoginV(); //enlace con la siguiente ventana(creacion)
				ventLogin.setVisible(true);
				dispose(); //cerrar ventana actual (si cierras lade ahora se deja la antetior(volver))
			}
		});
		btnerosi.setBounds(323, 214, 101, 23);
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
