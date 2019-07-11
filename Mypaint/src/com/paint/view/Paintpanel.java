package com.paint.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import com.paint.model.Lin;

public class Paintpanel extends JPanel {
private Server server;
private class MouseHandler extends MouseAdapter{
	@Override
	public void mousePressed(MouseEvent e) {
		super.mousePressed(e);
		server.createShape();//����ͼ��
		server.setP1(e.getPoint());
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		super.mouseDragged(e);
		server.clearCurrent(getGraphics());
		server.setP2(e.getPoint());
		server.drawCurrent(getGraphics());
		server.drawAll(getGraphics());//�������к���
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		server.addShape();//���ͼ��
	}
}
	public Paintpanel() {
		server = new Server();
		this.setBackground(Color.white);
		//����������
		MouseHandler mouseHandler = new MouseHandler();
		//ע�������
		this.addMouseListener(mouseHandler);
		this.addMouseMotionListener(mouseHandler);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		server.drawAll(getGraphics());
	}
	/**
	 * ��������ϵ�ȫ��ͼ��
	 */
	public void clear(){
		//����server�ڲ���ͼ������
		server.clearAll();
		//�ػ����
		repaint();
	}
}





