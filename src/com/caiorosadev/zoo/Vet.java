package com.caiorosadev.zoo;

import com.caiorosadev.zoo.animal.Animal;

public class Vet {
	private String name;

	public Vet(String name) {
		this.name = name;
	}

	public void checkAnimal(Animal animal) {
		System.out.println("Examinando animal...");

		System.out.println("Animal " + animal.getName() + " falou: ");
		animal.makeSound();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
