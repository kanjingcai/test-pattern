package com.test_03;

/**
 * 单例模式：保证类在内存中只有一个对象
 * 
 * 饿汉模式：类一加载就创建对象 
 * 
 * A：把构造方法私有 B：在成员位置自己创建一个对象 C：通过一个公有的访问方式
 * 
 */
public class StudentDemo {

	public static void main(String[] args) {
		/*
		 * Student s1 = new Student(); Student s2 = new Student();
		 */
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();
		System.out.println(s1 == s2);
	}
}
