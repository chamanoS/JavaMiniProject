package javaProject;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	private JTextField txtFirstname;
	private JTextField textUsername;
	private JTextField txtEmail;
	private JTextField txtPsw;

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
		
		txtFirstname = new JTextField();
		txtFirstname.setBorder(null);
		txtFirstname.setFont(new Font("Arial", Font.PLAIN, 12));
		txtFirstname.setText("First Name");
		txtFirstname.setBounds(10, 11, 200, 15);
		username.add(txtFirstname);
		txtFirstname.setColumns(10);
		
		JPanel email = new JPanel();
		email.setLayout(null);
		email.setBackground(Color.WHITE);
		email.setBounds(66, 164, 250, 35);
		contentPane.add(email);
		
		textUsername = new JTextField();
		textUsername.setText("Username");
		textUsername.setFont(new Font("Arial", Font.PLAIN, 12));
		textUsername.setColumns(10);
		textUsername.setBorder(null);
		textUsername.setBounds(10, 11, 200, 15);
		email.add(textUsername);
		
		JPanel password = new JPanel();
		password.setLayout(null);
		password.setBackground(Color.WHITE);
		password.setBounds(66, 227, 250, 35);
		contentPane.add(password);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 12));
		txtEmail.setColumns(10);
		txtEmail.setBorder(null);
		txtEmail.setBounds(10, 11, 200, 15);
		password.add(txtEmail);
		
		JPanel confirm = new JPanel();
		confirm.setLayout(null);
		confirm.setBackground(Color.WHITE);
		confirm.setBounds(66, 287, 250, 35);
		contentPane.add(confirm);
		
		txtPsw = new JTextField();
		txtPsw.setText("Password");
		txtPsw.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPsw.setColumns(10);
		txtPsw.setBorder(null);
		txtPsw.setBounds(10, 11, 200, 15);
		confirm.add(txtPsw);
		
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
		
		// Add a mouse listener to your "Sign In" button
        pnlDSignInBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // When the "Sign In" button is clicked, perform the database insertion
                insertUserData();
            }
        });
	
	}
	
	
    // Method to insert user data into the database
    private void insertUserData() {
        String firstName = txtFirstname.getText();
        String username = textUsername.getText();
        String email = txtEmail.getText();
        String password = txtPsw.getText();

        try {
         
            String url = "jdbc:mysql://localhost:3306/loginuser";
            String user = "root";
            String passwords = "sc7431560IT$";

            // Establish the database connection
            Connection connection = DriverManager.getConnection(url, user, passwords);

            // Create a prepared statement to insert data
            String insertQuery = "INSERT INTO users (firstname, username, email, password) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);

            // Execute the insert query
            preparedStatement.executeUpdate();

            // Close the database connection
            preparedStatement.close();
            connection.close();

            JOptionPane.showMessageDialog(null, "User registered successfully!");

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
}
