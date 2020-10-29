package paquetes;

import java.util.ArrayList;

public class Retardo extends Thread {

	private boolean band;
//	private int c=0;
//	private ArrayList<Integer> tiempos;
//	public Retardo(ArrayList<Integer> tiempos) {
//		band=false;
//		this.tiempos=tiempos;
//	}

	
	public void run() {
		
		while(true) {			
			try {							
				Thread.sleep(1000);
				band=true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean isBand() {
		return band;
	}



	public void setBand(boolean band) {
		this.band = band;
	}
	
	
	

	
}
