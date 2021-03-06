/*
 * 如果同步函数被静态函数修饰，使用的锁是什么呢？
 * 通过验证，发现不是 this。因为静态方法中也不可以定义 this。
 * 
 * 静态进内存时，内存中没有本类对象，但是一定有该类型对应的字解码文件对象。
 * 类名.class。该对象的类型是 class。
 * 
 * 静态的同步方法使用的锁是该方法所在类的字解码文件对象， 类名.class。
 * 
 */
class Ticket4 implements Runnable {
	
	private static int tick = 100;
	//Object obj = new Object(); //上帝
	boolean flag = true;
	public void run() {
		if (flag) {
			while (true) {
				// Ticket.class 用于静态函数定义对象
				synchronized(Ticket4.class) {
					if (tick <= 0) break;
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + 
							" sell ticket, remianing: " + tick--);
				}
			}
		}
		else {
			while (true) {
				boolean check = show();
				if (check) break;
			}
		}
	}
	
	public static synchronized boolean show() {
		if (tick <= 0) return true;
		// 强制sleep，线程就会产生错误票数。
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + 
				" show ticket, remianing: " + tick--);
		return false;
	}
}


public class L07_StaticMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket4 t = new Ticket4();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		//Thread t3 = new Thread(t);
		//Thread t4 = new Thread(t);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();
		//t3.start();
		//t4.start();
		
		
		
	}

}
