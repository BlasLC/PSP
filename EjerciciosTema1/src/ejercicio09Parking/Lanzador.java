package ejercicio09Parking;

public class Lanzador {
	public static void main(String[] args) {
		Parking parking = new Parking();

		PuertaEntrada entrada1 = new PuertaEntrada(parking, "Seat");
		Thread hiloEntrada1 = new Thread();
		hiloEntrada1.start();

		PuertaEntrada entrada2 = new PuertaEntrada(parking, "Renault");
		Thread hiloEntrada2 = new Thread();
		hiloEntrada2.start();

		PuertaSalida salida1 = new PuertaSalida(parking, "Seat");
		Thread hiloSalida1 = new Thread();
		hiloSalida1.start();

		PuertaSalida salida2 = new PuertaSalida(parking, "Renault");
		Thread hiloSalida2 = new Thread();
		hiloSalida2.start();
		
	}
}
