package Gym.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Gym.Controladores.BasketReport;
import Gym.Controladores.FutReport;
import Gym.Controladores.GymReport;
import Gym.Controladores.VolleyReport;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AdminView extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombreDelGym;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView frame = new AdminView();
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
	public AdminView() {
		setTitle("Administrador ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdministrador = new JLabel("Reportes de area");
		lblAdministrador.setBounds(41, 31, 284, 38);
		contentPane.add(lblAdministrador);
		
		JButton btnNewButton = new JButton("Gimnasio");
		
		GymReport GymWindow = new GymReport();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GymWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(41, 74, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Futbol");
		FutReport FutWindow = new FutReport();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FutWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(41, 114, 106, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Box");
		BasketReport BasketWindow = new BasketReport();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasketWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(41, 158, 106, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Voleibol");
		VolleyReport VolleyWindow = new VolleyReport();
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VolleyWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(41, 197, 106, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnClientesRegistrados = new JButton("Clientes Registrados");
		btnClientesRegistrados.setBounds(290, 135, 195, 38);
		contentPane.add(btnClientesRegistrados);
		
		JButton btnNewButton_4 = new JButton("Entrenadores");
		btnNewButton_4.setBounds(290, 189, 195, 38);
		contentPane.add(btnNewButton_4);
		
		JLabel lblInformacionDelGimnasio = new JLabel("Informacion del gimnasio");
		lblInformacionDelGimnasio.setBounds(290, 40, 195, 20);
		contentPane.add(lblInformacionDelGimnasio);
		
		txtnombreDelGym = new JTextField();
		txtnombreDelGym.setHorizontalAlignment(SwingConstants.CENTER);
		txtnombreDelGym.setEditable(false);
		txtnombreDelGym.setText("*Nombre del gym*");
		txtnombreDelGym.setBounds(290, 72, 195, 26);
		contentPane.add(txtnombreDelGym);
		txtnombreDelGym.setColumns(10);
	}

}
