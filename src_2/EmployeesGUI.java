import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class containing a frame for employees
 * @author Arda YILDIZ
 * @version 02.05.2021
*/
public class EmployeesGUI 
{
	// Declare properties
	private JFrame frame;
	
	/**
	 * Constructor which initializes the properties
	*/
	public EmployeesGUI()
	{
		// Initialize the frame
		frame = new JFrame();
		
		// Adjust the frame
		frame.setBounds( 0, 0, 859, 460);
		frame.setTitle( "Employee Details");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setResizable( false);
		frame.getContentPane().setLayout( null);
		frame.getContentPane().setBackground( new Color( 153, 204, 204));
		
		// Initialize the header
		JLabel header = new JLabel( "Employee Page");
		header.setBackground( Color.WHITE);
		header.setForeground( new Color( 0, 51, 204));
		header.setFont( new Font( "Times New Roman", Font.BOLD, 44));
		header.setHorizontalAlignment( SwingConstants.CENTER);
		header.setBounds( 25, 10, 337, 93);
		header.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		frame.getContentPane().add( header);
		
		// Initialize the panel1
		JPanel panel1 = new JPanel();
		panel1.setBounds( 25, 146, 240, 210);
		frame.getContentPane().add( panel1);
		panel1.setLayout( null);
		
		// Initialize the labelProfession
		JLabel labelProfession = new JLabel( "Profession:");
		labelProfession.setFont( new Font( "Times New Roman", Font.BOLD, 17));
		labelProfession.setBounds( 27, 28, 90, 50);
		panel1.add( labelProfession);
		
		// Initialize the labelProfessionRespond
		JLabel labelProfessionRespond = new JLabel( "Psychiatrist");
		labelProfessionRespond.setFont(new Font( "Times New Roman", Font.BOLD, 17));
		labelProfessionRespond.setBounds( 121, 28, 90, 50);
		panel1.add( labelProfessionRespond);
		
		// Initialize the labelCurrentPatients
		JLabel labelCurrentPatients = new JLabel( "Current Patients:");
		labelCurrentPatients.setFont (new Font( "Times New Roman", Font.BOLD, 17));
		labelCurrentPatients.setBounds( 27, 94, 135, 50);
		panel1.add( labelCurrentPatients);
		
		// Initialize the buttonSelect
		JButton buttonSelect = new JButton( "Select                  ↓");
		buttonSelect.setFocusable( false);
		buttonSelect.setForeground( new Color(0, 0, 0));
		buttonSelect.setBackground( new Color(102, 102, 153));
		
		// Add actionListener to the buttonSelect
		buttonSelect.addActionListener( new ActionListener() 
		{
			/**
			* Method which listens the actions performed
			* @param event is an ActionEvent parameter
			*/
			public void actionPerformed( ActionEvent event) 
			{
				// Construct an appointment frame
				JFrame patientFrame;
						
				// Initialize the appointment frame
				patientFrame = new JFrame();
					
				// Adjust the appointment frame
				patientFrame.setBounds( 0, 0, 859, 460);
				patientFrame.setTitle( "Patient Page");
				patientFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
				patientFrame.getContentPane().setLayout( null);
				patientFrame.getContentPane().setBackground( new Color( 153, 204, 204));
				patientFrame.setVisible( true);
			}
		});
		
		// Initialize the buttonSelect
		buttonSelect.setFont( new Font( "Times New Roman", Font.BOLD, 13));
		buttonSelect.setBounds( 27, 130, 135, 31);
		panel1.add( buttonSelect);
		
		// Initialize the panel2
		JPanel panel2 = new JPanel();
		panel2.setBounds( 300, 146, 240, 210);
		frame.getContentPane().add( panel2);
		panel2.setLayout( null);
		
		// Initialize the labelAge
		JLabel labelAge = new JLabel( "Age:");
		labelAge.setFont( new Font( "Times New Roman", Font.BOLD, 14));
		labelAge.setBounds( 20, 20, 41, 50);
		panel2.add( labelAge);
		
		// Initialize the labelAgeRespond
		JLabel labelAgeRespond = new JLabel( "38");
		labelAgeRespond.setFont( new Font( "Times New Roman", Font.BOLD, 14));
		labelAgeRespond.setBounds( 57, 20, 41, 50);
		panel2.add( labelAgeRespond);
		
		// Initialize the labelEducation
		JLabel labelEducation = new JLabel( "Education:");
		labelEducation.setFont( new Font( "Times New Roman", Font.BOLD, 14));
		labelEducation.setBounds( 20, 69, 67, 50);
		panel2.add( labelEducation);
		
		// Initialize the labelEducationRespond
		JLabel labelEducationRespond = new JLabel( "Hacettepe University");
		labelEducationRespond.setFont( new Font( "Times New Roman", Font.BOLD, 14));
		labelEducationRespond.setBounds( 90, 69, 140, 50);
		panel2.add( labelEducationRespond);
		 
		// Initialize the labelSalary
		JLabel labelSalary = new JLabel( "Salary:");
		labelSalary.setFont( new Font( "Times New Roman", Font.BOLD, 14));
		labelSalary.setBounds( 20, 122, 50, 50);
		panel2.add( labelSalary);
		
		// Initialize the labelSalaryRespond
		JLabel labelSalaryRespond = new JLabel( "---");
		labelSalaryRespond.setFont( new Font("Times New Roman", Font.BOLD, 14));
		labelSalaryRespond.setBounds( 69, 122, 50, 50);
		panel2.add( labelSalaryRespond);
		
		// Initialize the panel3
		JPanel panel3 = new JPanel();
		panel3.setBounds( 575, 146, 240, 210);
		frame.getContentPane().add( panel3);
		panel3.setLayout( null);
		
		// Initialize the labelRelevantInfo
		JLabel labelRelevantInfo = new JLabel( "Relevant Information:");
		labelRelevantInfo.setFont( new Font( "Times New Roman", Font.BOLD, 17));
		labelRelevantInfo.setBounds( 22, 20, 163, 50);
		panel3.add( labelRelevantInfo);
		
		// Initialize the labelRelevantInfoRespond
		JLabel labelRelevantInfoRespond = new JLabel( "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		labelRelevantInfoRespond.setFont( new Font( "Times New Roman", Font.BOLD, 17));
		labelRelevantInfoRespond.setBounds( 22, 57, 208, 50);
		panel3.add( labelRelevantInfoRespond);
		
		// Initialize the labelRelevantInfoRespond_1 
		JLabel labelRelevantInfoRespond_1 = new JLabel( "_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		labelRelevantInfoRespond_1.setFont( new Font( "Times New Roman", Font.BOLD, 17));
		labelRelevantInfoRespond_1.setBounds( 22, 92, 208, 50);
		panel3.add( labelRelevantInfoRespond_1);
		
		// Set the frame visible
		frame.setVisible( true);
	}
}
