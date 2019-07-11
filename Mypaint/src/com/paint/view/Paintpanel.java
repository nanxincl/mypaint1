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
		server.createShape();//绘制图形
		server.setP1(e.getPoint());
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		super.mouseDragged(e);
		server.clearCurrent(getGraphics());
		server.setP2(e.getPoint());
		server.drawCurrent(getGraphics());
		server.drawAll(getGraphics());//画出所有函数
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		super.mouseReleased(e);
		server.addShape();//添加图形
	}
}
	public Paintpanel() {
		server = new Server();
		this.setBackground(Color.white);
		//构建监听器
		MouseHandler mouseHandler = new MouseHandler();
		//注册监听器
		this.addMouseListener(mouseHandler);
		this.addMouseMotionListener(mouseHandler);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		server.drawAll(getGraphics());
	}
	/**
	 * 清理面板上的全部图形
	 */
	public void clear(){
		//清理server内部的图形链表
		server.clearAll();
		//重绘面板
		repaint();
	}
}





