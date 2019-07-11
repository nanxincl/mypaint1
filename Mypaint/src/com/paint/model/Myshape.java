package com.paint.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * ͼ�θ���
 * P1 ��� 
 * P2 �յ�
 * Color ��ɫ
 * draw ���Ʒ���
 * 
 *
 */
public abstract class Myshape {
	private Point p1;//���
	private Point p2;//�յ�
	private Color color;//��ɫ
	/**
	 * ����Ļ��Ʒ���
	 */
	public abstract void draw(Graphics g);
	public abstract void clear(Graphics g);
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	/**
	 * ȡ����X�������СֵΪ����x
	 * @return
	 */
	public int  getStartX(){
		int x1 = getP1().x;
		int x2 = getP2().x;
		return x1 < x2 ? x1:x2;
	}
	/**
	 * ȡ����y�������СֵΪ���y
	 * @return
	 */
	public int getStartY(){
		int y1 = getP1().y;
		int y2 = getP2().y;
		return y1 < y2 ? y1:y2;
	}
	/**
	 * ȡ����y�����ֵ�ľ���ֵΪ�߶�
	 * @return
	 */
	public int getHeight(){
		return Math.abs(getP1().y-getP2().y);
	}
	/**
	 * ȡ����x�����ֵ�ľ���ֵΪ���
	 * @return
	 */
	public int getWidth(){
		return Math.abs(getP1().x-getP2().x);
	}
	
}
