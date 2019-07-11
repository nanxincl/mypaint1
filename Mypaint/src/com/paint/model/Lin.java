package com.paint.model;

import java.awt.Color;
import java.awt.Graphics;
/**
 * 画一条线
 * 
 *
 */
public class Lin extends Myshape {

	@Override
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
	}
	/**
	 * 隐藏之前的绘图轨迹，只保留最后一个点作为终点
	 */

	@Override
	public void clear(Graphics g) {
		if (this.getP2()!= null) {
			g.setColor(Color.WHITE);
			g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
		}
	}
	

}
