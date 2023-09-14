package javaProject;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;

public class JavaRegister extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField textEmail;
	private JTextField txtPassword;
	private JTextField txtConfirmPsw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaRegister frame = new JavaRegister();
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
	public JavaRegister() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new LineBorder(new Color(169, 169, 169), 3));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtImageBanner = new JLabel("");
		txtImageBanner.setBounds(368, 102, 187, 294);
		Image img_banner = new ImageIcon(this.getClass().getResource("/sign.png")).getImage();
		contentPane.add(txtImageBanner);
		txtImageBanner.setIcon(new ImageIcon(img_banner));
		
		JPanel username = new JPanel();
		username.setBackground(Color.WHITE);
		username.setBounds(66, 102, 250, 35);
		contentPane.add(username);
		username.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 11, 200, 15);
		username.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel email = new JPanel();
		email.setLayout(null);
		email.setBackground(Color.WHITE);
		email.setBounds(66, 164, 250, 35);
		contentPane.add(email);
		
		textEmail = new JTextField();
		textEmail.setText("Email");
		textEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		textEmail.setColumns(10);
		textEmail.setBorder(null);
		textEmail.setBounds(10, 11, 200, 15);
		email.add(textEmail);
		
		JPanel password = new JPanel();
		password.setLayout(null);
		password.setBackground(Color.WHITE);
		password.setBounds(66, 227, 250, 35);
		contentPane.add(password);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPassword.setColumns(10);
		txtPassword.setBorder(null);
		txtPassword.setBounds(10, 11, 200, 15);
		password.add(txtPassword);
		
		JPanel confirm = new JPanel();
		confirm.setLayout(null);
		confirm.setBackground(Color.WHITE);
		confirm.setBounds(66, 287, 250, 35);
		contentPane.add(confirm);
		
		txtConfirmPsw = new JTextField();
		txtConfirmPsw.setText("Confirm Password");
		txtConfirmPsw.setFont(new Font("Arial", Font.PLAIN, 12));
		txtConfirmPsw.setColumns(10);
		txtConfirmPsw.setBorder(null);
		txtConfirmPsw.setBounds(10, 11, 200, 15);
		confirm.add(txtConfirmPsw);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(66, 346, 250, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel pnlDSignInBtn = new JLabel("Sign In");
		pnlDSignInBtn.setForeground(Color.WHITE);
		pnlDSignInBtn.setFont(new Font("Arial", Font.BOLD, 18));
		pnlDSignInBtn.setBounds(97, 11, 99, 30);
		panel.add(pnlDSignInBtn);
		
		JLabel pnlExit = new JLabel("X");
		pnlExit.setForeground(Color.WHITE);
		pnlExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to close this application?" ,"Confirmation",JOptionPane.YES_NO_OPTION)== 0) {
					JavaRegister.this.dispose();
				}
			}
		});
		pnlExit.setVerticalTextPosition(SwingConstants.BOTTOM);
		pnlExit.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		pnlExit.setBounds(597, 0, 29, 37);
		contentPane.add(pnlExit);
	
	}
}
