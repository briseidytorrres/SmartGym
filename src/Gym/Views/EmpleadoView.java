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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EmpleadoView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpleadoView frame = new EmpleadoView();
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
	public EmpleadoView() {
		setTitle("Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccionaTuArea = new JLabel("Selecciona tu area:");
		lblSeleccionaTuArea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccionaTuArea.setBounds(47, 108, 135, 14);
		contentPane.add(lblSeleccionaTuArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Gimnasio");
		comboBox.addItem("Futbol");
		comboBox.addItem("Basquetbol");
		comboBox.addItem("VolleyBall");
		comboBox.addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				String itemSeleccionado = comboBox.getSelectedItem().toString();
				if(itemSeleccionado.equals("Gimnasio"))
				{
					Object [] turnos = {"Matutino","Vespertino","Nocturno"};
					Object opcion =JOptionPane.showInputDialog(null, "Selecciona tu turno de trabajo:", "Elegir", JOptionPane.QUESTION_MESSAGE, null, turnos, turnos[0]);
					dispose();
				}
			   }
		});
		comboBox.setBounds(192, 105, 146, 20);
		contentPane.add(comboBox);
		
		JLabel lblBuenDia = new JLabel("Buen dia");
		lblBuenDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuenDia.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblBuenDia.setBounds(47, 16, 280, 50);
		contentPane.add(lblBuenDia);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblId.setBounds(57, 138, 125, 20);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(192, 135, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("ADELANTE!");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(192, 208, 146, 50);
		contentPane.add(btnNewButton);
	}

}
