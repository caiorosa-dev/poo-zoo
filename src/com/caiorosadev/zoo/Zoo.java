package com.caiorosadev.zoo;

import com.caiorosadev.zoo.animal.Animal;
import com.caiorosadev.zoo.animal.impl.Dog;
import com.caiorosadev.zoo.animal.impl.Horse;
import com.caiorosadev.zoo.animal.impl.Sloth;
import com.caiorosadev.zoo.animal.types.Runner;

public class Zoo {
	private final Animal[] cages = new Animal[10];

	public void fillCages() {
		cages[0] = new Dog("Fofucho", 5);
		cages[1] = new Horse("Marcelo", 10);
		cages[2] = new Sloth("Soninho", 3);
		cages[3] = new Dog("Rex", 7);
		cages[4] = new Horse("Pé de Pano", 12);
		cages[5] = new Sloth("Zzzzzz", 5);
		cages[6] = new Dog("Tobias", 3);
		cages[7] = new Horse("Pé de Vento", 8);
		cages[8] = new Sloth("Dorminhoco", 4);
		cages[9] = new Dog("Lulu", 2);
	}

	public void run() {
		Vet vet = new Vet("John");
		fillCages();

		for (Animal animal : cages) {
			if (animal != null) {
				vet.checkAnimal(animal);
			}
		}

		for (Animal animal : cages) {
			if (animal != null) {
				animal.makeSound();
				if (animal instanceof Runner) {
					Runner parsedAnimal = (Runner) animal;

					parsedAnimal.run();
				}
			}
		}
	}
}
