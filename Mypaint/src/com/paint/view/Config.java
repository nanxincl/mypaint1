package com.paint.view;
/**
 * ���ڱ����û��Ĳ˵�����
 * ��ǰҪ���Ƶ�ͼ������
 * ��Ҫʹ�õ���ɫ
 *
 */
public class Config {
	private static String type;//ͼ��
	private static String color;//��ɫ
	//���ʼֵ
	static{
		type = "Rectangle";
		color = "Black";
	}
	public static String getType() {
		return type;
	}
	public static void setType(String type) {
		Config.type = type;
	}
	public static String getColor() {
		return color;
	}
	public static void setColor(String color) {
		Config.color = color;
	}
	
	
}
