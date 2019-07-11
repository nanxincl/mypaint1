package com.paint.model;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Myshape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawRect(getStartX(), getStartY(), getWidth(), getHeight());
	}
	
	@Override
	public void clear(Graphics g) {
		if (this.getP2()!=null) {
			g.setColor(Color.white);
			g.drawRect(getStartX(), getStartY(), getWidth(), getHeight());
		}
	}

}
