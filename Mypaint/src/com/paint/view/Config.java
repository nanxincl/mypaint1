package com.paint.view;
/**
 * 用于保存用户的菜单设置
 * 当前要绘制的图形种类
 * 和要使用的颜色
 *
 */
public class Config {
	private static String type;//图形
	private static String color;//颜色
	//设初始值
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
