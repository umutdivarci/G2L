package patients;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Class containing a frame for patients
 * @author Arda YILDIZ
 * @version 02.05.2021
*/
public class PatientsPage 
{
	// Declare properties
	private JFrame frame;
	
	/**
	 * Constructor which initializes the properties
	 * @param patient is an instance of the Patient class
	*/
	public PatientsPage( Patient patient)
	{
		// Initialize the frame
		frame = new JFrame();
				
		// Adjust the frame
		frame.setBounds( 0, 0, 859, 460);
		frame.setTitle( "Patients Page");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setResizable( false);
		frame.getContentPane().setLayout( null);
		frame.getContentPane().setBackground( new Color( 153, 204, 204));
		
		JLabel header = new JLabel("Patient Page");
		header.setFont(new Font("Tahoma", Font.PLAIN, 44));
		header.setBackground(Color.GRAY);
		header.setBounds(33, 10, 383, 92);
		frame.getContentPane().add(header);
		
		JLabel labelPatientName = new JLabel("Patient Name: ");
		labelPatientName.setBounds(33, 130, 116, 57);
		frame.getContentPane().add(labelPatientName);
		
		JLabel labelPatientNameRespond = new JLabel("Name Surname");
		labelPatientNameRespond.setBounds(155, 130, 116, 57);
		frame.getContentPane().add(labelPatientNameRespond);
		
		JLabel labelPatientAge = new JLabel("Patient Age:");
		labelPatientAge.setBounds(33, 183, 116, 57);
		frame.getContentPane().add(labelPatientAge);
		
		JLabel labelPatientAgeRespond = new JLabel("A number for age");
		labelPatientAgeRespond.setBounds(155, 183, 116, 57);
		frame.getContentPane().add(labelPatientAgeRespond);
		
		JLabel labelPatientID = new JLabel("Patient ID:");
		labelPatientID.setBounds(29, 238, 116, 57);
		frame.getContentPane().add(labelPatientID);
		
		JLabel labelPatientIDRespond = new JLabel("A number for ID");
		labelPatientIDRespond.setBounds(155, 238, 116, 57);
		frame.getContentPane().add(labelPatientIDRespond);
		
		JLabel labelPatientGender = new JLabel("Patient Gender:");
		labelPatientGender.setBounds(33, 305, 116, 57);
		frame.getContentPane().add(labelPatientGender);
		
		JLabel labelPatientGenderRespond = new JLabel("Gender");
		labelPatientGenderRespond.setBounds(155, 296, 116, 57);
		frame.getContentPane().add(labelPatientGenderRespond);
		
		JLabel labelPatientBloodGroup = new JLabel("Patient Blood Group:");
		labelPatientBloodGroup.setBounds(33, 365, 116, 57);
		frame.getContentPane().add(labelPatientBloodGroup);
		
		JLabel labelPatientBloodGroupRespond = new JLabel("Blood Group");
		labelPatientBloodGroupRespond.setBounds(155, 365, 116, 57);
		frame.getContentPane().add(labelPatientBloodGroupRespond);
		
		// Create an image
		ImageIcon image = new ImageIcon( this.getClass().getResource( "/person-icon.png"));
		
		// Initialize the labelIcon
		JLabel labelIcon;
		labelIcon = new JLabel();
		labelIcon.setBackground(new Color(240, 240, 240));
		labelIcon.setHorizontalAlignment(SwingConstants.CENTER);
		labelIcon.setIcon( image);
		labelIcon.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelIcon.setBounds( 705, 0, 140, 140);
		frame.getContentPane().add( labelIcon);
		
		JTextArea medicalRecords = new JTextArea();
		medicalRecords.setFont(new Font("Monospaced", Font.PLAIN, 16));
		medicalRecords.setText("Medical records are displayed here.\r\n");
		medicalRecords.setBounds(366, 204, 423, 189);
		frame.getContentPane().add(medicalRecords);
		
		JLabel labelMedicalRecords = new JLabel("Patient Medical Records");
		labelMedicalRecords.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelMedicalRecords.setHorizontalAlignment(SwingConstants.CENTER);
		labelMedicalRecords.setBounds(399, 152, 341, 46);
		frame.getContentPane().add(labelMedicalRecords);
		
		// Set the frame visible
		frame.setVisible( true);
	}	
}

	
