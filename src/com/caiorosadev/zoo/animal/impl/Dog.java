package com.caiorosadev.zoo.animal.impl;

import com.caiorosadev.zoo.animal.Animal;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Au Au");
	}
}
