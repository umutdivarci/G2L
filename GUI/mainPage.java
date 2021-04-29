import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;

public class mainPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtWelcomeToHealth;
	private JPasswordField passwordField_1;
	private JTextField txtUsername;
	private JTextField txtPassword;
	private JTextField txtDontHaveAn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage frame = new mainPage();
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
	public mainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeToHealth = new JTextField();
		txtWelcomeToHealth.setEditable(false);
		txtWelcomeToHealth.setForeground(new Color(255, 255, 240));
		txtWelcomeToHealth.setFont(new Font("Tahoma", Font.PLAIN, 40));
		txtWelcomeToHealth.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeToHealth.setText("Welcome to Health Tracker!");
		txtWelcomeToHealth.setBounds(0, 21, 655, 74);
		txtWelcomeToHealth.setBackground(new Color(46, 139, 87));
		contentPane.add(txtWelcomeToHealth);
		txtWelcomeToHealth.setColumns(10);
		
		JFormattedTextField frmtdtxtfldEnterUsernameHere = new JFormattedTextField();
		frmtdtxtfldEnterUsernameHere.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldEnterUsernameHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmtdtxtfldEnterUsernameHere.setBounds(232, 172, 202, 30);
		contentPane.add(frmtdtxtfldEnterUsernameHere);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(46, 139, 87));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(291, 278, 90, 30);
		contentPane.add(btnNewButton);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setBounds(232, 229, 202, 30);
		contentPane.add(passwordField_1);
		
		txtUsername = new JTextField();
		txtUsername.setOpaque(false);
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtUsername.setBorder(null);
		txtUsername.setBackground(Color.BLACK);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setText("Username:");
		txtUsername.setBounds(152, 179, 110, 19);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setOpaque(false);
		txtPassword.setText("Password:");
		txtPassword.setForeground(Color.WHITE);
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBackground(Color.BLACK);
		txtPassword.setBounds(152, 234, 110, 19);
		contentPane.add(txtPassword);
		
		txtDontHaveAn = new JTextField();
		txtDontHaveAn.setOpaque(false);
		txtDontHaveAn.setText("Don't have an account?");
		txtDontHaveAn.setForeground(Color.WHITE);
		txtDontHaveAn.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDontHaveAn.setColumns(10);
		txtDontHaveAn.setBorder(null);
		txtDontHaveAn.setBackground(Color.BLACK);
		txtDontHaveAn.setBounds(215, 347, 166, 19);
		contentPane.add(txtDontHaveAn);
		
		JButton btnSignUpHere = new JButton("Sign up here.");
		btnSignUpHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnSignUpHere.setBorder(null);
		btnSignUpHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSignUpHere.setOpaque(false);
		btnSignUpHere.setForeground(Color.BLUE);
		btnSignUpHere.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSignUpHere.setBackground(Color.WHITE);
		btnSignUpHere.setBounds(373, 341, 124, 30);
		contentPane.add(btnSignUpHere);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(mainPage.class.getResource("/icons/newIcon_190x190-removebg-preview.png")));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(232, 399, 190, 190);
		contentPane.add(lblNewLabel);
	}
}
