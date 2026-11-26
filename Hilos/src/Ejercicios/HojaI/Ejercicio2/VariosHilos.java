package Ejercicios.HojaI.Ejercicio2;

public class VariosHilos {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			HiloC hilo = new HiloC(i);
			hilo.start();
		}

		System.out.println("Todos los hilos creados");
	}
}

/**
 * No en el orden entre hilos; sí en que todos acaban antes del mensaje final.
 * Siempre al final, tras acabar los 5 hilos.
 * 
 */
