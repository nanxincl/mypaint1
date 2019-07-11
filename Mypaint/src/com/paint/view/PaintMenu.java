package com.paint.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

public class PaintMenu extends JMenuBar {
	private Paintpanel paintPanel;
	/**
	 * 监听图形菜单项
	 * @author Teacher
	 *
	 */
	private class ShapeHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem)e.getSource();
			Config.setType(item.getText());
			//测试
			System.out.println("Config.type = "+Config.getType());
		}
	}
	private class ColorHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem)e.getSource();
			Config.setColor(item.getText());
			//测试
			System.out.println("Config.color = "+Config.getColor());
		}
	}
	/**
	 * 创建菜单
	 */
	public PaintMenu(JPanel panel) {
		paintPanel = (Paintpanel) panel;
		//菜单1：图形
		JMenu myShape = new JMenu("Shape");
		//分组
		ButtonGroup typeGroup = new ButtonGroup();
		//创建监听器对象
		ShapeHandler shapeHandler = new ShapeHandler();
		//创建菜单项并添加监听器
		JRadioButtonMenuItem line_item = new JRadioButtonMenuItem("Line");
		line_item.setSelected(Config.getType().equals("Line"));
		line_item.addActionListener(shapeHandler);
		JRadioButtonMenuItem rec_item = new JRadioButtonMenuItem("Rectangle");
		rec_item.setSelected(Config.getType().equals("Rectangle"));
		rec_item.addActionListener(shapeHandler);
		JRadioButtonMenuItem tri_item = new JRadioButtonMenuItem("Triangle");
		tri_item.setSelected(Config.getType().equals("Triangle"));
		tri_item.addActionListener(shapeHandler);
		JRadioButtonMenuItem oval_item = new JRadioButtonMenuItem("Oval");
		oval_item.setSelected(Config.getType().equals("Oval"));
		oval_item.addActionListener(shapeHandler);
		
		//将菜单项加入类型组
		typeGroup.add(line_item);
		typeGroup.add(rec_item);
		typeGroup.add(tri_item);
		typeGroup.add(oval_item);
		
		//将菜单项加入菜单
		myShape.add(line_item);
		myShape.add(rec_item);
		myShape.add(tri_item);
		myShape.add(oval_item);
		
		//将菜单加入菜单栏
		this.add(myShape);
		
		//菜单2： 颜色
		JMenu color = new JMenu("Color");
		//分组
		ButtonGroup colorGroup = new ButtonGroup();
		//颜色监听器
		ColorHandler colorHandler = new ColorHandler();
		//菜单项
		JRadioButtonMenuItem red = new JRadioButtonMenuItem("Red");
		red.setSelected(Config.getColor().equals("Red"));
		red.addActionListener(colorHandler);
		JRadioButtonMenuItem black = new JRadioButtonMenuItem("Black");
		black.setSelected(Config.getColor().equals("Black"));
		black.addActionListener(colorHandler);
		
		//加入颜色组
		colorGroup.add(red);
		colorGroup.add(black);
		//添加进菜单
		color.add(red);
		color.add(black);
		//加入菜单栏
		this.add(color);
		
		//菜单3：清屏
		JMenu option = new JMenu("Option");
		JMenuItem clear = new JMenuItem("Clear");
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//清理整个面板
				paintPanel.clear();
			}
		});
		option.add(clear);
		this.add(option);
	}
}
