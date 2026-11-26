package Ejercicios.HojaI.Ejercicio5;

public class HiloConJoin extends Thread{
	private int c;

	public HiloConJoin(int c) {
		this.c = c;
		System.out.println("Creando Hilo " + c);
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hilo " + c + " linea " + (i + 1));
		}
	}
}
