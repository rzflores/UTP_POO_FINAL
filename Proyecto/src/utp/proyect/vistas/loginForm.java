package utp.proyect.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utp.proyect.dao.DaoPersona;
import utp.proyect.entidades.Persona;
import utp.proyect.utilitarios.polimorfismo.loginEmail;
import utp.proyect.utilitarios.polimorfismo.loginNumeroDocumento;
import utp.proyect.utilitarios.polimorfismo.loginPolimorfismo;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.Font;

public class loginForm extends JFrame {
	private JTextField textField;
	private JTextField txtDocOrEmail;
	private JTextField TxtContrasenia;
	private String isLoginInicial = "D";
	loginPolimorfismo obj;
	int resultLogin;
	public String getIsLoginInicial() {
		return isLoginInicial;
	}


	public void setIsLoginInicial(String isLoginInicial) {
		this.isLoginInicial = isLoginInicial;
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {					
					loginForm frame = new loginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public loginForm(boolean isLoginEmail) {
		
		setTitle("Bienvenido Odonto");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("Ingresar");		
		btnLogin.setBounds(85, 186, 247, 23);
		
		
		
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a");
		lblContrasenia.setBounds(107, 123, 73, 14);
		getContentPane().add(lblContrasenia);
		
		TxtContrasenia = new JTextField();
		TxtContrasenia.setBounds(190, 119, 120, 23);
		getContentPane().add(TxtContrasenia);
		TxtContrasenia.setColumns(10);
		
		
		JLabel lblLoginTitulo = new JLabel("Login");
		lblLoginTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLoginTitulo.setBounds(178, 11, 52, 32);
		getContentPane().add(lblLoginTitulo);
	
		
		if(isLoginEmail == true) {
									
			
			JLabel lblNumeroDoc = new JLabel("Email");
			lblNumeroDoc.setBounds(107, 74, 73, 14);
			getContentPane().add(lblNumeroDoc);
							
			
			txtDocOrEmail = new JTextField();
			txtDocOrEmail.setBounds(190, 70, 120, 23);
			getContentPane().add(txtDocOrEmail);
			txtDocOrEmail.setColumns(10);	
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					obj = new loginEmail();
					resultLogin =  obj.login("admin@odonto.com", "123456");
//					resultLogin =  obj.login(txtDocOrEmail.getText(), TxtContrasenia.getText());
					setVisible(false);
					System.out.println(resultLogin);
					if(resultLogin != 0) {
						DaoPersona d = new DaoPersona();						
						dashboardMenuForm framedashboardMenuForm = new dashboardMenuForm(resultLogin , d.obtenerRol(resultLogin));
						framedashboardMenuForm.setVisible(true);
					}else
					{
						MensajeNoLogin m = new MensajeNoLogin("Email o Contraseña Incorrecta");
						m.setVisible(true);
					}
					
				}
			});
						
			
			getContentPane().add(btnLogin);
			
		}
		else
		{
			JLabel lblNumeroDoc = new JLabel("DNI/CE");
			lblNumeroDoc.setBounds(107, 74, 73, 14);
			getContentPane().add(lblNumeroDoc);
			
			txtDocOrEmail = new JTextField();
			txtDocOrEmail.setBounds(190, 70, 120, 23);
			getContentPane().add(txtDocOrEmail);
			txtDocOrEmail.setColumns(10);
			
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					obj = new loginNumeroDocumento();
//					resultLogin = obj.login("ca-1235f", "123456");
					resultLogin =  obj.login(txtDocOrEmail.getText(), TxtContrasenia.getText());
					setVisible(false);	
					
					if(resultLogin != 0) {
						DaoPersona d = new DaoPersona();						
						dashboardMenuForm framedashboardMenuForm = new dashboardMenuForm(resultLogin , d.obtenerRol(resultLogin));
						framedashboardMenuForm.setVisible(true);
					}else
					{
						MensajeNoLogin m = new MensajeNoLogin("Dni o Contraseña Incorrecta");
						m.setVisible(true);
					}
					
					
				}
			});
			getContentPane().add(btnLogin);
		
		}
		
		
		
					
	}
	public loginForm() {}
}
