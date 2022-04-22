package com.javaex.ex02;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	
	//메소드 -gs
	
	public void setX(int xx) {
		 x = xx;
	}
	public void setY(int yy) {
		y = yy;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//메소드-일반
	public void draw() {
		System.out.println("점[x="+getX()+",  y="+getY()+"]을 그렸습니다.");
	}
}
