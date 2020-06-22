package com.day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Empdes  {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fi = new FileInputStream("C:\\Users\\vsb4\\eclipse-workspace\\Day10\\Employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		
		Employee e=(Employee) ois.readObject();
		
		System.out.println(e);
		   
		
		
	}
}
