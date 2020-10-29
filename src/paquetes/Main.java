package paquetes;

import java.awt.event.ActionEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = (int) Math.floor(Math.random() * 10 + 1);
		int v2= (int) Math.floor(Math.random() * 10 + 1);
		int v3= (int) Math.floor(Math.random() * 10 + 1);
		int v4= (int) Math.floor(Math.random() * 10 + 1);
		
		
		int av1 = (int) Math.floor(Math.random() * 20 + 1);
		int av2= (int) Math.floor(Math.random() * 20 + 1);
		int av3= (int) Math.floor(Math.random() * 20 + 1);
		int av4= (int) Math.floor(Math.random() * 20 + 1);
		
		Coche c1=new Coche("45,1,"+String.valueOf(v1)+","+String.valueOf(av1));//Parms pos x , pos y, velocidad, num_averias//
		Coche c2=new Coche("145,1,"+String.valueOf(v2)+","+String.valueOf(av2));//Parms pos x , pos y, velocidad, num_averias//
		Coche c3=new Coche("245,1,"+String.valueOf(v3)+","+String.valueOf(av3));//Parms pos x , pos y, velocidad, num_averias//
		Coche c4=new Coche("345,1,"+String.valueOf(v4)+","+String.valueOf(av4));//Parms pos x , pos y, velocidad, num_averias//

		
		Escucha e=new Escucha(c1,c2,c3,c4);
		e.start();
		
		
	    

	}

}
