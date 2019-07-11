package com.paint.view;

import javax.swing.JFrame;

public class PaintFrame extends JFrame {
	//1、构造方法
	public PaintFrame(){
		//2、设置标题为"简易绘图软件"
		this.setTitle("简易绘图软件");
		this.setSize(800, 600);
		this.setResizable(false);//设置窗口不可拖动
		this.setLocationRelativeTo(null);//设置在屏幕中央
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//关闭窗口时关闭程序
		//替换掉原有的面板
		Paintpanel paintPanel = new Paintpanel();
		this.add(paintPanel);
		//添加菜单栏
		this.setJMenuBar(new PaintMenu(paintPanel));
//		this.setVisible(true);
	}
}







