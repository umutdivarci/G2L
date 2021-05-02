import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class HospitalMainPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeTo;
	private JLabel lblNewLabel_2;
	private JTextField txtUmutDivarc;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HospitalMainPage frame = new HospitalMainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	/**
	 * Create the frame.
	 */
	public HospitalMainPage( Hospital hospital) {
		Account account = new Account( "umutdivarci", "12345", "umut@hotmail.com");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1133, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Update Medical Data");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(813, 476, 211, 32);
		contentPane.add(btnNewButton);
		
		txtWelcomeTo = new JTextField();
		txtWelcomeTo.setEditable(false);
		txtWelcomeTo.setText("Welcome to Health Tracker!");
		txtWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeTo.setForeground(new Color(255, 255, 224));
		txtWelcomeTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtWelcomeTo.setColumns(10);
		txtWelcomeTo.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtWelcomeTo.setBackground(new Color(34, 139, 34));
		txtWelcomeTo.setBounds(0, 26, 1130, 38);
		contentPane.add(txtWelcomeTo);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setBackground(new Color(34, 139, 34));
		lblNewLabel_2.setBounds(0, 555, 1119, 38);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Doctors", "Nurses", "Secretaries", "Other Employees"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox.setBackground(new Color(34, 139, 34));
		comboBox.setForeground(Color.WHITE);
		comboBox.setToolTipText("");
		comboBox.setBounds(87, 292, 220, 48);
		comboBox.setSelectedItem("Hospital Staff");
		comboBox.setEditable(false);
		
        ActionListener cbActionListener = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "Doctors":
        				PatientSignUpPage frame1 = new PatientSignUpPage();
        				frame1.setVisible(true);
        				Window win1 = SwingUtilities.getWindowAncestor(contentPane);
        				win1.dispose();
                        break;
                        
                    case "Nurses":
        				PatientSignUpPage frame2 = new PatientSignUpPage();
        				frame2.setVisible(true);
        				Window win2 = SwingUtilities.getWindowAncestor(contentPane);
        				win2.dispose();
                        break;
                        
                    case "Secretaries":
        				PatientSignUpPage frame3 = new PatientSignUpPage();
        				frame3.setVisible(true);
        				Window win3 = SwingUtilities.getWindowAncestor(contentPane);
        				win3.dispose();
                        break;
                        
                    case "Other Employees":
        				PatientSignUpPage frame4 = new PatientSignUpPage();
        				frame4.setVisible(true);
        				Window win4 = SwingUtilities.getWindowAncestor(contentPane);
        				win4.dispose();
                        break;
                        
                    default:
                        break;
           
                }
            }
        };
        comboBox.addActionListener(cbActionListener);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEditable(true);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Hospital Records", "Available Resources", "Current Patients", "Laboratories"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setForeground(Color.WHITE);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_1.setBackground(new Color(34, 139, 34));
		comboBox_1.setBounds(347, 292, 204, 48);
		comboBox_1.setSelectedItem("Hospital Data");
		comboBox_1.setEditable(false);
		
        ActionListener cbActionListener1 = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox_1.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "Hospital Records":
        				PatientSignUpPage frame1 = new PatientSignUpPage();
        				frame1.setVisible(true);
        				Window win1 = SwingUtilities.getWindowAncestor(contentPane);
        				win1.dispose();
                        break;
                        
                    case "Available Resources":
        				PatientSignUpPage frame2 = new PatientSignUpPage();
        				frame2.setVisible(true);
        				Window win2 = SwingUtilities.getWindowAncestor(contentPane);
        				win2.dispose();
                        break;
                        
                    case "Current Patients":
        				PatientSignUpPage frame3 = new PatientSignUpPage();
        				frame3.setVisible(true);
        				Window win3 = SwingUtilities.getWindowAncestor(contentPane);
        				win3.dispose();
                        break;
                        
                    case "Laboratories":
        				PatientSignUpPage frame4 = new PatientSignUpPage();
        				frame4.setVisible(true);
        				Window win4 = SwingUtilities.getWindowAncestor(contentPane);
        				win4.dispose();
                        break;
                        
                    default:
                        break;
           
                }
            }
        };
        comboBox_1.addActionListener(cbActionListener1);
		contentPane.add(comboBox_1);
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PharmacyMainPage.class.getResource("/icons/profilSon_150x150.png")));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(87, 84, 150, 150);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Change Password", "Change E-mail", "Account Details"}));
		comboBox_2.setEditable(true);
		comboBox_2.setToolTipText("");
		comboBox_2.setForeground(Color.WHITE);
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_2.setBackground(new Color(34, 139, 34));
		comboBox_2.setBounds(587, 292, 186, 48);
		comboBox_2.setSelectedItem("My Account");
		comboBox_2.setEditable(false);
		
        ActionListener cbActionListener2 = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox_2.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "Change Password":
        				PatientSignUpPage frame1 = new PatientSignUpPage();
        				frame1.setVisible(true);
        				Window win1 = SwingUtilities.getWindowAncestor(contentPane);
        				win1.dispose();
                        break;
                        
                    case "Change E-mail":
        				PatientSignUpPage frame2 = new PatientSignUpPage();
        				frame2.setVisible(true);
        				Window win2 = SwingUtilities.getWindowAncestor(contentPane);
        				win2.dispose();
                        break;
                        
                    case "Account Details":
        				PatientSignUpPage frame3 = new PatientSignUpPage();
        				frame3.setVisible(true);
        				Window win3 = SwingUtilities.getWindowAncestor(contentPane);
        				win3.dispose();
                        break;
                        
                    default:
                        break;
           
                }
            }
        };
        comboBox_2.addActionListener(cbActionListener2);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Contact Us", "How to Use", "App Information"}));
		comboBox_3.setEditable(true);
		comboBox_3.setToolTipText("");
		comboBox_3.setForeground(Color.WHITE);
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		comboBox_3.setBackground(new Color(34, 139, 34));
		comboBox_3.setBounds(813, 292, 211, 48);
		comboBox_3.setSelectedItem("Help");
		comboBox_3.setEditable(false);
		
        ActionListener cbActionListener3 = new ActionListener() {//add actionlistner to listen for change
            @Override
            public void actionPerformed(ActionEvent e) {

                String s = (String) comboBox_3.getSelectedItem();//get the selected item

                switch (s) {//check for a match
                    case "Contact Us":
        				ContactUsPage frame1 = new ContactUsPage(hospital);
        				frame1.setVisible(true);
        				Window win1 = SwingUtilities.getWindowAncestor(contentPane);
        				win1.dispose();
                        break;
                        
                    case "How to Use":
        				HowToUsePage frame2 = new HowToUsePage(hospital);
        				frame2.setVisible(true);
        				Window win2 = SwingUtilities.getWindowAncestor(contentPane);
        				win2.dispose();
                        break;
                        
                    case "App Information":
        				AppInformationPage frame3 = new AppInformationPage(hospital);
        				frame3.setVisible(true);
        				Window win3 = SwingUtilities.getWindowAncestor(contentPane);
        				win3.dispose();
                        break;
                        
                    default:
                        break;
           
                }
            }
        };
        comboBox_3.addActionListener(cbActionListener3);
		contentPane.add(comboBox_3);
		
		txtUmutDivarc = new JTextField();
		txtUmutDivarc.setHorizontalAlignment(SwingConstants.CENTER);
		txtUmutDivarc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		txtUmutDivarc.setForeground(Color.WHITE);
		txtUmutDivarc.setOpaque(false);
		txtUmutDivarc.setEditable(false);
		txtUmutDivarc.setText("Ankara Hospital");
		txtUmutDivarc.setBounds(265, 139, 158, 38);
		contentPane.add(txtUmutDivarc);
		txtUmutDivarc.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1.setBounds(23, 0, 37, 692);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setBackground(new Color(34, 139, 34));
		lblNewLabel_1_1.setBounds(1052, -53, 37, 692);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(PharmacyMainPage.class.getResource("/icons/icon main page.png")));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(870, 84, 150, 150);
		contentPane.add(lblNewLabel_3);
		
	}
}