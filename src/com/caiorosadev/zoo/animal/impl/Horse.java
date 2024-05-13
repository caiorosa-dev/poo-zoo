package com.caiorosadev.zoo.animal.impl;

import com.caiorosadev.zoo.animal.Animal;

public class Horse extends Animal {
	public Horse(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Hinnn");
	}
}
