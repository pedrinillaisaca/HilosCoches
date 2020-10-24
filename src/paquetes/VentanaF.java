package paquetes;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaF extends JFrame{
	private Panel p;
	
	
	public VentanaF(String [] params) {
		this.setSize(1300,700);
		getContentPane().setLayout(new BorderLayout());
		p=new Panel(params);
		add(p);
	}

	public void setxC1(int xC1) {
		this.p.setxC1(xC1);
	}
	public void setyC1(int yC1) {
		this.p.setyC1(yC1);
	}

	public void setxC2(int xC2) {
		this.p.setxC2(xC2);
	}
	public void setyC2(int yC2) {
		this.p.setyC2(yC2);
	}

	public void setxC3(int xC3) {
		this.p.setxC3(xC3);
	}
	public void setyC3(int yC3) {
		this.p.setyC3(yC3);
	}
	
	public void setxC4(int xC4) {
		this.p.setxC4(xC4);
	}
	public void setyC4(int yC4) {
		this.p.setyC4(yC4);
	}
	
	public void setC1info(String c1info) {
		this.p.setC1info(c1info);
	}
	
	public void setC2info(String c2info) {
		this.p.setC2info(c2info);
	}
	
	public void setC3info(String c3info) {
		this.p.setC3info(c3info);
	}

	public void setC4info(String c4info) {
		this.p.setC4info(c4info);
	}
}
