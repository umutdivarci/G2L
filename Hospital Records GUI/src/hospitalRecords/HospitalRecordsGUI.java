package hospitalRecords;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 * Class containing a frame for hospital records
 * @author Arda YILDIZ
 * @version 02.05.2021
*/
public class HospitalRecordsGUI 
{
	// Declare properties
	private JFrame frame;
	
	/**
	 * Constructor which initializes the properties
	*/
	public HospitalRecordsGUI()
	{
		// Initialize the frame
		frame = new JFrame();
				
		// Adjust the frame
		frame.setBounds( 0, 0, 859, 460);
		frame.setTitle( "Hospital Records");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setResizable( false);
		frame.getContentPane().setLayout( null);
		frame.getContentPane().setBackground( new Color( 153, 204, 204));
		
		// Initialize the header
		JLabel header = new JLabel( "Hospital Records");
		header.setFont(new Font( "Tahoma", Font.PLAIN, 44));
		header.setHorizontalAlignment( SwingConstants.CENTER);
		header.setBounds( 50, 24, 740, 100);
		frame.getContentPane().add( header);
		
		// Initialize the labelTotalBeds
		JLabel labelTotalBeds = new JLabel( "Total Number of Beds:");
		labelTotalBeds.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelTotalBeds.setBounds( 10, 182, 141, 70);
		frame.getContentPane().add( labelTotalBeds);
		
		// Initialize the labelTotalBedsRespond
		JLabel labelTotalBedsRespond = new JLabel("720");
		labelTotalBedsRespond.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelTotalBedsRespond.setBounds(170, 183, 128, 70);
		frame.getContentPane().add(labelTotalBedsRespond);
		
		// Initialize the labelAvailableBeds
		JLabel labelAvailableBeds = new JLabel( "Number of Available Beds:");
		labelAvailableBeds.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelAvailableBeds.setBounds( 10, 243, 150, 70);
		frame.getContentPane().add( labelAvailableBeds);
		
		// Initialize the labelAvailableBedsRespond
		JLabel labelAvailableBedsRespond = new JLabel( "420");
		labelAvailableBedsRespond.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelAvailableBedsRespond.setBounds( 170, 243, 128, 70);
		frame.getContentPane().add( labelAvailableBedsRespond);
		
		// Initialize the labelAdress
		JLabel labelAdress = new JLabel( "Adress:");
		labelAdress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelAdress.setBounds( 10, 123, 74, 70);
		frame.getContentPane().add( labelAdress);
		 
		// Initialize the labelAdressRespond
		JLabel labelAdressRespond = new JLabel( "7th Avenue, Çankaya, Ankara");
		labelAdressRespond.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelAdressRespond.setBounds( 70, 123, 170, 70);
		frame.getContentPane().add( labelAdressRespond);
		
		// Initialize the labelMedicalBranches
		JLabel labelMedicalBranches = new JLabel( "Medical Branches");
		labelMedicalBranches.setHorizontalAlignment( SwingConstants.CENTER);
		labelMedicalBranches.setBounds( 341, 123, 231, 70);
		frame.getContentPane().add( labelMedicalBranches);
		
		// Initialize the panel
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(341, 170, 231, 178);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 2, 0, 0));
		
		// Initialize the labelOncology
		JLabel labelOncology = new JLabel( "Oncology");
		labelOncology.setHorizontalAlignment( SwingConstants.CENTER);
		labelOncology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		panel.add( labelOncology);
		
		// Initialize the labelPsychiatry
		JLabel labelPsychiatry = new JLabel("Psychiatry\r\n");
		labelPsychiatry.setHorizontalAlignment(SwingConstants.CENTER);
		labelPsychiatry.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		panel.add(labelPsychiatry);
		
		// Initialize the labelNephrology
		JLabel labelNephrology = new JLabel("Nephrology");
		labelNephrology.setHorizontalAlignment(SwingConstants.CENTER);
		labelNephrology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		panel.add(labelNephrology);
		
		// Initialize the labelCardiology
		JLabel labelCardiology = new JLabel("Cardiology");
		labelCardiology.setHorizontalAlignment(SwingConstants.CENTER);
		labelCardiology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		panel.add(labelCardiology);
		
		// Initialize the labelOrthopaedics
		JLabel labelOrthopaedics = new JLabel("Orthopaedics");
		labelOrthopaedics.setHorizontalAlignment(SwingConstants.CENTER);
		labelOrthopaedics.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		panel.add(labelOrthopaedics);
		
		// Initialize the labelGastrology
		JLabel labelGastrology = new JLabel("Gastrology");
		labelGastrology.setHorizontalAlignment(SwingConstants.CENTER);
		labelGastrology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		panel.add(labelGastrology);
		
		// Initialize the labelTotalEmployees
		JLabel labelTotalEmployees = new JLabel("Total Number of Employees:");
		labelTotalEmployees.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelTotalEmployees.setBounds(10, 304, 170, 70);
		frame.getContentPane().add(labelTotalEmployees);
		
		// Initialize the labelTotalEmployeesRespond
		JLabel labelTotalEmployeesRespond = new JLabel("1000");
		labelTotalEmployeesRespond.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelTotalEmployeesRespond.setBounds(170, 304, 128, 70);
		frame.getContentPane().add(labelTotalEmployeesRespond);
		
		// Initialize the panel2
		JPanel panel2 = new JPanel();
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel2.setBounds(600, 170, 231, 178);
		frame.getContentPane().add(panel2);
		panel2.setLayout(new GridLayout(3, 2, 0, 0));
		
		// Initialize the labelLab1
		JLabel labelLab1 = new JLabel("Lab - LCM312");
		labelLab1.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab1.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab1);
		
		// Initialize the labelLab2
		JLabel labelLab2 = new JLabel("Lab - LCM313");
		labelLab2.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab2.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab2);
		
		// Initialize the labelLab3
		JLabel labelLab3 = new JLabel("Lab - RVN482");
		labelLab3.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab3.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab3);
		
		// Initialize the labelLab4
		JLabel labelLab4 = new JLabel("Lab - RVN483");
		labelLab4.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab4.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab4);
		
		// Initialize the labelLab5
		JLabel labelLab5 = new JLabel("Lab - SQW594");
		labelLab5.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab5.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab5);
		
		// Initialize the labelLab6
		JLabel labelLab6 = new JLabel("Lab - SQW595");
		labelLab6.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab6.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab6);
		
		// Initialize the labelLaboratoriesList
		JLabel labelLaboratoriesList = new JLabel("Laboratories List");
		labelLaboratoriesList.setHorizontalAlignment(SwingConstants.CENTER);
		labelLaboratoriesList.setBounds(600, 123, 231, 70);
		frame.getContentPane().add(labelLaboratoriesList);
		
		// Set the frame visible
		frame.setVisible( true);
	}	
}