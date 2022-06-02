package utp.proyect.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class initForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initForm frame = new initForm();
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
	public initForm() {
		setTitle("OdontioSys");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 400, 340, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoginEmail = new JButton("Email");
		btnLoginEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginForm loginFormEmail = new loginForm(true);
				loginFormEmail.setVisible(true);
				setVisible(false);
			}
		});
		btnLoginEmail.setBounds(52, 95, 89, 23);
		contentPane.add(btnLoginEmail);
		
		JButton btnLoginDoc = new JButton("DNI O CE");
		btnLoginDoc.setBounds(182, 95, 89, 23);
		btnLoginDoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginForm loginFormDoc = new loginForm(false);
				loginFormDoc.setVisible(true);
				setVisible(false);
				
			}
		});
		contentPane.add(btnLoginDoc);
		
		JLabel lblTitleInit = new JLabel("\u00BFComo deseas Acceder?");
		lblTitleInit.setFont(new Font("Arial", Font.PLAIN, 15));
		lblTitleInit.setBounds(74, 43, 212, 30);
		contentPane.add(lblTitleInit);
	}

}
