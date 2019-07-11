package com.paint.model;

import java.awt.Color;
import java.awt.Graphics;
/**
 * ��һ����
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
	 * ����֮ǰ�Ļ�ͼ�켣��ֻ�������һ������Ϊ�յ�
	 */

	@Override
	public void clear(Graphics g) {
		if (this.getP2()!= null) {
			g.setColor(Color.WHITE);
			g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
		}
	}
	

}
