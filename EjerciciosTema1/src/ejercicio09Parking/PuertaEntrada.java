package ejercicio09Parking;

public class PuertaEntrada implements Runnable {
	public PuertaEntrada(Parking parking, String nombre) {
		super(parking, nombre);
	}

	public void trabajar() {
		while (true) {
			Integer cochesQuePermitimosEntrar = calcularNumCochesPermitidos();
			parking.entrar(nombre, cochesQuePermitimosEntrar);
			esperarProximaApertura();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
