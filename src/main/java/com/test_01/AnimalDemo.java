package com.test_01;

/**
 * 简单工厂模式    又叫静态工程方法模式，它定义一个具体的工厂类负责创建一些类的实例
 * 
 * 优点：客户端不需要在负责对象的创建，从而明确了各个类的职责
 * 
 * 缺点：静态工程类负责所有对象的创建，如果有新的对象增加，或者某些对象的创建方式不同， 就需要不断的修改工厂类，不利于后期维护
 * 
 */
public class AnimalDemo {

	public static void main(String[] args) {
		// 具体类调用
		Dog d = new Dog();
		d.eat();

		Cat c = new Cat();
		c.eat();

		// 通过工程创建
		Dog dd = AnimalFactory.createDog();
		dd.eat();

		Cat cd = AnimalFactory.createCat();
		cd.eat();

		Animal a = AnimalFactory.createAnimal("dog");
		a.eat();
	}

}
