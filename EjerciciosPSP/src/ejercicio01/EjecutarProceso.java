package ejercicio01;

public class EjecutarProceso {
	public void crearProceso(String ruta) {
		ProcessBuilder pb = new ProcessBuilder(ruta);
		try {
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
