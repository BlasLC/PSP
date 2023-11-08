package ejercicioBuzon;

public class Lanzador {
	public static void main(String[] args) throws InterruptedException {
		Buzon buzon = new Buzon();

		Emisor emisor = new Emisor(buzon);
		Thread hiloEmisor = new Thread(emisor);
		hiloEmisor.start();

		Receptor recp1 = new Receptor(buzon);
		Thread hiloRec1 = new Thread(recp1);
		hiloRec1.start();

		Receptor recp2 = new Receptor(buzon);
		Thread hiloRec2 = new Thread(recp2);
		hiloRec2.start();

		Receptor recp3 = new Receptor(buzon);
		Thread hiloRec3 = new Thread(recp3);
		hiloRec3.start();

		Receptor recp4 = new Receptor(buzon);
		Thread hiloRec4 = new Thread(recp4);
		hiloRec4.start();

		hiloRec1.join();

		hiloRec2.join();
		hiloRec3.join();
		hiloRec4.join();

	}
}
