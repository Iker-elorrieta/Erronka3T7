package Vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Metodoak.Metodoak;
import Objetos.Ordutegia;

import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;

public class OrdutegiaV extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Ordutegia[] ordutegia = null;
	Metodoak metodoak = new Metodoak();
	JDatePickerImpl DatePicker;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdutegiaV frame = new OrdutegiaV(null);
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
	public OrdutegiaV(Ordutegia[] HautatuOrdutegia) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		UtilDateModel model = new UtilDateModel();
	    model.setDate(2022, 5, 6);
		Properties p = new Properties();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		contentPane.setLayout(null);
		DatePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		DatePicker.setBounds(170, 11, 202, 23);
		
		contentPane.add(DatePicker);
		setOrdutegia(HautatuOrdutegia);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Aukeratu = new JButton("Aukeratu");
		Aukeratu.setBounds(335, 10, 89, 23);
		contentPane.add(Aukeratu);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 61, 283, 78);
		contentPane.add(textPane);
		
		JButton btnBueltatu = new JButton("Bueltatu");
		btnBueltatu.setBounds(7, 227, 89, 23);
		contentPane.add(btnBueltatu);
		
		JPanel DatePicker = new JPanel();
		DatePicker.setBounds(10, 10, 177, 23);
		contentPane.add(DatePicker);
		DatePicker.setLayout(null);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(0, 0, 145, 23);
		DatePicker.add(formattedTextField);
	}
	
	public void actionPerformed(ActionEvent event) {
		// for UtilDateModel, the value returned is of type java.util.Date
		Date selectedDate = (Date) DatePicker.getModel().getValue();
		
		
		
		this.setVisible(false);
		
		
	}
	public Ordutegia[] getOrdutegia() {
		return ordutegia;
	}

	public void setOrdutegia(Ordutegia[] ordutegia) {
		this.ordutegia = ordutegia;
	}
}
