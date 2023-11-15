package ejercicio09Parking;

import java.util.Random;

public abstract class Puerta implements Runnable {
	protected Parking parking;
	protected String nombre;

	public Puerta(Parking parking, String nombre) {
		this.parking = parking;
		this.nombre = nombre;
	}

	protected Integer calcularNumCochesPermitidos() {
		Random random = new Random();
		Integer num = random.nextInt(11);
		return num;
	}

	protected void esperarProximaApertura() throws InterruptedException {
		Random random = new Random();
		Integer num = random.nextInt(3) + 1;
		Thread.sleep((num) * 1000);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
