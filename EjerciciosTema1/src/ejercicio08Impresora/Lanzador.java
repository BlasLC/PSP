package ejercicio08Impresora;

public class Lanzador {

	public static void main(String[] args) {
		Impresora impresora = new Impresora(); // �nica y compartida

		Usuario escritor1 = new Usuario("Blas", impresora);
		Thread hiloEscritor1 = new Thread(escritor1);

		Usuario escritor2 = new Usuario("Jose", impresora);
		Thread hiloEscritor2 = new Thread(escritor2);

		Usuario escritor3 = new Usuario("Paco", impresora);
		Thread hiloEscritor3 = new Thread(escritor3);

		hiloEscritor1.start();
		hiloEscritor2.start();
		hiloEscritor3.start();

	}
}
