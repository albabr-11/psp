package Ejercicios.HojaI.Ejercicio2;

public class HiloC extends Thread{
	private int c ;
	public HiloC(int c) {
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
