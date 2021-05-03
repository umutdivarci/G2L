import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.xml.namespace.QName;
import javax.swing.border.LineBorder;

public class AppointmentPage2 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// 	Hospital a = new Hospital("hospitalName", "hospitalLocation");
	// 	Date date = new Date();
	// 	long ap = 122332;
	// 	MedicalRecord med = new MedicalRecord(12, 12.0, 12.0, date);
	// 	ArrayList <Patient> list = new ArrayList<Patient>();
	// 	Patient doctor = new Patient("userName", "password", "mail", 1233211, med, "currentCity", "name", "surname");
	// 	Doctor patient = new Doctor("patient", "12345", "mail", "name", ap, a, 123321.0);
	// 	doctor.getAppointment(3, patient);
	// 	EventQueue.invokeLater(new Runnable() {
	// 		public void run() {
	// 			try {
	// 					AppointmentPage frame = new AppointmentPage2(doctor, patient);
	// 				frame.setVisible(true);
	// 			} catch (Exception e) {
	// 				e.printStackTrace();
	// 			}
	// 		}
	// 	});
	// }

	/**
	 * Create the frame.
	 */
	public AppointmentPage2(Patient patient, Doctor doctor) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 1400);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		int counter = 0;
		int line = 0;
		JButton[] buttons = new JButton[30];
		
		
		for ( int i = 0 ; i < buttons.length ; i++){

	        buttons[i] = new JButton();
			int cc = i;
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					patient.getAppointment(cc, doctor);
					buttons[cc].setBackground(new Color(242, 186, 201));
					buttons[cc].setText ( doctor.getDate().getDay(cc).toString() + " not available");
				}
			}
			
			
		);

	         // Updates the location of each button.
	         buttons[i].setBounds( 160*counter + 100, 110*line + 40, 150, 100);
			 if(patient.getAvailabe(i)  && doctor.getAvailability(i)){
				buttons[i].setBackground(new Color(186, 242, 187));
				buttons[i].setOpaque(true);
				buttons[i].setBorderPainted(true);
				buttons[i].setText ( doctor.getDate().getDay(i).toString() + " available");
				
			 }
			 else{
				buttons[i].setBackground(new Color(242, 186, 201));
				buttons[i].setOpaque(true);
				buttons[i].setBorderPainted(true);
				buttons[i].setText ( doctor.getDate().getDay(i).toString() + " not available");
			 }
	         
	        

	         contentPane.add(buttons[i]);
	        

	         // Counts the coordinates of the buttons.
	         counter += 1;
	         if ( counter == 5)
	         {
	            counter = 0;
	            line += 1;

	         }
	      }
			}
		
		
		
        

			
	}