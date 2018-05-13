


class Test2 implements Runnable {
	
	private boolean flag;
	
	public Test2(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		if (flag) {
			synchronized(MyLock.lockA) {
				System.out.println(Thread.currentThread().getName() + " if lock A");
				synchronized(MyLock.lockB) {
					System.out.println(Thread.currentThread().getName() + " if lock B");
				}
				
			}
		}
		else {
			synchronized(MyLock.lockB) {
				System.out.println(Thread.currentThread().getName() + " else lock B");
				synchronized(MyLock.lockA) {
					System.out.println(Thread.currentThread().getName() + " else lock A");
					
				}
				
			}
		}
	}
}

class MyLock {
	static Object lockA = new Object();
	static Object lockB = new Object();
	
}

public class L09_DeadLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new Test2(true));
		Thread t2 = new Thread(new Test2(false));
		
		t1.start();
		t2.start();

	}

}
