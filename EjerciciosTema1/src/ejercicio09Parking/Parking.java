package ejercicio09Parking;

public class Parking implements Runnable {
	private static final Integer MAX_PLAZAS = 40;
	private Integer plazasOcupadas;

	public Parking() {
		plazasOcupadas = 0;
	}

	public void entrar(String puerta, Integer cochesQueQuierenEntrar) {
		if (cochesQueQuierenEntrar == 0) {
			return;
		}
		plazasOcupadas += cochesQueQuierenEntrar;
		imprimirMensajeEntrada(puerta, cochesQueQuierenEntrar);
	}

	public void salir(String puerta, Integer cochesQuePuedenSalir) {
		if (cochesQuePuedenSalir == 0) {
			return;
		}
		plazasOcupadas -= cochesQuePuedenSalir;
		imprimirMensajeSalida(puerta, cochesQuePuedenSalir);
	}

	// No hay que modificar nada de este  m�todo
	private void imprimirMensajeSalida(String puerta, Integer cochesQuePuedenSalir) {
		System.out.println("<<< " + puerta + " <<< Han salido " + cochesQuePuedenSalir + " // OCUPACI�N: "
				+ plazasOcupadas + getMsgAlerta());
	}

	// No hay que modificar nada de este m�todo
	private void imprimirMensajeEntrada(String puerta, Integer cochesQueQuierenEntrar) {
		System.out.println(">>> " + puerta + " >>> Han entrado " + cochesQueQuierenEntrar + " // OCUPACI�N: "
				+ plazasOcupadas + getMsgAlerta());
	}

	// No hay que modificar nada de este m�todo
	private String getMsgAlerta() {
		String alerta = "";
		if (plazasOcupadas < 0 || plazasOcupadas > MAX_PLAZAS) {
			alerta = " !!!";
		}
		return alerta;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
