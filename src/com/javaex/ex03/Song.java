package com.javaex.ex03;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	
	//생성자
	
	
	//메소드 - gs
	public void setTitle (String t) {
		title = t;
	}
	public void setArtist (String a) {
		artist = a;
	}
	public void setAlbum (String al) {
		album = al;
	}
	public void setComposer (String c) {
		composer = c;
	}
	public void setYear (int y) {
		year = y;
	}
	public void setTrack (String tr) {
		track = tr;
	}
	
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public String getTrack() {
		return track;
	}
	
	
	//메소드 -일반
	
	public void showInfo() {
		System.out.println(artist+","+ title +" ( "+album+","+year+","+track+","+composer+" ) ");
	}
	
}
