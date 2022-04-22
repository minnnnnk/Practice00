package com.javaex.ex05;

public class Point {
	//필드
	private int x;
	private int y;
	//생성자
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//메소드 -gs
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	//메소드 -일반
	
	public void draw() {
		System.out.println("점[x="+x+",  y="+y+"]을 그렸습니다.");
	}
}
