package ejercicioBuzon;

public class Receptor implements Runnable {

	private Buzon buzon;

	public Receptor(Buzon buzon) {
		this.buzon = buzon;
	}

	public void leerMensaje() {
		Integer heLeido = 0;
		while (heLeido == 0) {
			try {
				if (buzon.getLibre() == 1) {
					System.out.println("Lector: puedo leer");
					System.out.println(buzon.getMensaje());

					System.out.println("Lector: He terminado");
					buzon.setLibre(0);
					heLeido = 1;
				} else {
					System.out.println("No hay mensaje para leer");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		System.out.println("Empiezo");
		leerMensaje();
	}

}
