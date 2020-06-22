package com.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;



public class StoreEmployee  {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);	
	int id=0;String name=null;int no=0;
/*	for(int i=0;i<3;i++) {
		System.out.println("enter the empidd");
		int n=scan.nextInt();
		
		System.out.println("enter the name");
		String str=scan.next();
		
		System.out.println("enter the deptNo");
		int dno=scan.nextInt();
		
	}*/
	
	
	Employee e1=  new Employee();
	e1.setDeptNo(12);
	e1.setName("abc");
	e1.setEmpid(98);
			
	Employee e2= new Employee();
	e2.setDeptNo(13);
	e2.setName("bcd");
	e2.setEmpid(68);

		FileOutputStream fos = new FileOutputStream("C:\\Users\\vsb4\\eclipse-workspace\\Day10\\src\\com\\day10\\Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(e1);
	oos.writeObject(e2);
		fos.close();
		
		oos.close();
		
		System.out.println(" serialization successs");
	}

}
