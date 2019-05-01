package Gym;

import java.awt.EventQueue;

public class Principal 
{
	public static void main(String[] args) 
	{
		PrincipalView window = new PrincipalView();
		window.setVisible(true);
		/*EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalView frame = new PrincipalView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});*/
	}
}
