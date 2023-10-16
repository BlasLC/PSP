package ejercicio03;

public class EjecutarProceso {
	public void crearProceso() {
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "start", "dir");
		try {
			pb.start().getInputStream().read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
