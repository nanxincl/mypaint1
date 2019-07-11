package com.paint.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import com.paint.model.Lin;
import com.paint.model.Myshape;
import com.paint.model.Rectangle;

/**
 * 控制绘图的全部业务逻辑
 * 包括：读取配置文件，创建图形
 * 绘制图形
 * 清理图形
 *
 */
public class Server {
	//已经绘制完成的图形集合
	ArrayList<Myshape> finishedShapes;
	//当前正在绘制的图形
	private Myshape currentShape;
	public Server() {
		finishedShapes = new ArrayList<Myshape>();
	}
	public void createShape(){
		//读取Config文件里的图形类别，创建图形
		switch (Config.getType()) {
		case "Line":
			currentShape = new Lin();//画线
			break;
		case "Rectangle":
			currentShape = new Rectangle();//矩形
			break;
		default:
			break;
		}
		//读取Config文件里的颜色，设置图形颜色
		switch (Config.getColor()) {
		case "Red":
			currentShape.setColor(Color.RED);//红色
			break;
		case "Black":
			currentShape.setColor(Color.BLACK);//黑色
			break;
		default:
			break;
		}
	}
	/**
	 * 设置currentShape的P1点
	 * @param point
	 */
	public void setP1(Point point){
		currentShape.setP1(point);
	}
	/**
	 * 设置currentShape的P2点
	 * @param point
	 */
	public void setP2(Point point){
		currentShape.setP2(point);
	}
	/**
	 * 清理currentShape的图形轨迹
	 * @param g
	 */
	public void clearCurrent(Graphics g){
		currentShape.clear(g);
	}
	/**
	 * 绘制currentShape
	 * @param g
	 */
	public void drawCurrent(Graphics g) {
		currentShape.draw(g);
	}
	/**
	 * 将绘制完成的图形加入链表
	 */
	public void addShape(){
		finishedShapes.add(currentShape);
	}
	/**
	 * 绘制所有的图形
	 * @param g
	 */
	public void drawAll(Graphics g){
		for (Myshape myShape : finishedShapes) {
			myShape.draw(g);
		}
	}
	/**
	 * 清空所有的图形对象
	 */
	public void clearAll(){
		finishedShapes.clear();
	}
}
