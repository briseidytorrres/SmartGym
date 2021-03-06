package Gym.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewEntrenadorView extends JFrame {

	private JPanel contentPane;
	private JTextField txtsePoneAutomatico;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEntrenadorView frame = new NewEntrenadorView();
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
	public NewEntrenadorView() {
		setTitle("Nuevo Entrenador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTuId = new JLabel("Tu ID:");
		lblTuId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTuId.setBounds(35, 102, 109, 20);
		contentPane.add(lblTuId);
		
		txtsePoneAutomatico = new JTextField();
		txtsePoneAutomatico.setHorizontalAlignment(SwingConstants.CENTER);
		txtsePoneAutomatico.setEditable(false);
		txtsePoneAutomatico.setText("*se pone automatico*");
		txtsePoneAutomatico.setBounds(159, 99, 232, 26);
		contentPane.add(txtsePoneAutomatico);
		txtsePoneAutomatico.setColumns(10);
		
		JLabel lblSeleccionaTuGimnasio = new JLabel("Gimnasio:");
		lblSeleccionaTuGimnasio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccionaTuGimnasio.setBounds(35, 144, 109, 20);
		contentPane.add(lblSeleccionaTuGimnasio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Gym 1", "Gym 2", "Gym 3"}));
		comboBox.setBounds(159, 141, 232, 26);
		contentPane.add(comboBox);
		
		JLabel lblCreandoTuNuevo = new JLabel("Nuevo Entrenador");
		lblCreandoTuNuevo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCreandoTuNuevo.setBounds(62, 16, 329, 70);
		contentPane.add(lblCreandoTuNuevo);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(62, 186, 82, 20);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(159, 183, 232, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGenero.setBounds(62, 228, 82, 20);
		contentPane.add(lblGenero);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Femenino", "Masculino"}));
		comboBox_1.setBounds(159, 225, 232, 26);
		contentPane.add(comboBox_1);
		
		JButton btnAdelante = new JButton("ADELANTE!");			
		btnAdelante.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdelante.setBounds(182, 292, 156, 56);
		contentPane.add(btnAdelante);
	}
}
