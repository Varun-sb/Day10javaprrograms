package com.day101;
// can have only one abstract method
interface I5{
	void method(int num1, String num2);
}

interface I6{
	void method(int num1);
}


public class LambdaDemo2 {
	public static void main(String[] args) {
		
		I5 iObj = (int num1, String num2) -> System.out.println("Values are " + num1 +"\t" + num2);
		iObj.method(100, "OK");
		
		
		I6 iObj2 = num1 -> {System.out.println(num1);};
		
		
	}

}
