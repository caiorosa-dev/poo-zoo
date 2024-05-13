package com.caiorosadev.zoo.animal.impl;

import com.caiorosadev.zoo.animal.Animal;

public class Sloth extends Animal {
	public Sloth(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeSound() {
		System.out.println("Nhããã");
	}
}
