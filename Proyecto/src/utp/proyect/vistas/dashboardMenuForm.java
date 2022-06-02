package utp.proyect.vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utp.proyect.dao.DaoMenuPermisos;
import utp.proyect.vistasUtilitarios.MenuPermisos;

import javax.swing.JLabel;

public class dashboardMenuForm extends JFrame {

	private JPanel contentPane;
	int posicionY = 20;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboardMenuForm frame = new dashboardMenuForm();
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
	public dashboardMenuForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	}
	
	public dashboardMenuForm(int id_usuario , String tipo_rol) {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloMenu = new JLabel("");
		lblTituloMenu.setBounds(137, 28, 102, 14);
		lblTituloMenu.setText(tipo_rol);
		contentPane.add(lblTituloMenu);
		
		
		DaoMenuPermisos Dmp = new DaoMenuPermisos();
		
		ArrayList<MenuPermisos> lstMenuPermisos =  Dmp.obtenerMenuPermisos(id_usuario);
		
		
		lstMenuPermisos.forEach(item -> {
			
			JButton btnMenu = new JButton(item.getNombre());
			btnMenu.setBounds(posicionY, 50 , 100, 60);			
			contentPane.add(btnMenu);
			posicionY = posicionY +  200;
			
			
			btnMenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					switch(item.getNombre()) 
					{
					case "Pácientes":
						System.out.println(item.getNombre());
						vistaUsuario vuP = new vistaUsuario();
						vuP.setVisible(true);
						setVisible(false);
					case "Doctores":
						System.out.println(item.getNombre());
						vistaUsuario vuD = new vistaUsuario();
						vuD.setVisible(true);
						setVisible(false);	
					}	
				}
			});
			
			
		} );
	}

}
