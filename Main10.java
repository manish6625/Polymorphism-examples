package com.codegnan.Inheritance;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		Circle c=new Circle(d);
		System.out.printf("%.2f",c.getArea());
		sc.close();
	}

}
