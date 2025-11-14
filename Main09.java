package com.codegnan.Inheritance;

import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int years=sc.nextInt();
		Animal e=new Elephant(years);
		System.out.println(e.getLifespan());
		sc.close();
	}

}
