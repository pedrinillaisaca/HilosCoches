package paquetes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Panel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Image coche1,coche2,coche3,coche4;
	private int xC1,yC1;	
	private int xC2,yC2;
	private int xC3,yC3;
	private int xC4,yC4;
	private String c1info,c2info,c3info,c4info;
	//private String pathC1;//,pathC2,pathC3,pathC4;		
	public Panel(String [] params) {
		setBackground(Color.BLUE);		
		this.coche1=Toolkit.getDefaultToolkit().getImage(params[0]);
		this.coche2=Toolkit.getDefaultToolkit().getImage(params[1]);
		this.coche3=Toolkit.getDefaultToolkit().getImage(params[2]);
		this.coche4=Toolkit.getDefaultToolkit().getImage(params[3]);
	}
	
	public void paint(Graphics g) {
		super.paint(g);

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 1300, 5);

		g.setColor(Color.BLACK);
		g.fillRect(0, 100, 1300, 5);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 200, 1300, 5);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 300, 1300, 5);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 400, 1300, 5);
		


		Graphics2D g2 = (Graphics2D) g;

		g2.drawImage(coche1, this.yC1, this.xC1, this);
		g2.drawImage(coche2, this.yC2, this.xC2, this);
		g2.drawImage(coche3, this.yC3, this.xC3, this);
		g2.drawImage(coche4, this.yC4, this.xC4, this);
		
		g2.setColor(Color.white);
		Font fon = new Font("Comic Sans MS", Font.BOLD, 25);
		g2.setFont(fon);
		
		g2.drawString("Coche 1 vuelta numero:"+c1info, 20, 550);
		g2.drawString("Coche 2 vuelta numero:"+c2info, 20, 575);
		g2.drawString("Coche 3 vuelta numero:"+c3info, 20, 600);
		g2.drawString("Coche 4 vuelta numero:"+c4info, 20, 625);

	}	

	/**Set	 * */
	public void setxC1(int xC1) {
		this.xC1 = xC1;
	}

	public void setyC1(int yC1) {
		this.yC1 = yC1;
	}
	
	public void setxC2(int xC2) {
		this.xC2 = xC2;
	}

	public void setyC2(int yC2) {
		this.yC2 = yC2;
	}
	
	public void setxC3(int xC3) {
		this.xC3 = xC3;
	}

	public void setyC3(int yC3) {
		this.yC3 = yC3;
	}
	
	public void setxC4(int xC4) {
		this.xC4 = xC4;
	}

	public void setyC4(int yC4) {
		this.yC4 = yC4;
	}

	public String getC1info() {
		return c1info;
	}

	public void setC1info(String c1info) {
		this.c1info = c1info;
	}

	public String getC2info() {
		return c2info;
	}

	public void setC2info(String c2info) {
		this.c2info = c2info;
	}

	public String getC3info() {
		return c3info;
	}

	public void setC3info(String c3info) {
		this.c3info = c3info;
	}

	public String getC4info() {
		return c4info;
	}

	public void setC4info(String c4info) {
		this.c4info = c4info;
	}
	
	
	
	/**Set	 * */
	
	
	
	
}
