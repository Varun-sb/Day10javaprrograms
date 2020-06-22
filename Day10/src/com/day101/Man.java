package com.day101;

interface A{
	void name();
	
}


interface Sqr{
	int sqre(int n);
	
}


interface Rev{
	void rev();
	
}

public class Man {

	public static void main(String[] args) {
		
		
		A a = ()->{System.out.println("FIRST INTERFACE");};
		a.name();

		Sqr s  = num->{
			
			int square=num*num;
			
			return square;
		};
		
		System.out.println(s.sqre(2));
		
		
		
		Rev rev1 = ()->{StringBuilder sb = new StringBuilder("HELLO");
		
		System.out.println(sb.reverse()); };
		
		rev1.rev();
	}

}
