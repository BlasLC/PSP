package ejercicioBuzon;

public class Buzon {
	private String mensaje;
	private Integer libre;

	public Buzon() {
		libre = 0;
	}

	public synchronized String leer() {
		return mensaje;
	}

	public synchronized void escribir(String palabra) {
		mensaje = palabra;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Integer getLibre() {
		return libre;
	}

	public void setLibre(Integer libre) {
		this.libre = libre;
	}

	@Override
	public String toString() {
		return "Buzon [mensaje=" + mensaje + ", libre=" + libre + "]";
	}

}
