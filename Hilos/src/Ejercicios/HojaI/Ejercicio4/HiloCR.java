package Ejercicios.HojaI.Ejercicio4;

public class HiloCR implements Runnable {
	private int c ;
	public HiloCR(int c) {
		this.c=c;
		System.out.println("Creando hilo "+c);
	}

	@Override
	public void run() {
		 
		for(int i=0;i<5;i++) {
			System.out.println("Hilo "+c+" linea "+(i+1));
		}
	}

}

