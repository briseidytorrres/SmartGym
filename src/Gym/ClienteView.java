package Gym;

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

public class ClienteView extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 683, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Selecciona tu area");
		lblCliente.setBounds(33, 22, 133, 14);
		contentPane.add(lblCliente);
		
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
					Object opcion =JOptionPane.showInputDialog(null, "Selecciona el turno en que estas ingresando al gym", "Elegir", JOptionPane.QUESTION_MESSAGE, null, turnos, turnos[0]);
					JOptionPane.showMessageDialog(null, "¡Bienvenido!");
					dispose();
				}
			   }
		});
		
		comboBox.setBounds(176, 19, 133, 20);
		contentPane.add(comboBox);
	}
}
