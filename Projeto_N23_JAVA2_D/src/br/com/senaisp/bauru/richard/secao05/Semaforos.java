package br.com.senaisp.bauru.richard.secao05;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Semaforos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int fase;
	
	public Semaforos(int fs) {
		fase = fs;
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRoundRect(10, 10, 50, 150, 5, 5);
		//Desenhando as bolinhas das cores
		Color ap = fase == 1 ? Color.red : Color.white;
		g.setColor(ap);
		g.fillOval(20, 20, 30, 30);
		
		//Se fase 3 pinta o meio em amarelo
		ap = fase == 3 ? Color.yellow : Color.white;
		g.setColor(ap);
		g.fillOval(20, 70, 30, 30);
		
		//Se fase 2 pinta verde no último
		ap = fase == 2 ? Color.green : Color.white;
		g.setColor(ap);
		g.fillOval(20, 120, 30, 30);
	}
}
