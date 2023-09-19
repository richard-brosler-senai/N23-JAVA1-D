package br.com.senaisp.bauru.richard.licaobonus;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Triangulo extends JPanel {
	private static final long serialVersionUID = 1L;
	@Override
	public void paint(Graphics g) {
		int[] xPoints = {0, 40, 80};
		int[] yPoints = {50, 0, 50};
		g.setColor(Color.blue);
		g.fillPolygon(xPoints, yPoints, 3);
		int[] x2Points = {80, 160, 0};
		int[] y2Points = {50, 140, 140};
		g.setColor(Color.black);
		g.fillPolygon(x2Points, y2Points, 3);
	}
}
