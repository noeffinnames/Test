package com.example.test.consoleapp;

public class Circle extends Shape {

	public Circle() {
		setName("Circle");
	}
	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		draw("    *  *");
		draw(" *        *");
		draw("*          *");
		draw("*          *");
		draw(" *        *");
		draw("    *  *");
		
	}

}
