package com.test_03;

public class Student {

	private Student() {
	}

	// 饿汉模式
	private static Student s = new Student();

	public static Student getStudent() {
		return s;
	}

}
