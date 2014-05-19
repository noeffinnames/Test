package com.example.test.consoleapp;

public abstract class Shape {
	private String _name;
	
	
	public String getName() {
		return _name;
	}
	
	public void setName(String name) {
		_name = name;
	}
	
	public abstract int getNumberOfSides();
	
	public abstract void drawShape();
	
	protected void draw(String character) {
		System.out.println(character);
	}
}
