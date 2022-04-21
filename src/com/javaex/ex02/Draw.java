package com.javaex.ex02;

public class Draw {

	public static void main(String[] args) {
		
		Point graph1 = new Point();
		
		graph1.setX(5);
		graph1.setY(5);
		
		Point graph2 = new Point();
		
		graph2.setX(10);
		graph2.setY(23);
		
		
		System.out.println("점[x="+graph1.getX()+",  y="+graph1.getY()+"]을 그렸습니다.");
		System.out.println("점[x="+graph2.getX()+",  y="+graph2.getY()+"]을 그렸습니다.");
	}

}
