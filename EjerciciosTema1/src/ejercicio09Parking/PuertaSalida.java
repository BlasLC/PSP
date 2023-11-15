package ejercicio09Parking;

public class PuertaSalida implements Runnable {
	public PuertaSalida(Parking parking, String nombre) {
		super(parking, nombre);
	}

	public void trabajar() {
		while (true) {
			Integer cochesQuePermitimosSalir = calcularNumCochesPermitidos();
			parking.salir(nombre, cochesQuePermitimosSalir);
			esperarProximaApertura();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
