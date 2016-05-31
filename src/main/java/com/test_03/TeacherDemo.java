package com.test_03;

/**
 * 懒汉模式：用的时候，采取创建对象
 * 
 * 单利模式的思想是什么？ 保证类在内存中只有一个对象
 *   开发：饿汉式（是不会出现问题的单例模式）
 *   面试：懒汉式（可能会出现单例模式）
 *      A：懒加载（延迟加载）
 *      B：线程安全问题
 *         a:是否有多线程环境
 *         b:是否有共享数据
 *         c:是否有多条语句操作共享数据
 */
public class TeacherDemo {

	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();

		Teacher t2 = Teacher.getTeacher();

		System.out.println(t1 == t2);
	}
}
