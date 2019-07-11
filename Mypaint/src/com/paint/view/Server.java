package com.paint.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import com.paint.model.Lin;
import com.paint.model.Myshape;
import com.paint.model.Rectangle;

/**
 * ���ƻ�ͼ��ȫ��ҵ���߼�
 * ��������ȡ�����ļ�������ͼ��
 * ����ͼ��
 * ����ͼ��
 *
 */
public class Server {
	//�Ѿ�������ɵ�ͼ�μ���
	ArrayList<Myshape> finishedShapes;
	//��ǰ���ڻ��Ƶ�ͼ��
	private Myshape currentShape;
	public Server() {
		finishedShapes = new ArrayList<Myshape>();
	}
	public void createShape(){
		//��ȡConfig�ļ����ͼ����𣬴���ͼ��
		switch (Config.getType()) {
		case "Line":
			currentShape = new Lin();//����
			break;
		case "Rectangle":
			currentShape = new Rectangle();//����
			break;
		default:
			break;
		}
		//��ȡConfig�ļ������ɫ������ͼ����ɫ
		switch (Config.getColor()) {
		case "Red":
			currentShape.setColor(Color.RED);//��ɫ
			break;
		case "Black":
			currentShape.setColor(Color.BLACK);//��ɫ
			break;
		default:
			break;
		}
	}
	/**
	 * ����currentShape��P1��
	 * @param point
	 */
	public void setP1(Point point){
		currentShape.setP1(point);
	}
	/**
	 * ����currentShape��P2��
	 * @param point
	 */
	public void setP2(Point point){
		currentShape.setP2(point);
	}
	/**
	 * ����currentShape��ͼ�ι켣
	 * @param g
	 */
	public void clearCurrent(Graphics g){
		currentShape.clear(g);
	}
	/**
	 * ����currentShape
	 * @param g
	 */
	public void drawCurrent(Graphics g) {
		currentShape.draw(g);
	}
	/**
	 * ��������ɵ�ͼ�μ�������
	 */
	public void addShape(){
		finishedShapes.add(currentShape);
	}
	/**
	 * �������е�ͼ��
	 * @param g
	 */
	public void drawAll(Graphics g){
		for (Myshape myShape : finishedShapes) {
			myShape.draw(g);
		}
	}
	/**
	 * ������е�ͼ�ζ���
	 */
	public void clearAll(){
		finishedShapes.clear();
	}
}
