package Ejercicios.HojaI.Ejercicio5;

public class PruebaJoin {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			HiloConJoin hilo = new HiloConJoin(i);
			hilo.start();
			try {
				hilo.join();
			} catch (InterruptedException e) {
				System.out.println("Se ha interrumpido el hilo " + i);
			}
		}

		System.out.println("Todos los hilos creados");
	}
}
