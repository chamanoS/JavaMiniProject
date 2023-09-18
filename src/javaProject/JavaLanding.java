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

public class JavaLanding extends JFrame {

	private JPanel contentPane;

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
		
		JLabel lblNav = new JLabel("");
		lblNav.setBorder(new LineBorder(new Color(192, 192, 192)));
		lblNav.setBounds(10, 8, 610, 114);
		contentPane.add(lblNav);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(20, 21, 75, 75);
		Image img_logo = new ImageIcon(this.getClass().getResource("/avat.png")).getImage();
		Image scaledImage = img_logo.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
		contentPane.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(scaledImage));
		
		
		
	}
}
