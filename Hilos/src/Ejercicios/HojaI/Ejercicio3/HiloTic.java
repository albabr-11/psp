package Ejercicios.HojaI.Ejercicio3;

public class HiloTic extends Thread {
	
	
	@Override
	public void run() {
		while (true) {
            System.out.println("TIC");
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
            	// TODO Auto-generated catch block
        		e.printStackTrace();
            }
        }
	}

}
