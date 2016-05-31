package com.test_02;

public class DogFactory implements Factory {

	public Animal createAnimal() {
		return new Dog();
	}

}
