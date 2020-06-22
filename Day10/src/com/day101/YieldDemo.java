package com.day101;

class MyThread implements Runnable{
	
	
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			if(i==2)
				Thread.yield(); // pause current thread and give chance to other threads
		}
		
		System.out.println(Thread.currentThread().getName() + " : done " );
	}
	
	
}


public class YieldDemo {
	public static void main(String[] args) {
		new Thread(new MyThread(), "ThreadOne").start();;
		new Thread(new MyThread(), "ThreadTwo").start();;
		new Thread(new MyThread(), "ThreadThree").start();;
	}

}
