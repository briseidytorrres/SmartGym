package Gym.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class PrincipalView extends JFrame {

	private JPanel contentPane;

	
	public PrincipalView() {
		setTitle("SmartGym");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(89, 30, 191, 52);
		contentPane.add(lblBienvenido);
		
		ClienteView window2 = new ClienteView();
		
		
		JButton btnCliente = new JButton("CLIENTE");
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window2.setVisible(true);
				dispose();
			}
		});
		btnCliente.setBounds(89, 137, 191, 23);
		contentPane.add(btnCliente);

		EmpleadoView window3 = new EmpleadoView();
		
		JButton btnEmpleado = new JButton("EMPLEADO");
		btnEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window3.setVisible(true);
				dispose();
			}
		});
		btnEmpleado.setBounds(89, 176, 191, 23);
		contentPane.add(btnEmpleado);
		
		AdminView window4 = new AdminView();
		
		JButton btnAdministrador = new JButton("ADMINISTRADOR");
		btnAdministrador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				window4.setVisible(true);
				dispose();
			}
		});
		btnAdministrador.setBounds(89, 98, 191, 23);
		contentPane.add(btnAdministrador);
	}
	

}
