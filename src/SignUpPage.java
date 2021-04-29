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

public class SignUpPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtEmail;
	private JTextField txtUsername;
	private JTextField txtIdentityNo;
	private JTextField txtSignUp;
	private JTextField txtAlreadyHaveAn;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
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
	/**
	 * Create the frame.
	 */
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 657);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JFormattedTextField frmtdtxtfldEnterUsernameHere = new JFormattedTextField();
		frmtdtxtfldEnterUsernameHere.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldEnterUsernameHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmtdtxtfldEnterUsernameHere.setBounds(232, 135, 202, 30);
		contentPane.add(frmtdtxtfldEnterUsernameHere);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(46, 139, 87));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(292, 313, 90, 30);
		contentPane.add(btnNewButton);
		
		JFormattedTextField frmtdtxtfldEnterUsernameHere_1 = new JFormattedTextField();
		frmtdtxtfldEnterUsernameHere_1.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldEnterUsernameHere_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmtdtxtfldEnterUsernameHere_1.setBounds(232, 195, 202, 30);
		contentPane.add(frmtdtxtfldEnterUsernameHere_1);
		
		textField = new JTextField();
		textField.setText("Password:");
		textField.setOpaque(false);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 11));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBackground(Color.BLACK);
		textField.setBounds(142, 255, 110, 19);
		contentPane.add(textField);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail:");
		txtEmail.setOpaque(false);
		txtEmail.setForeground(Color.WHITE);
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBackground(Color.BLACK);
		txtEmail.setBounds(142, 202, 110, 19);
		contentPane.add(txtEmail);
		
		txtUsername = new JTextField();
		txtUsername.setText("Username");
		txtUsername.setOpaque(false);
		txtUsername.setForeground(Color.WHITE);
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtUsername.setEditable(false);
		txtUsername.setColumns(10);
		txtUsername.setBorder(null);
		txtUsername.setBackground(Color.BLACK);
		txtUsername.setBounds(142, 142, 110, 19);
		contentPane.add(txtUsername);
		
		JFormattedTextField frmtdtxtfldEnterUsernameHere_2 = new JFormattedTextField();
		frmtdtxtfldEnterUsernameHere_2.setHorizontalAlignment(SwingConstants.LEFT);
		frmtdtxtfldEnterUsernameHere_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmtdtxtfldEnterUsernameHere_2.setBounds(232, 84, 202, 30);
		contentPane.add(frmtdtxtfldEnterUsernameHere_2);
		
		txtIdentityNo = new JTextField();
		txtIdentityNo.setText("Identity No:");
		txtIdentityNo.setOpaque(false);
		txtIdentityNo.setForeground(Color.WHITE);
		txtIdentityNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtIdentityNo.setEditable(false);
		txtIdentityNo.setColumns(10);
		txtIdentityNo.setBorder(null);
		txtIdentityNo.setBackground(Color.BLACK);
		txtIdentityNo.setBounds(142, 91, 110, 19);
		contentPane.add(txtIdentityNo);
		
		txtSignUp = new JTextField();
		txtSignUp.setEditable(false);
		txtSignUp.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtSignUp.setForeground(Color.WHITE);
		txtSignUp.setHorizontalAlignment(SwingConstants.CENTER);
		txtSignUp.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtSignUp.setText("Sign Up");
		txtSignUp.setBackground(new Color(46, 139, 87));
		txtSignUp.setBounds(0, 22, 655, 38);
		contentPane.add(txtSignUp);
		txtSignUp.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(46, 139, 87));
		lblNewLabel_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1.setBounds(0, 560, 655, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1_1.setBackground(new Color(46, 139, 87));
		lblNewLabel_1_1.setBounds(22, -17, 37, 692);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("New label");
		lblNewLabel_1_1_1.setOpaque(true);
		lblNewLabel_1_1_1.setForeground(new Color(46, 139, 87));
		lblNewLabel_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_1_1_1.setBackground(new Color(46, 139, 87));
		lblNewLabel_1_1_1.setBounds(590, -17, 37, 692);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnLogInHere = new JButton("Log in here.");
		btnLogInHere.setOpaque(false);
		btnLogInHere.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogInHere.setForeground(Color.BLUE);
		btnLogInHere.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLogInHere.setBorder(null);
		btnLogInHere.setBackground(Color.WHITE);
		btnLogInHere.setBounds(379, 361, 124, 30);
		contentPane.add(btnLogInHere);
		btnLogInHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					MainPage frame = new MainPage();
					frame.setVisible(true);
					Window win = SwingUtilities.getWindowAncestor(contentPane);
					win.dispose();
			}
		});
		
		txtAlreadyHaveAn = new JTextField();
		txtAlreadyHaveAn.setText("Already have an account?");
		txtAlreadyHaveAn.setOpaque(false);
		txtAlreadyHaveAn.setForeground(Color.WHITE);
		txtAlreadyHaveAn.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtAlreadyHaveAn.setEditable(false);
		txtAlreadyHaveAn.setColumns(10);
		txtAlreadyHaveAn.setBorder(null);
		txtAlreadyHaveAn.setBackground(Color.BLACK);
		txtAlreadyHaveAn.setBounds(203, 367, 220, 19);
		contentPane.add(txtAlreadyHaveAn);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(232, 250, 202, 30);
		contentPane.add(passwordField);
	}
}
