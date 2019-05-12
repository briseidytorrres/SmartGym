package Gym.Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class AdminEntrenadorView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminEntrenadorView frame = new AdminEntrenadorView();
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
	public AdminEntrenadorView() {
		setTitle("Entrenadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Activo", "Nombre", "Genero", "Fecha Ingreso"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(40);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(222);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(4).setResizable(false);
		table.getColumnModel().getColumn(4).setPreferredWidth(148);
		table.setBounds(34, 120, 448, 221);
		contentPane.add(table);
		
		JLabel lblEntrenadoresDisponibles = new JLabel("Entrenadores disponibles:");
		lblEntrenadoresDisponibles.setBounds(34, 84, 216, 20);
		contentPane.add(lblEntrenadoresDisponibles);
		
		JLabel lblEntrenadores = new JLabel("Entrenadores");
		lblEntrenadores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEntrenadores.setBounds(34, 0, 248, 68);
		contentPane.add(lblEntrenadores);
		
		JButton btnNewButton = new JButton("Nuevo entrenador");
		btnNewButton.setBounds(528, 117, 179, 47);
		contentPane.add(btnNewButton);
		
		JButton btnEliminarEntrenador = new JButton("Eliminar Entrenador");
		btnEliminarEntrenador.setBounds(528, 273, 179, 47);
		contentPane.add(btnEliminarEntrenador);
		
		JLabel lblBaja = new JLabel("Baja de entrenador");
		lblBaja.setBounds(528, 205, 179, 20);
		contentPane.add(lblBaja);
		
		JLabel lblIdEntrenador = new JLabel("ID Entrenador:");
		lblIdEntrenador.setBounds(528, 239, 113, 20);
		contentPane.add(lblIdEntrenador);
		
		textField = new JTextField();
		textField.setBounds(644, 236, 63, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAltaDeEntrenador = new JLabel("Alta de entrenador");
		lblAltaDeEntrenador.setBounds(528, 84, 179, 20);
		contentPane.add(lblAltaDeEntrenador);
	}
}
