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
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JavaLanding extends JFrame {

	private JPanel contentPane;
	private JTextField textStory;
	private JTextField textUser_1;
	private JTextField textUser_2;
	private JTextField textUser_3;
	private JTextField textUser_4;
	private JTextField txtConvo;
	private JTextField txtAssaf;
	private JTextField txtAug;
	private JTextField txtConvo_1;
	private JTextField txtHeyImWaiting;
	private JTextField txtActiveNow;
	private JTextField txtChats;
	private JTextField textCall;
	private JTextField textField_1;

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
		lblSearch.setBounds(460, 0, 40, 41);
		Image img_search = new ImageIcon(this.getClass().getResource("/search.jpg")).getImage();
		Image scaledImage = img_search.getScaledInstance(40, 25, Image.SCALE_SMOOTH);
		panel.add(lblSearch);
		lblSearch.setIcon(new ImageIcon(scaledImage));
		
		JLabel lblSet = new JLabel("");
		lblSet.setBounds(523, 0, 40, 41);
		Image img_set = new ImageIcon(this.getClass().getResource("/set.png")).getImage();
		Image scaledset = img_set.getScaledInstance(40, 25, Image.SCALE_SMOOTH);
		panel.add(lblSet);
		lblSet.setIcon(new ImageIcon(scaledset));
		
		JLabel lblClose = new JLabel("X");
		lblClose.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null,"Are you sure you want to close this application?" ,"Confirmation",JOptionPane.YES_NO_OPTION)== 0) {
					JavaLanding.this.dispose();
				}
			}
		});
		lblClose.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		lblClose.setBounds(584, 0, 26, 41);
		panel.add(lblClose);
		
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
		
		JLabel lblRequest = new JLabel("Message Request (10)");
		lblRequest.setForeground(new Color(0, 0, 255));
		lblRequest.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblRequest.setBounds(467, 174, 153, 14);
		contentPane.add(lblRequest);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 199, 610, 245);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel User_1 = new JLabel("");
		User_1.setBounds(10, 31, 70, 70);
		Image img_user1 = new ImageIcon(this.getClass().getResource("/avt.png")).getImage();
		Image scaledUser_1 = img_user1.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		
		JLabel Green = new JLabel("");
		Green.setBounds(60, 200, 15, 15);
		Image img_userG = new ImageIcon(this.getClass().getResource("/active.png")).getImage();
		Image scaledUser_G = img_userG.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		panel_2.add(Green);
		Green.setIcon(new ImageIcon(scaledUser_G));
		panel_2.add(User_1);
		User_1.setIcon(new ImageIcon(scaledUser_1));
		
		txtConvo = new JTextField();
		txtConvo.setBorder(null);
		txtConvo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtConvo.setText("Allan Muray");
		txtConvo.setBounds(90, 44, 100, 20);
		panel_2.add(txtConvo);
		txtConvo.setColumns(10);
		
		txtAssaf = new JTextField();
		txtAssaf.setText("Morning Allan, Are you going to the game with us tonight?");
		txtAssaf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAssaf.setColumns(10);
		txtAssaf.setBorder(null);
		txtAssaf.setBounds(90, 62, 374, 20);
		panel_2.add(txtAssaf);
		
		txtAug = new JTextField();
		txtAug.setText("Aug, 18");
		txtAug.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtAug.setColumns(10);
		txtAug.setBorder(null);
		txtAug.setBounds(530, 44, 70, 20);
		panel_2.add(txtAug);
		
		JLabel User_2 = new JLabel("");
		User_2.setBounds(10, 144, 70, 70);
		Image img_user2 = new ImageIcon(this.getClass().getResource("/attr.png")).getImage();
		Image scaledUser_2 = img_user2.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		panel_2.add(User_2);
		User_2.setIcon(new ImageIcon(scaledUser_2));
		
		txtConvo_1 = new JTextField();
		txtConvo_1.setText("Assaf Rud");
		txtConvo_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtConvo_1.setColumns(10);
		txtConvo_1.setBorder(null);
		txtConvo_1.setBounds(90, 157, 100, 20);
		panel_2.add(txtConvo_1);
		
		txtHeyImWaiting = new JTextField();
		txtHeyImWaiting.setText("Hey, Im waiting for you outside.");
		txtHeyImWaiting.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtHeyImWaiting.setColumns(10);
		txtHeyImWaiting.setBorder(null);
		txtHeyImWaiting.setBounds(90, 175, 374, 20);
		panel_2.add(txtHeyImWaiting);
		
		txtActiveNow = new JTextField();
		txtActiveNow.setText("Active now");
		txtActiveNow.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtActiveNow.setColumns(10);
		txtActiveNow.setBorder(null);
		txtActiveNow.setBounds(514, 157, 86, 20);
		panel_2.add(txtActiveNow);
		
		JLabel Msg = new JLabel("");
		Msg.setBounds(571, 67, 15, 15);
		Image img_userM = new ImageIcon(this.getClass().getResource("/cycle.png")).getImage();
		Image scaledUser_M = img_userM.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
		panel_2.add(Msg);
		Msg.setIcon(new ImageIcon(scaledUser_M));
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 444, 610, 45);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblChat = new JLabel("");
		lblChat.setBounds(81, 0, 50, 30);
		Image img_chat = new ImageIcon(this.getClass().getResource("/num.jpg")).getImage();
		Image scaledUser_C = img_chat.getScaledInstance(40, 20, Image.SCALE_SMOOTH);
		panel_3.add(lblChat);
		lblChat.setIcon(new ImageIcon(scaledUser_C));
		
		txtChats = new JTextField();
		txtChats.setBackground(SystemColor.control);
		txtChats.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtChats.setBorder(null);
		txtChats.setText("Chats");
		txtChats.setBounds(81, 25, 50, 20);
		panel_3.add(txtChats);
		txtChats.setColumns(10);
		
		JLabel lblChat_1 = new JLabel("");
		lblChat_1.setBounds(279, 0, 50, 30);
		Image img_chat_1 = new ImageIcon(this.getClass().getResource("/call.png")).getImage();
		Image scaledUser_C_1 = img_chat_1.getScaledInstance(40, 20, Image.SCALE_SMOOTH);
		panel_3.add(lblChat_1);
		lblChat_1.setIcon(new ImageIcon(scaledUser_C_1));
		
		textCall = new JTextField();
		textCall.setText("Call");
		textCall.setFont(new Font("Tahoma", Font.BOLD, 14));
		textCall.setColumns(10);
		textCall.setBorder(null);
		textCall.setBackground(SystemColor.control);
		textCall.setBounds(289, 25, 33, 20);
		panel_3.add(textCall);
		
		JLabel lblChat_2 = new JLabel("");
		lblChat_2.setBounds(490, 0, 50, 30);
		Image img_chat_2 = new ImageIcon(this.getClass().getResource("/people.png")).getImage();
		Image scaledUser_C_2 = img_chat_2.getScaledInstance(40, 20, Image.SCALE_SMOOTH);
		panel_3.add(lblChat_2);
		lblChat_2.setIcon(new ImageIcon(scaledUser_C_2));
		
		textField_1 = new JTextField();
		textField_1.setText("Chats");
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBackground(SystemColor.control);
		textField_1.setBounds(490, 25, 50, 20);
		panel_3.add(textField_1);
		
		
		
	}
}
