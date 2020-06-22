package com.day101;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FruitsFileDemo {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("src\\fruitbasket.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		Set<String> fruitSet = new LinkedHashSet<>();
		
		String fruitName = null;				
				
		while( (fruitName = reader.readLine()) !=null) {
			fruitSet.add(fruitName);			
		}
		
		System.out.println(fruitSet);
		
		
		

	}

}
