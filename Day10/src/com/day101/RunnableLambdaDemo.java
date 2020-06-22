package com.day101;


public class RunnableLambdaDemo {
	public static void main(String[] args) {
			
	 	Runnable rObj = () -> {
	 		for(int i = 0; i<5; i++) {
	 			System.out.println( Thread.currentThread().getName()+" - " + i );
	 		}
	 		};
	 	
	 	new Thread(rObj).start();
	 	new Thread(rObj).start();

	 	Runnable rObj1 = () -> {
	 		for(int i = 0; i<5; i++) {
	 			System.out.println( Thread.currentThread().getName()+" - " + i );
	 			try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 		}
	 		};
	 		
	 		new Thread(rObj1).start();
	 		

	}

}
