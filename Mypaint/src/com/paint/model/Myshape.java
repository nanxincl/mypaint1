package com.paint.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * 图形父类
 * P1 起点 
 * P2 终点
 * Color 颜色
 * draw 绘制方法
 * 
 *
 */
public abstract class Myshape {
	private Point p1;//起点
	private Point p2;//终点
	private Color color;//颜色
	/**
	 * 抽象的绘制方法
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
	 * 取两点X坐标的最小值为起点的x
	 * @return
	 */
	public int  getStartX(){
		int x1 = getP1().x;
		int x2 = getP2().x;
		return x1 < x2 ? x1:x2;
	}
	/**
	 * 取两点y坐标的最小值为起点y
	 * @return
	 */
	public int getStartY(){
		int y1 = getP1().y;
		int y2 = getP2().y;
		return y1 < y2 ? y1:y2;
	}
	/**
	 * 取两点y坐标差值的绝对值为高度
	 * @return
	 */
	public int getHeight(){
		return Math.abs(getP1().y-getP2().y);
	}
	/**
	 * 取两点x坐标差值的绝对值为宽度
	 * @return
	 */
	public int getWidth(){
		return Math.abs(getP1().x-getP2().x);
	}
	
}
