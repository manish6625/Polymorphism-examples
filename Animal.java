package com.codegnan.Inheritance;

class Animal {
	public int getLifespan() {
		return 0;
	}
}

class Elephant extends Animal {
	int years;
	public Elephant(int years) {
		super();
	   this.years=years;
	}
	public int getLifespan() {
		return years;
	}
}
