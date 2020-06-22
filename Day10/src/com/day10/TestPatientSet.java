package com.day10;

import java.util.LinkedHashSet;

public class TestPatientSet {

	public static void main(String[] args) {
	
		LinkedHashSet<Patient> lh = new LinkedHashSet<Patient>();
		
		lh.add(new Patient(123,"anil",23));
		lh.add(new Patient(123,"anil",23));
		lh.add(new Patient(1,"sunil",27));
		
		System.out.println(lh.size());
		
		System.out.println(lh);
		

	}

}
