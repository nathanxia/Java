/*
 * 需求：创建一个卖票程序，多个窗口同时卖票。
 * 
 * 创建线程的第二种方式： Runnable
 * 1.定义实现 Runnable 接口。
 * 2.覆盖 Runnable 接口中 run 函数。
 * 		将线程要运行的的代码存放在 run 方法中。
 * 3.通过 Thread 类建立线程对象。
 * 4.将 Runnable 接口中d额子类对象作为实际参数传递给 Thread 类的构造函数。
 * 		为什么要将 Runnable 接口中的子类对象传递给 Thread 的构造函数：
 * 		答：自定义 run 方法所属的对象是 Runnable 接口的子类对象，所以要让线程去执行指定对象的 run 方法。
 * 			就必须明确该 run 方法的所属对象。
 * 5.调用 Thread 类中 start 函数开启线程并调用 Runnable 接口子类的 run 方法。
 * 
 * 实现方式和继承方式的区别：
 * 
 * 实现方式：
 * 1.避免了单继承的局限性
 * 2.定义线程时，建议使用现实方式。
 * 
 * 区别：
 * 继承 Thread：线程代码存放在 Thread 子类的 run 方法中。
 * 实现 Runnable：线程代码存放在 Runnable 接口的子类的 run 方法中。
 * 
 */

// 实现方式：
class Ticket implements Runnable { //extends Thread {
	
	private int tick = 100;
	public void run() {
		
		while (true) {
			if (tick == 0) break;
			System.out.println(Thread.currentThread().getName() + " sale: " + tick--);
		}
	}
}

public class L03_TicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ticket t = new Ticket();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		/*
		Ticket t1 = new Ticket();
		Ticket t2 = new Ticket();
		Ticket t3 = new Ticket();
		Ticket t4 = new Ticket();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		*/
		
	}

}
