package javaProject;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

public class JavaUser extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaUser frame = new JavaUser();
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
	public JavaUser() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(176, 196, 222), 3, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(176, 196, 222), 3, true));
		panel.setBounds(0, 0, 450, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblArrow = new JLabel("<");
		lblArrow.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
		lblArrow.setBounds(20, 11, 25, 41);
		panel.add(lblArrow);
		
		JLabel lblName = new JLabel("Wade Warren");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(54, 11, 161, 24);
		panel.add(lblName);
		
		JLabel lblOnline = new JLabel("Online");
		lblOnline.setForeground(new Color(169, 169, 169));
		lblOnline.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblOnline.setBounds(55, 38, 59, 14);
		panel.add(lblOnline);
		
		JLabel lblPhone = new JLabel("");
		lblPhone.setBounds(277, 24, 46, 20);
		Image img_chat_1 = new ImageIcon(this.getClass().getResource("/phone-call.png")).getImage();
		Image scaledUser_C_1 = img_chat_1.getScaledInstance(40, 20, Image.SCALE_SMOOTH);
		panel.add(lblPhone);
		lblPhone.setIcon(new ImageIcon(scaledUser_C_1));
		
		JLabel lblVideo = new JLabel("");
		lblVideo.setBounds(333, 17, 40, 30);
		Image img_chat_2 = new ImageIcon(this.getClass().getResource("/videox.png")).getImage();
		Image scaledUser_C_2 = img_chat_2.getScaledInstance(40, 30, Image.SCALE_SMOOTH);
		panel.add(lblVideo);
		lblVideo.setIcon(new ImageIcon(scaledUser_C_2));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(176, 196, 222), 3, true));
		panel_1.setBounds(0, 487, 450, 63);
		contentPane.add(panel_1);
	}
}
