package Vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class OrdutegiaV extends JFrame implements ActionListener { //implementamos la orden de al accionar el click al elegir un dia

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane; //el panel que usaremos sera "contentPane"

	JDatePickerImpl datePicker; //creamos el datepicker para usarlo
	public JTextField textFieldfilma; //si esto es private no podemos tener datos de filma
	private JButton btnbueltatu;
	ZinemaV ventzinema;
	FilmaV ventfilma;
	int filmkont;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrdutegiaV frame = new OrdutegiaV();
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
	public OrdutegiaV() {
		setTitle("ordutegia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel(); //creacion del panel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	//modelos y propiedades de datepicker(siempre seran estas)
		UtilDateModel model = new UtilDateModel();

			Properties p = new Properties();
			JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
	//-----------------------	
			
			contentPane.setLayout(null);
			datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter()); //creaccion del datepicker (DateLabelFormatter en una clasea aparte con sus propiedades tambien este sierve para editar el formato de fecha)
			datePicker.setBounds(112, 55, 202, 23); //longitud y lugar del datepicker (x,y, width, eigth)
			datePicker.addActionListener(this);
			
			//añadimos el datepicker al panel ("contentPane"=JPanel)
			contentPane.add(datePicker); 
			setContentPane(contentPane);
				contentPane.setLayout(null);
				
				textFieldfilma = new JTextField();
				textFieldfilma.setText("Aukeratu ordutegia:");
				textFieldfilma.setEditable(false);
				textFieldfilma.setBounds(10, 11, 414, 20);
				contentPane.add(textFieldfilma);
				textFieldfilma.setColumns(10);
				
				JButton btnaukeratu = new JButton("Aukeratu");
				btnaukeratu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Date dataaukeratuta = (Date) datePicker.getModel().getValue();
						
						if(dataaukeratuta == null) {
							JOptionPane.showMessageDialog(null, "AUKERATU DATA BAT!" ); //POP UP WARNING
						}else {
							JOptionPane.showMessageDialog(null, dataaukeratuta+ "\n" + textFieldfilma.getText()); //POP UP
							
							ventzinema = new ZinemaV();
							ventzinema.setVisible(true);
							dispose();
							
							int filmkont = 0;
							filmkont++;
							String setfilmcont = Integer.toString(filmkont);
							
							ventzinema.textfilmkop.getText().substring(filmkont);
							ventzinema.textfilmkop.setText(setfilmcont);
						}
						
					}
				});
				btnaukeratu.setBounds(335, 227, 89, 23);
				contentPane.add(btnaukeratu);
				
				btnbueltatu = new JButton("Bueltatu");
				btnbueltatu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

						ventfilma = new FilmaV();
						ventfilma.setVisible(true);
						dispose();		
						
					}
				});
				btnbueltatu.setBounds(10, 227, 89, 23);
				contentPane.add(btnbueltatu);

	}
	
	public void actionPerformed(ActionEvent event) { //evento al clicar los dias del datepicker(no incluye el desplegable)
		// for UtilDateModel, the value returned is of type java.util.Date
		Date selectedDate = (Date) datePicker.getModel().getValue(); //editable para sacar solo formato de fecha
	
		System.out.println("Data: "+selectedDate);
		
		
	}
}
