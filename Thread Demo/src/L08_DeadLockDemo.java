/*
 * 死锁。
 * 同步中嵌套同步。
 * 
 */
class Ticket5 implements Runnable {
	
	private int tick = 1000;
	Object obj = new Object(); //上帝
	boolean flag = true;
	public void run() {
		if (flag) {
			while (true) {
				boolean check = show();
				if (check) break;
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
		synchronized(obj) {
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
}


public class L08_DeadLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ticket5 t = new Ticket5();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.flag = false;
		t2.start();
		
	}

}

