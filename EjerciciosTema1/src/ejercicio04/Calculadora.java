package ejercicio04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ejercicio01.EjecutarProceso;
import javax.swing.JButton;

public class Calculadora {

	private JFrame frame;
	/**
	 * 
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * 
	 * Create the application.
	 * 
	 */
	public Calculadora() {
		initialize();
	}
	/**
	 * 
	 * Initialize the contents of the frame.
	 * 
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnBlocNotas = new JButton("Bloc de notas");
		btnBlocNotas.setBounds(10, 95, 208, 75);
		frame.getContentPane().add(btnBlocNotas);
		EjecutarProceso lp = new EjecutarProceso();
		btnBlocNotas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String ruta = "C:\\WINDOWS\\System32\\notepad.exe";
				for (Integer i = 0; i < 10000; i++) {
					lp.crearProceso(ruta);
				}
			}
		});

		JButton btnCalculadora = new JButton("Calculadora");
		btnCalculadora.setBounds(228, 95, 196, 75);
		frame.getContentPane().add(btnCalculadora);
		
		btnCalculadora.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ruta = "C:\\WINDOWS\\System32\\calc.exe";
				lp.crearProceso(ruta);
			}
		});
	}
}
