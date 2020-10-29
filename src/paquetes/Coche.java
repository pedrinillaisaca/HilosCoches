package paquetes;

import java.util.ArrayList;

public class Coche extends Thread {

	private int x;
	private int y;
	private int vel;
	private int num_av;// numero de averias
	private int num_vueltas;
	private Retardo retardo;

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

	public void correr() throws InterruptedException {
		Thread.sleep(vel);// mientras menor sea el tiempo en quedarce dormido mas veloz sera el coche
		if (this.y <= 1300) {
			this.y += 1;
		} else {
			this.y = -5;
			this.num_vueltas += 1;

		}

	}

	public void en_marcha() throws InterruptedException {
		while (true) {
			if (this.num_av >= 0 && !this.retardo.isBand()) {
				correr();
			} else if (retardo.isBand() && this.num_av > 0) {
				Thread.sleep(220);
				this.retardo.setBand(false);
				this.num_av--;
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
		// Generaion tiempos de retardo entre averias
		ArrayList<Integer> tiempos = new ArrayList<Integer>();
		for (int i = 0; i < this.num_av; i++) {
			tiempos.add((int) Math.floor(Math.random() * 9 + 1));
		}

		this.retardo = new Retardo();
		this.retardo.start();
		try {
			en_marcha();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
