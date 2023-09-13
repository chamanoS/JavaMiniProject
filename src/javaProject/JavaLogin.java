package javaProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JavaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaLogin frame = new JavaLogin();
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
	public JavaLogin() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 626, 492);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(0, 139, 139));
		contentPane.setBorder(new LineBorder(new Color(169, 169, 169), 3));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel txtUserfield = new JPanel();
		txtUserfield.setBackground(Color.WHITE);
		txtUserfield.setBounds(186, 269, 250, 35);
		contentPane.add(txtUserfield);
		txtUserfield.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		txtUsername.setBounds(10, 11, 200, 15);
		txtUsername.setText("Username");
		txtUserfield.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(186, 335, 250, 35);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtPassword = new JTextField();
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 11, 200, 15);
		panel_1.add(txtPassword);
		txtPassword.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(186, 401, 250, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel pnlLoginBtn = new JLabel("Log In");
		pnlLoginBtn.setForeground(Color.WHITE);
		pnlLoginBtn.setFont(new Font("Arial", Font.BOLD, 18));
		pnlLoginBtn.setBounds(97, 11, 99, 30);
		panel.add(pnlLoginBtn);
		
		JLabel pnlExit = new JLabel("X");
		pnlExit.setForeground(Color.WHITE);
		pnlExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to close the application?" ,"Confirmation",JOptionPane.YES_NO_OPTION)== 0) {
					JavaLogin.this.dispose();
				}
			}
		});
		pnlExit.setVerticalTextPosition(SwingConstants.BOTTOM);
		pnlExit.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		pnlExit.setBounds(597, 0, 29, 37);
		contentPane.add(pnlExit);
		
		JLabel pnlLogo = new JLabel("");
		pnlLogo.setBounds(205, 40, 206, 189);
		Image img_logo = new ImageIcon(this.getClass().getResource("/images.jpg")).getImage();
		contentPane.add(pnlLogo);
		pnlLogo.setIcon(new ImageIcon(img_logo));
		setLocationRelativeTo(null);
	}
}
