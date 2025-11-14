package com.codegnan.Inheritance;

class Shape {
	public void calculateVolume() {
		System.out.println("calculating volume of shape");
	}
}
class Cube extends Shape{
	public double calculateVolume(double side) {
		return side*side*side;
	}
}
class Cuboid extends Shape{
	public double calculateVolume(double length,double width,double height) {
		return length*width*height;
	}
}
