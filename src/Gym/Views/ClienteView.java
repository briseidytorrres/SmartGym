package Gym.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class ClienteView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteView frame = new ClienteView();
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
	public ClienteView() {
		setTitle("Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("ID:");
		lblCliente.setBounds(339, 138, 59, 41);
		contentPane.add(lblCliente);
		
		textField = new JTextField();
		textField.setBounds(413, 138, 146, 41);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblTurno = new JLabel("Turno:");
		lblTurno.setBounds(339, 195, 59, 38);
		contentPane.add(lblTurno);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Matutino", "Vespertino", "Nocturno"}));
		comboBox.setBounds(413, 195, 146, 41);
		contentPane.add(comboBox);
		
		JLabel lblBienvenido = new JLabel("BIENVENIDO");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBienvenido.setBounds(217, 16, 220, 65);
		contentPane.add(lblBienvenido);
		
		JLabel lbleresNuevo = new JLabel("\u00BFEres nuevo?");
		lbleresNuevo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbleresNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		lbleresNuevo.setBounds(29, 73, 257, 59);
		contentPane.add(lbleresNuevo);
		
		JButton btnRegistrateya = new JButton("Registrate \u00A1YA!");
		btnRegistrateya.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegistrateya.setBounds(78, 148, 166, 53);
		contentPane.add(btnRegistrateya);
		
		JLabel lblIniciaSesin = new JLabel("Inicia sesi\u00F3n...");
		lblIniciaSesin.setBounds(339, 73, 146, 59);
		contentPane.add(lblIniciaSesin);
		
		JButton btnAdelante = new JButton("ADELANTE!");
		btnAdelante.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdelante.setBounds(413, 316, 146, 54);
		contentPane.add(btnAdelante);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setBounds(339, 251, 69, 38);
		contentPane.add(lblArea);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Gimnasio", "Futbol", "Box", "Voleibol"}));
		comboBox_1.setBounds(413, 252, 146, 36);
		contentPane.add(comboBox_1);
	}
}
