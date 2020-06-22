package com.day101;
// can have only one abstract method
@FunctionalInterface
interface I{
	void method();
}

interface I1 {
	void method1(String message);
}

interface I2{
	int increment(int i);
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		
		I iObj = () -> System.out.println("Welcome to Lambda");
		iObj.method();
		
		I1 iObj1 = (String message) -> System.out.println(message);
		iObj1.method1("Lambda Expression is interesting");

		I1 iObj2 = (String message) -> {
			int length = message.length();
			System.out.println("Length of " + message + " is " + length );
			};
		
		iObj2.method1("Lambda Expression");

		I2 iObj3 = (int i) -> {
				i = i + 1;
				return i;
		};
		
		int value = iObj3.increment(10);
		System.out.println("incremented value is " + value);
		
		
	}

}
