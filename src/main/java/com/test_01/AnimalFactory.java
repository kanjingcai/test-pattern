package com.test_01;

public class AnimalFactory {

	private AnimalFactory() {
	}

	public static Dog createDog() {
		return new Dog();
	}

	public static Cat createCat() {
		return new Cat();
	}

	public static Animal createAnimal(String type) {
		if ("dog".equals(type)) {
			return new Dog();
		}
		if ("cat".equals(type)) {
			return new Cat();
		}
		return null;
	}

}
