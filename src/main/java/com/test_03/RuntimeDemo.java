package com.test_03;

import java.io.IOException;

/**
 * Runtime：单例模式（饿汉式）
 * 
 * 每个Java应用程序都有一个Runtime类实例，使应用程序能够与其运行的环境相连接
 * 
 */
public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		// r.exec("notepad"); //打开记事本
		r.exec("calc"); // 打开计算器
	}
}
