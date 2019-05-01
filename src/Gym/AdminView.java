package Gym;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AdminView extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 684, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdministrador = new JLabel("Reportes por Áreas ");
		lblAdministrador.setBounds(181, 52, 118, 14);
		contentPane.add(lblAdministrador);
		
		JButton btnNewButton = new JButton("Gimnasio");
		
		GymReport GymWindow = new GymReport();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GymWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(41, 141, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Futbol");
		FutReport FutWindow = new FutReport();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FutWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(262, 141, 106, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Basquetbol");
		BasketReport BasketWindow = new BasketReport();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BasketWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(41, 264, 106, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Volleyball");
		VolleyReport VolleyWindow = new VolleyReport();
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VolleyWindow.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(262, 264, 106, 23);
		contentPane.add(btnNewButton_3);
	}

}
