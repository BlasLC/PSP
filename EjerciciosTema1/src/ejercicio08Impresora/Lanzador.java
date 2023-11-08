package ejercicio08Impresora;

public class Lanzador {
	public static void main(String[] args) {
		Impresora impresora = new Impresora(); // única y compartida

		Usuario escritor1 = new Usuario("Blas", impresora);
		Thread hiloBlas = new Thread(escritor1);
		hiloBlas.start();

		Usuario escritor2 = new Usuario("Jose", impresora);
		Thread hiloJose = new Thread(escritor2);
		hiloJose.start();

		Usuario escritor3 = new Usuario("Nacho", impresora);
		Thread hiloNacho = new Thread(escritor3);
		hiloNacho.start();

	}
}
