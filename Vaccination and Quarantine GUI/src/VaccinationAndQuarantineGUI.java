import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class containing a frame for vaccination and quarantine
 * @author Arda YILDIZ
 * @version 02.05.2021
*/
public class VaccinationAndQuarantineGUI
{
	// Declare properties
	private JFrame frame;
	private JPanel vaccinationPanel;
	private JPanel quarantinePanel;
	private JLabel header;
	private JLabel labelVaccinationStatus;
	private JLabel labelIcon;
	private JLabel labelVaccinationDate;
	private JLabel labelVaccinationPlace;
	private JLabel labelVaccinationStatusRespond;
	private JLabel labelQuarantineStatus;
	private JLabel labelQuarantineStatusRespond;

	/**
	 * Constructor which initializes the properties
	*/
	public VaccinationAndQuarantineGUI()
	{
		// Initialize the frame
		frame = new JFrame();
	
		// Adjust the frame
		frame.setBounds( 0, 0, 859, 460);
		frame.setTitle( "Vaccination and Quarantine Details");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		frame.setResizable( false);
		frame.getContentPane().setLayout( null);
		frame.getContentPane().setBackground( Color.LIGHT_GRAY);
		
		// Initialize the vaccinationPanel
		vaccinationPanel = new JPanel();
		vaccinationPanel.setBounds( 315, 107, 518, 145);
		vaccinationPanel.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		vaccinationPanel.setOpaque( false);
		frame.getContentPane().add( vaccinationPanel);
		
		// Initialize the vaccinationPanel
		quarantinePanel = new JPanel();
		quarantinePanel.setBounds( 315, 260, 518, 50);
		quarantinePanel.setBorder( BorderFactory.createLineBorder( Color.BLACK));
		quarantinePanel.setOpaque( false);
		frame.getContentPane().add( quarantinePanel);
		
		// Initialize the header
		header= new JLabel( "Vaccination and Quarantine Details");
		header.setBackground( Color.WHITE);
		header.setForeground(new Color( 0, 100, 0));
		header.setFont(new Font("Times New Roman", Font.BOLD, 44));
		header.setHorizontalAlignment( SwingConstants.CENTER);
		header.setBounds( 63, 10, 722, 70);
		frame.getContentPane().add( header);
		
		// Initialize the labelVaccinationStatus
		labelVaccinationStatus = new JLabel( "Vaccination Status:");
		labelVaccinationStatus.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelVaccinationStatus.setBounds( 321, 107, 155, 50);
		frame.getContentPane().add( labelVaccinationStatus);
		
		// Create an image
		ImageIcon image = new ImageIcon( this.getClass().getResource( "/vaccination.png"));
		
		// Initialize the labelIcon
		labelIcon = new JLabel();
		labelIcon.setBackground( Color.PINK);
		labelIcon.setIcon( image);
		labelIcon.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelIcon.setBounds( 29, 77, 258, 323);
		frame.getContentPane().add( labelIcon);
		
		// Initialize the labelVaccinationDate
		labelVaccinationDate = new JLabel( "Vaccination Date: 03.07.2021");
		labelVaccinationDate.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelVaccinationDate.setBounds( 321, 158, 258, 50);
		frame.getContentPane().add( labelVaccinationDate);
		
		// Initialize the labelVaccinationPlace
		labelVaccinationPlace = new JLabel( "Vaccination Place: Clinic 245, Çankaya Health Center, Ankara.");
		labelVaccinationPlace.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelVaccinationPlace.setBounds( 321, 209, 514, 50);
		frame.getContentPane().add( labelVaccinationPlace);
		
		// Initialize the labelVaccinationStatusRespond
		labelVaccinationStatusRespond = new JLabel( "You are not vaccinated");
		labelVaccinationStatusRespond.setForeground( Color.RED);
		labelVaccinationStatusRespond.setFont( new Font( "Times New Roman", Font.BOLD, 20));
		labelVaccinationStatusRespond.setBounds( 487, 107, 215, 51);
		frame.getContentPane().add( labelVaccinationStatusRespond);
		
		
		// Initialize the labelQuarantineStatus
		labelQuarantineStatus = new JLabel( "Quarantine Status:");
		labelQuarantineStatus.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelQuarantineStatus.setBounds( 321, 260, 155, 50);
		frame.getContentPane().add( labelQuarantineStatus);
		
		// Initialize the labelQuarantineStatusRespond
		labelQuarantineStatusRespond = new JLabel( "You are not under quarantine");
		labelQuarantineStatusRespond.setForeground( new Color( 0, 0, 0));
		labelQuarantineStatusRespond.setFont(new Font( "Times New Roman", Font.PLAIN, 20));
		labelQuarantineStatusRespond.setBounds( 487, 260, 260, 51);
		frame.getContentPane().add( labelQuarantineStatusRespond);
		
		// Initialize the buttonScheduleAppointment
		JButton buttonScheduleAppointment = new JButton( "Schedule a new appointment");
		
		// Add actionListener to the buttonScheduleAppointment
		buttonScheduleAppointment.addActionListener( new ActionListener() 
		{
			/**
			 * Method which listens the actions performed
			 * @param event is an ActionEvent parameter
			 */
			public void actionPerformed( ActionEvent event) 
			{
				// Construct an appointment frame
				JFrame appointmentFrame;
				
				// Initialize the appointment frame
				appointmentFrame = new JFrame();
			
				// Adjust the appointment frame
				appointmentFrame.setBounds( 0, 0, 859, 460);
				appointmentFrame.setTitle( "Appointment Page");
				appointmentFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
				appointmentFrame.getContentPane().setLayout( null);
				appointmentFrame.getContentPane().setBackground( Color.LIGHT_GRAY);
				appointmentFrame.setVisible( true);
			}
		});
		
		// Initialize the buttonScheduleAppointment
		buttonScheduleAppointment.setBackground( new Color( 255, 235, 205));
		buttonScheduleAppointment.setForeground( new Color( 0, 0, 205));
		buttonScheduleAppointment.setFont( new Font( "Times New Roman", Font.BOLD, 20));
		buttonScheduleAppointment.setFocusable( false);
		buttonScheduleAppointment.setBounds( 532, 355, 285, 42);
		frame.getContentPane().add( buttonScheduleAppointment);
		
		// Set the frame visible
		frame.setVisible( true);	
	}	
}
