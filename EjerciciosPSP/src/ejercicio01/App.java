package ejercicio01;

public class App {
	public static void main(String[] args) {
		String ruta = "C:\\\\WINDOWS\\\\system32\\\\notepad.exe";
		EjecutarProceso proceso = new EjecutarProceso();
		proceso.crearProceso(ruta);
		System.out.println("Finalizado");
	}
}
