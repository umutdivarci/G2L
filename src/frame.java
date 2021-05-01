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
import javax.swing.border.LineBorder;

public class frame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Hospital a = new Hospital("hospitalName", "hospitalLocation");
		Date date = new Date();
		long ap = 122332;
		MedicalRecord med = new MedicalRecord(12, 12.0, 12.0, date);
		ArrayList <Patient> list = new ArrayList<Patient>();
		Patient alphan = new Patient("userName", "password", "mail", 1233211, med, "currentCity", "name", "surname");
		Doctor umut = new Doctor("umut", "12345", "mail", "name", ap, a, 123321.0);
		alphan.getAppointment(3, umut);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame(alphan);
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
	public frame(Patient umut) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLACK, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		int counter = 0;
		int line = 0;
		JTextField[] buttons = new JTextField[30];
		
		
		for ( int i = 0 ; i < buttons.length ; i++)
	      {
	         buttons[i] = new JTextField();
	        

	         // Updates the location of each button.
	         buttons[i].setBounds( 60*counter + 100, 60*line + 20, 60, 60);
			 if(umut.getAvailabe(i)){
				 buttons[i].setBackground(new Color(152, 251, 152));
			 }
			 else{
				buttons[i].setBackground(new Color(250, 128, 114));
			 }
	         
	         buttons[i].setText ( ""+ (i + 1));
	         //buttons[i].setPosition ( i);

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
