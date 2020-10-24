package paquetes;

public class Coche extends Thread {

	private int x;
	private int y;
	private int vel;
	private int num_av;// numero de averias
	private int num_vueltas;

	public Coche(String str) {
		super(str);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVel() {
		return vel;
	}

	public void setVel(int vel) {
		this.vel = vel;
	}

	public int getNum_av() {
		return num_av;
	}

	public void setNum_av(int num_av) {
		this.num_av = num_av;
	}
	
	public int getNum_vueltas() {
		return num_vueltas;
	}

	public void setNum_vueltas(int num_vueltas) {
		this.num_vueltas = num_vueltas;
	}

	/*
	 * Metodos
	 */
	private int auxContAve = 0;

	public void provocarAberia() throws InterruptedException {
		this.num_av = num_av - auxContAve;
		//Thread.sleep(1000);
		correr();
		auxContAve += 1;
	}

	public void correr() throws InterruptedException {
		Thread.sleep(vel);// mientras menor sea el tiempo en quedarce dormido mas veloz sera el coche
		if(this.y<=1300) {
			this.y += 1;
		}else {
			this.y = -5;
			this.num_vueltas+=1;	
						
		}
				
	}

	public void en_marcha() throws InterruptedException {

		while (true) {
			correr();
			if (this.num_av >= 0) {
				int timeAveria = (int) Math.floor(Math.random() * 800 + 1);
				Thread.sleep(timeAveria);// Tiempo en el que la averia se disparará
				provocarAberia();
			} else {
				correr();
			}

		}

	}

	public void run() {
		
		String params[] = getName().split(",");

		this.x = Integer.parseInt(params[0]);
		this.y = Integer.parseInt(params[1]);
		this.vel = Integer.parseInt(params[2]);
		this.num_av = Integer.parseInt(params[3]);

		//System.out.println(this.x);
		try {
			en_marcha();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
