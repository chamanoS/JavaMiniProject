package javaProject;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class JavaLanding extends JFrame {

	private JPanel contentPane;
	private JTextField textStory;
	private JTextField textUser_1;
	private JTextField textUser_2;
	private JTextField textUser_3;
	private JTextField textUser_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaLanding frame = new JavaLanding();
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
	public JavaLanding() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(176, 196, 222), 3, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		panel.setBounds(10, 11, 610, 39);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblChats = new JLabel("Chats");
		lblChats.setFont(new Font("Arial", Font.BOLD, 16));
		lblChats.setBounds(24, 0, 57, 41);
		panel.add(lblChats);
		
		JLabel lblSearch = new JLabel("");
		lblSearch.setBounds(471, 0, 40, 41);
		Image img_search = new ImageIcon(this.getClass().getResource("/search.jpg")).getImage();
		Image scaledImage = img_search.getScaledInstance(40, 25, Image.SCALE_SMOOTH);
		panel.add(lblSearch);
		lblSearch.setIcon(new ImageIcon(scaledImage));
		
		JLabel lblSet = new JLabel("");
		lblSet.setBounds(534, 0, 40, 41);
		Image img_set = new ImageIcon(this.getClass().getResource("/set.png")).getImage();
		Image scaledset = img_set.getScaledInstance(40, 25, Image.SCALE_SMOOTH);
		panel.add(lblSet);
		lblSet.setIcon(new ImageIcon(scaledset));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(192, 192, 192)));
		panel_1.setBounds(10, 52, 610, 111);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(10, 11, 70, 65);
		Image img_logo = new ImageIcon(this.getClass().getResource("/avtre.png")).getImage();
		Image scaledLogo = img_logo.getScaledInstance(70, 65, Image.SCALE_SMOOTH);
		
		JLabel lblAdd = new JLabel("");
		lblAdd.setBounds(60, 56, 20, 20);
		Image img_add = new ImageIcon(this.getClass().getResource("/add.png")).getImage();
		Image scaledAdd = img_add.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		panel_1.add(lblAdd);
		lblAdd.setIcon(new ImageIcon(scaledAdd));
		panel_1.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(scaledLogo));
		
	
		
		textStory = new JTextField();
		textStory.setBorder(null);
		textStory.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textStory.setText("Your Story");
		textStory.setBounds(10, 74, 83, 35);
		panel_1.add(textStory);
		textStory.setColumns(10);
		
		textUser_1 = new JTextField();
		textUser_1.setText("Assaf Rud");
		textUser_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textUser_1.setColumns(10);
		textUser_1.setBorder(null);
		textUser_1.setBounds(131, 74, 83, 35);
		panel_1.add(textUser_1);
		
		JLabel lblLogo_1 = new JLabel("");
		lblLogo_1.setBounds(131, 11, 70, 65);
		Image img_add_1 = new ImageIcon(this.getClass().getResource("/attr.png")).getImage();
		Image scaledAdd_1 = img_add_1.getScaledInstance(70, 65, Image.SCALE_SMOOTH);
		panel_1.add(lblLogo_1);
		lblLogo_1.setIcon(new ImageIcon(scaledAdd_1));
		
		textUser_2 = new JTextField();
		textUser_2.setText("Shariz Ruby");
		textUser_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textUser_2.setColumns(10);
		textUser_2.setBorder(null);
		textUser_2.setBounds(243, 74, 94, 35);
		panel_1.add(textUser_2);
		
		JLabel lblLogo_2 = new JLabel("");
		lblLogo_2.setBounds(254, 11, 70, 65);
		Image img_add_2 = new ImageIcon(this.getClass().getResource("/trans2.png")).getImage();
		Image scaledAdd_2 = img_add_2.getScaledInstance(70, 65, Image.SCALE_SMOOTH);
		panel_1.add(lblLogo_2);
		lblLogo_2.setIcon(new ImageIcon(scaledAdd_2));
		
		textUser_3 = new JTextField();
		textUser_3.setText("Ode Lonu");
		textUser_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textUser_3.setColumns(10);
		textUser_3.setBorder(null);
		textUser_3.setBounds(377, 74, 83, 35);
		panel_1.add(textUser_3);
		
		JLabel lblLogo_3 = new JLabel("");
		lblLogo_3.setBounds(377, 11, 70, 65);
		Image img_add_3 = new ImageIcon(this.getClass().getResource("/avtr.png")).getImage();
		Image scaledAdd_3 = img_add_3.getScaledInstance(70, 65, Image.SCALE_SMOOTH);
		panel_1.add(lblLogo_3);
		lblLogo_3.setIcon(new ImageIcon(scaledAdd_3));
		
		textUser_4 = new JTextField();
		textUser_4.setText("Ben Yahudah");
		textUser_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		textUser_4.setColumns(10);
		textUser_4.setBorder(null);
		textUser_4.setBounds(470, 74, 99, 35);
		panel_1.add(textUser_4);
		
		JLabel lblLogo_4 = new JLabel("");
		lblLogo_4.setBounds(486, 11, 70, 65);
		Image img_add_4 = new ImageIcon(this.getClass().getResource("/avt.png")).getImage();
		Image scaledAdd_4 = img_add_4.getScaledInstance(70, 65, Image.SCALE_SMOOTH);
		panel_1.add(lblLogo_4);
		lblLogo_4.setIcon(new ImageIcon(scaledAdd_4));
		
		
		
	}
}
