/*
 * 同步函数用的哪一个锁？
 * 函数需要被对象调用。那么函数都有一个所属对象引用，就是 this。
 * 所以同步函数所用的锁是 this。
 * 
 * 通过改程序进行验证。
 * 1.使用两个线程进行卖票。
 * 2.一个线程在代码块中。
 * 3.一个线程在同步函数中。
 * 4.都在执行卖票动作。
 * 
 */
class Ticket3 implements Runnable {
	
	private int tick = 100;
	Object obj = new Object(); //上帝
	boolean flag = true;
	public void run() {
		if (flag) {
			while (true) {
				synchronized(this) {
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
	
	public synchronized boolean show() {
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


public class L06_ThisLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket3 t = new Ticket3();
		
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
