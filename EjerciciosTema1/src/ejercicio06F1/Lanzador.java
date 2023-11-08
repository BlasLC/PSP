package ejercicio06F1;

public class Lanzador {
	public static void main(String[] args) throws InterruptedException {
		Carrera carrera = new Carrera(1000);

		Coche cocheAlonso = new Coche("Alonso", 100, carrera);
		Thread hiloAlonso = new Thread(cocheAlonso);
		hiloAlonso.start();

		Coche cocheHamilton = new Coche("Hamilton", 101, carrera);
		Thread hiloHamilton = new Thread(cocheHamilton);
		hiloHamilton.start();

		Coche cocheSainz = new Coche("Sainz", 99, carrera);
		Thread hiloSainz = new Thread(cocheSainz);
		hiloSainz.start();

		hiloAlonso.join();
		hiloHamilton.join();
		hiloSainz.join();

		carrera.imprimirPodio();
	}
}
