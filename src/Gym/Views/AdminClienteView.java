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
import javax.swing.SwingConstants;

public class AdminClienteView extends JFrame {

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
					AdminClienteView frame = new AdminClienteView();
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
	public AdminClienteView() {
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nombre", "Genero", "Fecha Ingreso", "Estatus", "Ultima Visita", "Turno"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(50);
		table.getColumnModel().getColumn(1).setPreferredWidth(276);
		table.getColumnModel().getColumn(3).setPreferredWidth(122);
		table.getColumnModel().getColumn(5).setPreferredWidth(123);
		table.setBounds(34, 120, 448, 221);
		contentPane.add(table);
		
		JLabel lblEntrenadoresDisponibles = new JLabel("Clientes Actuales:");
		lblEntrenadoresDisponibles.setBounds(34, 84, 216, 20);
		contentPane.add(lblEntrenadoresDisponibles);
		
		JLabel lblEntrenadores = new JLabel("Clientes");
		lblEntrenadores.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEntrenadores.setBounds(34, 0, 248, 68);
		contentPane.add(lblEntrenadores);
		
		JButton btnEliminarEntrenador = new JButton("Eliminar Cliente");
		btnEliminarEntrenador.setBounds(528, 273, 179, 47);
		contentPane.add(btnEliminarEntrenador);
		
		JLabel lblBaja = new JLabel("Baja de cliente");
		lblBaja.setBounds(528, 205, 179, 20);
		contentPane.add(lblBaja);
		
		JLabel lblIdEntrenador = new JLabel("ID Cliente:");
		lblIdEntrenador.setBounds(528, 239, 113, 20);
		contentPane.add(lblIdEntrenador);
		
		textField = new JTextField();
		textField.setBounds(644, 236, 63, 26);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
