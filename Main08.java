package com.codegnan.Inheritance;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Shape s=new Shape();
		System.out.println("Side of the cube: ");
		double s=sc.nextDouble();
		Cube c=new Cube();
		System.out.println("Volume of the cube: "+c.calculateVolume(s));
		Cuboid cb=new Cuboid();
		System.out.println("Length of the cuboid: ");
		double l=sc.nextDouble();
		System.out.println("Width of the cuboid: ");
		double w=sc.nextDouble();
		System.out.println("height of the cuboid: ");
		double h=sc.nextDouble();
		System.out.println("Side of the cuboid: "+cb.calculateVolume(l,w,h));
		sc.close();
	}

}
