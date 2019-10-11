package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.font.TextAttribute;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField editUserName;
	private JLabel singUp;
	private JButton buttonSingIn;
	private Index index;
	private JPasswordField userPassword;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setResizable(false);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 502);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblConstructorCompany = new JLabel("Constructor Company");
		lblConstructorCompany.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblConstructorCompany.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblConstructorCompany);
		
		JLabel lblNewLabel = new JLabel("A company for the build of anything");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(58, 11, 289, 368);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		editUserName = new JTextField();
		editUserName.setBorder(new LineBorder(new Color(171, 173, 179), 1, true));
		editUserName.setHorizontalAlignment(SwingConstants.CENTER);
		editUserName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		editUserName.setBounds(10, 64, 269, 31);
		
		panel_5.add(editUserName);
		editUserName.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.GRAY);
		lblUsername.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_perm_identity_black_18dp.png"));
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(10, 11, 269, 31);
		panel_5.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.GRAY);
		lblPassword.setIcon(new ImageIcon("C:\\Users\\User\\Documents\\POO\\ConstructorCompany\\Images\\baseline_lock_black_18dp.png"));
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(10, 118, 269, 36);
		panel_5.add(lblPassword);
		
		JLabel lblForgotYourPassword = new JLabel("Forgot your password?");
		lblForgotYourPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblForgotYourPassword.setForeground(Color.GRAY);
		lblForgotYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblForgotYourPassword.setBounds(10, 223, 269, 28);
		lblForgotYourPassword.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Font font = lblForgotYourPassword.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblForgotYourPassword.setFont(font.deriveFont(attributes));
		panel_5.add(lblForgotYourPassword);
		
		buttonSingIn = new JButton("Sing In ");
		buttonSingIn.addActionListener(this);
		buttonSingIn.setForeground(Color.WHITE);
		buttonSingIn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		buttonSingIn.setBackground(new Color(45, 0, 255));
		buttonSingIn.setBounds(10, 266, 269, 29);
		buttonSingIn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_5.add(buttonSingIn);
		
		singUp = new JLabel("Don't have an account? Sing Up");
		singUp.setHorizontalAlignment(SwingConstants.CENTER);
		singUp.setForeground(Color.GRAY);
		singUp.setFont(new Font("Tahoma", Font.PLAIN, 13));
		singUp.setBounds(10, 316, 269, 28);
		singUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Font fontUp = lblForgotYourPassword.getFont();
		Map attributesUp = font.getAttributes();
		attributesUp.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		singUp.setFont(font.deriveFont(attributesUp));
		panel_5.add(singUp);
		
		userPassword = new JPasswordField();
		userPassword.setBounds(10, 175, 269, 30);
		panel_5.add(userPassword);
	}

	//Comienzo con el botón del login
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonSingIn) {
			setExtendedState(MAXIMIZED_BOTH);
			contentPane.removeAll();
			index = new Index();
			contentPane.add(index, BorderLayout.CENTER);
		}
	}
}
