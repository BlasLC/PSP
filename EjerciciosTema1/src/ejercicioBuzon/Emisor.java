package ejercicioBuzon;

public class Emisor implements Runnable {

	private Buzon buzon;

	public Emisor(Buzon buzon) {
		this.buzon = buzon;
	}

	public void escribir() {
		Integer heLeido = 1;
		while (heLeido == 1) {
			if (buzon.getLibre() == 0) {
				System.out.println("Escritor: puedo escribir");
				buzon.setMensaje("Quiero ir a dormir");
				buzon.setLibre(1);
				heLeido = 0;
			}
		}
	}

	@Override
	public void run() {
		escribir();
	}

}
