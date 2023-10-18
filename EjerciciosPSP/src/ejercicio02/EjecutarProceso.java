package ejercicio02;

public class EjecutarProceso {
	public void crearProceso() {
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "start", "dir");
		//Process procesi = new procesi.getInputStream();
		try {
			
			pb.start().getInputStream().read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
