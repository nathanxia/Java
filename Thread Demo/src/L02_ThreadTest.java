/*
 * 练习：
 * 创建两个线程，和主线程交替运行。
 * 
 * 原来的线程都有自己的名称。
 * Thread-编号，编号从 0 开始。
 * 
 * static Thread currentThread（）：获取当前线程对象。
 * getName（）： 获取线程名称。
 * 
 * 设置线程名称：setName（）或者构造函数（super（name））。
 * 
 */

class Test extends Thread {
	
	//private String name;
	public Test() {
		
	}
	public Test(String name) {
		// this.name = name;
		super(name);
	}
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + " -> " + i);
			//System.out.println(this.getName() + " ->" + i);
		}
	}
}

public class L02_ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test("One");
		Test t2 = new Test();
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 50; i++) {
			System.out.println("Main -> " + i);
		}
	}

}
