package com.test_02;

public class CatFactory implements Factory {

	public Animal createAnimal() {
		return new Cat();
	}

}
