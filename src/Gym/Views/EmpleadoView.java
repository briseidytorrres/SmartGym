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

public class EmpleadoView extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 677, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeleccionaTuArea = new JLabel("Selecciona tu area:");
		lblSeleccionaTuArea.setBounds(47, 28, 135, 14);
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
		comboBox.setBounds(192, 25, 135, 20);
		contentPane.add(comboBox);
	}

}
