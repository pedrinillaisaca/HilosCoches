package paquetes;

public class Escucha extends Thread{
	private Coche c1,c2,c3,c4;
	private VentanaF v; 
	
	public Escucha(Coche c1,Coche c2,Coche c3,Coche c4) {
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		this.c4=c4;
		String [] params= {"c1.png","c2.png","c3.png","c4.png"};//imagenes de los diferentes coches
		this.v=new VentanaF(params);
		this.v.setVisible(true);
	}
	@SuppressWarnings("deprecation")
	public void run () {		
		//c=new Coche("10,10,200,5");//Parms pos x , pos y, velocidad, num_averias
		
		this.c1.start();
		this.c2.start();
		this.c3.start();
		this.c4.start();
		
		while(true) {
			try {
				Thread.sleep(90);
				//System.out.println("Mov: "+ this.c2.getY()+" Averias: "+this.c2.getNum_av());
				this.v.setxC1(this.c1.getX());//envio de datos a la ventana
				this.v.setyC1(this.c1.getY());//envio de datos a la ventana	
				this.v.setC1info(String.valueOf(this.c1.getNum_vueltas()));
				this.v.setC1Ave(String.valueOf(this.c1.getNum_av()));
				if(this.c1.getNum_vueltas()==5)
					this.c1.interrupt();
				
				this.v.setxC2(this.c2.getX());//envio de datos a la ventana
				this.v.setyC2(this.c2.getY());//envio de datos a la ventana
				this.v.setC2info(String.valueOf(this.c2.getNum_vueltas()));
				this.v.setC2Ave(String.valueOf(this.c2.getNum_av()));
				if(this.c2.getNum_vueltas()==5)
					this.c2.interrupt();
				
				this.v.setxC3(this.c3.getX());//envio de datos a la ventana
				this.v.setyC3(this.c3.getY());//envio de datos a la ventana
				this.v.setC3info(String.valueOf(this.c3.getNum_vueltas()));
				this.v.setC3Ave(String.valueOf(this.c3.getNum_av()));
				if(this.c3.getNum_vueltas()==5)
					this.c3.interrupt();
				
				this.v.setxC4(this.c4.getX());//envio de datos a la ventana
				this.v.setyC4(this.c4.getY());//envio de datos a la ventana
				this.v.setC4info(String.valueOf(this.c4.getNum_vueltas()));
				this.v.setC4Ave(String.valueOf(this.c4.getNum_av()));
				if(this.c4.getNum_vueltas()==5)
					this.c4.interrupt();
				this.v.repaint();
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
