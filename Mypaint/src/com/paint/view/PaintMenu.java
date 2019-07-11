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
	 * ����ͼ�β˵���
	 * @author Teacher
	 *
	 */
	private class ShapeHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem)e.getSource();
			Config.setType(item.getText());
			//����
			System.out.println("Config.type = "+Config.getType());
		}
	}
	private class ColorHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem)e.getSource();
			Config.setColor(item.getText());
			//����
			System.out.println("Config.color = "+Config.getColor());
		}
	}
	/**
	 * �����˵�
	 */
	public PaintMenu(JPanel panel) {
		paintPanel = (Paintpanel) panel;
		//�˵�1��ͼ��
		JMenu myShape = new JMenu("Shape");
		//����
		ButtonGroup typeGroup = new ButtonGroup();
		//��������������
		ShapeHandler shapeHandler = new ShapeHandler();
		//�����˵����Ӽ�����
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
		
		//���˵������������
		typeGroup.add(line_item);
		typeGroup.add(rec_item);
		typeGroup.add(tri_item);
		typeGroup.add(oval_item);
		
		//���˵������˵�
		myShape.add(line_item);
		myShape.add(rec_item);
		myShape.add(tri_item);
		myShape.add(oval_item);
		
		//���˵�����˵���
		this.add(myShape);
		
		//�˵�2�� ��ɫ
		JMenu color = new JMenu("Color");
		//����
		ButtonGroup colorGroup = new ButtonGroup();
		//��ɫ������
		ColorHandler colorHandler = new ColorHandler();
		//�˵���
		JRadioButtonMenuItem red = new JRadioButtonMenuItem("Red");
		red.setSelected(Config.getColor().equals("Red"));
		red.addActionListener(colorHandler);
		JRadioButtonMenuItem black = new JRadioButtonMenuItem("Black");
		black.setSelected(Config.getColor().equals("Black"));
		black.addActionListener(colorHandler);
		
		//������ɫ��
		colorGroup.add(red);
		colorGroup.add(black);
		//��ӽ��˵�
		color.add(red);
		color.add(black);
		//����˵���
		this.add(color);
		
		//�˵�3������
		JMenu option = new JMenu("Option");
		JMenuItem clear = new JMenuItem("Clear");
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//�����������
				paintPanel.clear();
			}
		});
		option.add(clear);
		this.add(option);
	}
}
