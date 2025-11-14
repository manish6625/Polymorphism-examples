package com.codegnan.Inheritance;

class Shapecircle {
	public double getArea() {
		return 0.0;
	}
}
class Circle extends Shapecircle{
	double radius;
	public Circle(double radius) {
		super();
	this.radius=radius;
	}

	public double getArea() {
		return 3.1416*radius*radius;
	}
}