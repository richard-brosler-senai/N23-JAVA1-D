package br.com.senaisp.bauru.richard.secao05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Semaforo extends JPanel {

	/**
	 * 
	 */
	private int farol;
	public Semaforo(int fase) {
		farol=fase;
	}
	private static final long serialVersionUID = 1L;
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRoundRect(10, 10, 50, 150, 5, 5);
		if (farol == 1)
			g.setColor(Color.red);
		else
			g.setColor(Color.white);
		g.fillOval(20, 20, 30, 30);
		
		if (farol == 3)
			g.setColor(Color.yellow);
		else
			g.setColor(Color.white);
		g.fillOval(20, 70, 30, 30);
		if (farol == 2)
			g.setColor(Color.green);
		else
			g.setColor(Color.white);
		g.fillOval(20, 120, 30, 30);
	}
}
