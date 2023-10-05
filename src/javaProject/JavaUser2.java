package javaProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class JavaUser2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaUser2 frame = new JavaUser2();
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
	public JavaUser2() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(176, 196, 222), 3, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(176, 196, 222), 3, true));
		panel.setBounds(0, 0, 450, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblArrow = new JLabel("<");
		lblArrow.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblArrow.setBounds(20, 11, 25, 41);
		panel.add(lblArrow);
		
		JLabel lblName = new JLabel("Jude Brown");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(54, 11, 161, 24);
		panel.add(lblName);
		
		JLabel lblOnline = new JLabel("Online");
		lblOnline.setForeground(new Color(169, 169, 169));
		lblOnline.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOnline.setBounds(55, 38, 59, 14);
		panel.add(lblOnline);
		
		JLabel lblMainUser = new JLabel("");
		lblMainUser.setBounds(330, 6, 75, 50);
		Image img_user = new ImageIcon(this.getClass().getResource("/avtr.png")).getImage();
		Image scaledUser = img_user.getScaledInstance(75, 60, Image.SCALE_SMOOTH);
		panel.add(lblMainUser);
		lblMainUser.setIcon(new ImageIcon(scaledUser));
		

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 476, 430, 63);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMogi = new JLabel("");
		lblMogi.setBounds(15, 18, 40, 30);
		Image img_emogi = new ImageIcon(this.getClass().getResource("/keyboard.png")).getImage();
		Image scaledEmogi = img_emogi.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		panel_1.add(lblMogi);
		lblMogi.setIcon(new ImageIcon(scaledEmogi));
		
		JLabel lblSend = new JLabel("");
		lblSend.setBounds(385, 13, 50, 36);
		Image img_send = new ImageIcon(this.getClass().getResource("/send.png")).getImage();
		Image scaledSend = img_send.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		panel_1.add(lblSend);
		lblSend.setIcon(new ImageIcon(scaledSend));
		
		JTextField textField = new JTextField();
		textField.setBounds(65, 11, 310, 41);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JTextField textField1 = new JTextField();
		textField1.setBounds(116, 187, 240, 39);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JTextField textField_1 = new JTextField();
		textField_1.setBounds(102, 326, 203, 39);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel parent = new JLabel("");
		parent.setBorder(new LineBorder(new Color(245, 245, 245)));
		Image img_user1 = new ImageIcon(this.getClass().getResource("/man.png")).getImage();
		Image scaledSendx = img_user1.getScaledInstance(70, 60, Image.SCALE_SMOOTH);
		parent.setBounds(32, 160, 390, 90);
		contentPane.add(parent);
		parent.setIcon(new ImageIcon(scaledSendx));
		
		JLabel wraper = new JLabel("");
		wraper.setBounds(48, 177, 61, 60);
		contentPane.add(wraper);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(245, 245, 245)));
		lblNewLabel.setBounds(32, 303, 390, 90);
		contentPane.add(lblNewLabel);
		
		JLabel imgHolder = new JLabel("");
		imgHolder.setBounds(327, 317, 71, 60);
		Image img_user2 = new ImageIcon(this.getClass().getResource("/avt.png")).getImage();
		Image scaledSendy = img_user2.getScaledInstance(70, 60, Image.SCALE_SMOOTH);
		contentPane.add(imgHolder);
		imgHolder.setIcon(new ImageIcon(scaledSendy));
	}

}
