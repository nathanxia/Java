/*
 * 进程（Process）：是每一个正在进行中的程序。
 * 				每一个执行程序都有一个执行顺序，该顺序是一个执行路径，或者叫一个控制单元。
 * 
 * 线程（Thread）：就是进程中一个独立的单元。线程在控制进程的执行。
 * 
 * 一个进程中至少有一个线程。
 * 
 * 如何在自定义代码中，自定义一个线程：
 * 
 *  第一种方法，继承Thread类：
 *  1. 自定义类继承Thread。
 *  2. 复写Thread中run方法。
 *  3. 调用线程的start方法：该方法有两个作用：启动线程，调用run方法。
 *
 */

// 第一种定义线程。
class Demo extends Thread {
	
	// 线程存储代码的地方。所以要用继承并且复写fun函数。
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Demo run -> " + i);
		}
	}
}


public class L01_ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d = new Demo(); // 创建好一个线程；
		d.start(); // 开启线程，并且执行该线程的run方法。
		//d.run(); // 仅仅是对象调用方法，依然使用主线程资源。
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Hello world ->" + i);
		}
	}

}
