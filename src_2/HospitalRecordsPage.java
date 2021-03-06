import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 * Class containing a frame for hospital records
 * @author Arda YILDIZ
 * @version 02.05.2021
*/
public class HospitalRecordsPage extends JFrame
{
	// Declare properties
	private JFrame frame;
	private JTextField txtHospitalRecords;
	private JTextField textField_1;
	
	/**
	 * Constructor which initializes the properties
	*/
	public HospitalRecordsPage(Hospital hospital)
	{
		// Initialize the frame
		frame = new JFrame();
				
		// Adjust the frame
		frame.setBounds( 0, 0, 859, 460);
		frame.setTitle( "Hospital Records");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setResizable( false);
		frame.getContentPane().setLayout( null);
		frame.getContentPane().setBackground( new Color(0, 0, 0));
		
		// Initialize the labelTotalBeds
		JLabel labelTotalBeds = new JLabel( "Total Number of Beds:");
		labelTotalBeds.setForeground(Color.WHITE);
		labelTotalBeds.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelTotalBeds.setBounds( 10, 182, 150, 70);
		frame.getContentPane().add( labelTotalBeds);
		
		// Initialize the labelTotalBedsRespond
		JLabel labelTotalBedsRespond = new JLabel("720");
		labelTotalBedsRespond.setForeground(Color.WHITE);
		labelTotalBedsRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelTotalBedsRespond.setBounds(202, 182, 128, 70);
		frame.getContentPane().add(labelTotalBedsRespond);
		
		// Initialize the labelAvailableBeds
		JLabel labelAvailableBeds = new JLabel( "Number of Available Beds:");
		labelAvailableBeds.setForeground(Color.WHITE);
		labelAvailableBeds.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelAvailableBeds.setBounds( 10, 243, 192, 70);
		frame.getContentPane().add( labelAvailableBeds);
		
		// Initialize the labelAvailableBedsRespond
		JLabel labelAvailableBedsRespond = new JLabel( "420");
		labelAvailableBedsRespond.setForeground(Color.WHITE);
		labelAvailableBedsRespond.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelAvailableBedsRespond.setBounds( 202, 243, 128, 70);
		frame.getContentPane().add( labelAvailableBedsRespond);
		
		// Initialize the labelAdress
		JLabel labelAdress = new JLabel( "Adress:");
		labelAdress.setForeground(Color.WHITE);
		labelAdress.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelAdress.setBounds( 10, 123, 74, 70);
		frame.getContentPane().add( labelAdress);
		 
		// Initialize the labelAdressRespond
		JLabel labelAdressRespond = new JLabel( "7th Avenue, Bilkent, Ankara.");
		labelAdressRespond.setForeground(Color.WHITE);
		labelAdressRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelAdressRespond.setBounds( 75, 123, 210, 70);
		frame.getContentPane().add( labelAdressRespond);
		
		// Initialize the labelMedicalBranches
		JLabel labelMedicalBranches = new JLabel( "Medical Branches");
		labelMedicalBranches.setForeground(Color.WHITE);
		labelMedicalBranches.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelMedicalBranches.setHorizontalAlignment( SwingConstants.CENTER);
		labelMedicalBranches.setBounds( 341, 77, 231, 70);
		frame.getContentPane().add( labelMedicalBranches);
		
		// Initialize the panel
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 0));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(340, 136, 231, 178);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 2, 0, 0));
		
		// Initialize the labelCardiology
		JLabel labelCardiology = new JLabel("Cardiology");
		labelCardiology.setForeground(Color.WHITE);
		labelCardiology.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(labelCardiology);
		labelCardiology.setBackground(new Color(0, 128, 0));
		labelCardiology.setHorizontalAlignment(SwingConstants.CENTER);
		labelCardiology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelPsychiatry
		JLabel labelPsychiatry = new JLabel("Psychiatry\r\n");
		labelPsychiatry.setForeground(Color.WHITE);
		labelPsychiatry.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(labelPsychiatry);
		labelPsychiatry.setBackground(new Color(0, 128, 0));
		labelPsychiatry.setHorizontalAlignment(SwingConstants.CENTER);
		labelPsychiatry.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelOncology
		JLabel labelOncology = new JLabel( "Oncology");
		labelOncology.setForeground(Color.WHITE);
		labelOncology.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(labelOncology);
		labelOncology.setBackground(new Color(0, 128, 0));
		labelOncology.setHorizontalAlignment( SwingConstants.CENTER);
		labelOncology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelGastrology
		JLabel labelGastrology = new JLabel("Gastrology");
		labelGastrology.setForeground(Color.WHITE);
		labelGastrology.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(labelGastrology);
		labelGastrology.setBackground(new Color(0, 128, 0));
		labelGastrology.setHorizontalAlignment(SwingConstants.CENTER);
		labelGastrology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelOrthopaedics
		JLabel labelOrthopaedics = new JLabel("Orthopaedics");
		labelOrthopaedics.setForeground(Color.WHITE);
		labelOrthopaedics.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(labelOrthopaedics);
		labelOrthopaedics.setBackground(new Color(0, 128, 0));
		labelOrthopaedics.setHorizontalAlignment(SwingConstants.CENTER);
		labelOrthopaedics.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelNephrology
		JLabel labelNephrology = new JLabel("Nephrology");
		labelNephrology.setForeground(Color.WHITE);
		labelNephrology.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(labelNephrology);
		labelNephrology.setBackground(new Color(0, 128, 0));
		labelNephrology.setHorizontalAlignment(SwingConstants.CENTER);
		labelNephrology.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelTotalEmployees
		JLabel labelTotalEmployees = new JLabel("Total Number of Employees:");
		labelTotalEmployees.setForeground(Color.WHITE);
		labelTotalEmployees.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelTotalEmployees.setBounds(10, 304, 192, 70);
		frame.getContentPane().add(labelTotalEmployees);
		
		// Initialize the panel2
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(34, 139, 34));
		panel2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel2.setBounds(600, 136, 231, 178);
		frame.getContentPane().add(panel2);
		panel2.setLayout(new GridLayout(3, 2, 0, 0));
		
		// Initialize the labelLab2
		JLabel labelLab2 = new JLabel("Lab - LCM313");
		labelLab2.setForeground(Color.WHITE);
		labelLab2.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelLab2.setBackground(new Color(0, 128, 0));
		labelLab2.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab2.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab2);
		
		// Initialize the labelLab3
		JLabel labelLab3 = new JLabel("Lab - RVN482");
		labelLab3.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelLab3.setForeground(Color.WHITE);
		labelLab3.setBackground(new Color(0, 128, 0));
		labelLab3.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab3.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab3);
		
		// Initialize the labelLab4
		JLabel labelLab4 = new JLabel("Lab - RVN483");
		labelLab4.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelLab4.setForeground(Color.WHITE);
		labelLab4.setBackground(new Color(0, 128, 0));
		labelLab4.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab4.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab4);
		
		// Initialize the labelLab6
		JLabel labelLab6 = new JLabel("Lab - SQW595");
		labelLab6.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelLab6.setForeground(Color.WHITE);
		labelLab6.setBackground(new Color(0, 128, 0));
		labelLab6.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab6.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		panel2.add(labelLab6);
		
		// Initialize the labelLab1
		JLabel labelLab1 = new JLabel("Lab - LCM312");
		labelLab1.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelLab1.setForeground(Color.WHITE);
		panel2.add(labelLab1);
		labelLab1.setBackground(new Color(0, 128, 0));
		labelLab1.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab1.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelLab5
		JLabel labelLab5 = new JLabel("Lab - SQW594");
		panel2.add(labelLab5);
		labelLab5.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelLab5.setForeground(Color.WHITE);
		labelLab5.setBackground(new Color(0, 128, 0));
		labelLab5.setHorizontalAlignment(SwingConstants.CENTER);
		labelLab5.setBorder(BorderFactory.createLineBorder( Color.BLACK));
		
		// Initialize the labelLaboratoriesList
		JLabel labelLaboratoriesList = new JLabel("Laboratories List");
		labelLaboratoriesList.setForeground(Color.WHITE);
		labelLaboratoriesList.setFont(new Font("Tahoma", Font.BOLD, 13));
		labelLaboratoriesList.setHorizontalAlignment(SwingConstants.CENTER);
		labelLaboratoriesList.setBounds(600, 77, 231, 70);
		frame.getContentPane().add(labelLaboratoriesList);
		
		// Initialize the labelTotalEmployeesRespond
		JLabel labelTotalEmployeesRespond = new JLabel("1000");
		labelTotalEmployeesRespond.setBounds(202, 310, 229, 58);
		frame.getContentPane().add(labelTotalEmployeesRespond);
		labelTotalEmployeesRespond.setForeground(Color.WHITE);
		labelTotalEmployeesRespond.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		txtHospitalRecords = new JTextField();
		txtHospitalRecords.setText("Hospital Records");
		txtHospitalRecords.setHorizontalAlignment(SwingConstants.CENTER);
		txtHospitalRecords.setForeground(new Color(255, 255, 224));
		txtHospitalRecords.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtHospitalRecords.setEditable(false);
		txtHospitalRecords.setColumns(10);
		txtHospitalRecords.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtHospitalRecords.setBackground(new Color(34, 139, 34));
		txtHospitalRecords.setBounds(-124, 29, 1130, 38);
		frame.getContentPane().add(txtHospitalRecords);
		
		JButton btnSignUpHere = new JButton("");
		btnSignUpHere.setIcon(new ImageIcon(VaccinationPage.class.getResource("/icons/809922_arrows_512x512_55x55.png")));
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

					HospitalMainPage frame1 = new HospitalMainPage(hospital);
					frame1.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(frame.getContentPane());
					win.dispose();
			}
		});
		btnSignUpHere.setOpaque(false);
		btnSignUpHere.setForeground(Color.BLUE);
		btnSignUpHere.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSignUpHere.setBackground(Color.WHITE);
		btnSignUpHere.setBounds(10, 77, 55, 55);
		frame.getContentPane().add(btnSignUpHere);
		
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setForeground(new Color(255, 255, 224));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		textField_1.setBackground(new Color(34, 139, 34));
		textField_1.setBounds(-147, 378, 1130, 38);
		frame.getContentPane().add(textField_1);
		
		// Set the frame visible
		frame.setVisible( true);
	}	
}