package com.example.test.consoleapp;

public class Triangle extends Shape {

	public Triangle() {
		setName("Triangle");
	}
	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		draw("");
		draw("  .");
		draw(" . .");
		draw(".....");
	}

}
