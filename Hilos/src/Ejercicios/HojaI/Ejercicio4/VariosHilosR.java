package Ejercicios.HojaI.Ejercicio4;

import Ejercicios.HojaI.Ejercicio2.HiloC;

public class VariosHilosR {
	public static void main(String[] args) {
		HiloCR c1 = new HiloCR(1);
		HiloCR c2 = new HiloCR(2);
		HiloCR c3 = new HiloCR(3);
		HiloCR c4 = new HiloCR(4);
		HiloCR c5 = new HiloCR(5);

		c1.run();
		c2.run();
		c3.run();
		c4.run();
		c5.run();

		

		System.out.println("todos los hilo screados");

	}
}
