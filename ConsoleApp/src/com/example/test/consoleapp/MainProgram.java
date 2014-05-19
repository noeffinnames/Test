package com.example.test.consoleapp;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		printWords();
		
		Triangle t = new Triangle();
		Square s = new Square();
		Circle c = new Circle();
		
		showShapeDetails(t);
		showShapeDetails(s);
		showShapeDetails(c);
				
	}
	
	private static void printWords() {
		// adding some further changes that will be committed.
		printString("snuh");
		printString("bah");
		printString("hee");
	}
	
	private static void printString(String word) {
		System.out.println(word);
	}
	
	private static void showShapeDetails(Shape shape) {
		printString("The name of the shape is:" + shape.getName());
		printString("this shape has " + shape.getNumberOfSides() + " sides");
		printString("It looks like this:");
		shape.drawShape();
	}

}
