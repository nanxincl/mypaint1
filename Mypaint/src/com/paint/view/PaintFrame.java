package com.paint.view;

import javax.swing.JFrame;

public class PaintFrame extends JFrame {
	//1�����췽��
	public PaintFrame(){
		//2�����ñ���Ϊ"���׻�ͼ���"
		this.setTitle("���׻�ͼ���");
		this.setSize(800, 600);
		this.setResizable(false);//���ô��ڲ����϶�
		this.setLocationRelativeTo(null);//��������Ļ����
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//�رմ���ʱ�رճ���
		//�滻��ԭ�е����
		Paintpanel paintPanel = new Paintpanel();
		this.add(paintPanel);
		//��Ӳ˵���
		this.setJMenuBar(new PaintMenu(paintPanel));
//		this.setVisible(true);
	}
}







