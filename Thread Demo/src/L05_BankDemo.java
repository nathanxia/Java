/*
 * 需求：
 * 1. 银行有一个金库。
 * 2. 有两个储户，分别存300元，每次存100，存3次。
 * 
 * 目的：该程序是否有安全隐患，如果有该如何解决？
 * 
 * 如何找到问题：
 * 1. 明确哪些代码是多线程运行代码。
 * 2. 明确哪些是共享数据。
 * 3. 明确多线程运行代码中哪些语句是操作共享数据的。
 * 
 * 同步有两种方式：
 * 1.同步代码块：
 * 		synchronized(ojb){
 * 		}
 * 
 * 2.同步函数：
 * 		public synchronized void add(int n) {
 * 		}
 * 
 */

class Bank {
	
	private int sum;
	//Object obj = new Object();
	public synchronized void add(int n) {
		//synchronized(obj) {
			sum += n;
			try {
				Thread.sleep(10);
			}
			catch(Exception e) {
			}
			System.out.println("Sum = " + sum);
		}
	//}
}

class Customer implements Runnable {
	
	private Bank b = new Bank();
	
	public void run() {
		
		for (int i = 0; i < 3; i++) {
			b.add(100);
		}
	}
	
}
public class L05_BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer c = new Customer();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
	}

}
