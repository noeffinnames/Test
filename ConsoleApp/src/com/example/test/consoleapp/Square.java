package com.example.test.consoleapp;

public class Square extends Shape {

	public Square() {
		setName("Square");
	}
	
	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		draw("....");
		draw(".  .");
		draw("....");
	}

}
