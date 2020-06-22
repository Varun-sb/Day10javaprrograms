package com.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class TestPAtientList {

	public static void main(String[] args) {
		
		List<Patient> l = new ArrayList<Patient>();
		
		l.add(new Patient(123,"sachin",2));
		l.add(new Patient(143,"cachin",5));
		l.add(new Patient(127,"bachin",9));
		l.add(new Patient(145,"vachin",3));
		
		for(Patient p:l)
		{
			System.out.println(p);
		}
		
		System.out.println("-----------------------------------------------------------");
		Collections.sort(l,new PatientAgeComparator());
		
		Iterator<Patient> p = l.listIterator();
		
		while(p.hasNext()) {
			
			System.out.println(p.next());
			
		}
		
		TreeSet<Patient> t = new TreeSet<Patient>();
		
		t.addAll(l);
		
		System.out.println("This is tree set"+t);
		
Scanner scan = new Scanner(System.in);

		System.out.println("enter the name");
		String name= scan.next(); 
		
		Patient p1 = new Patient();
		
	int age=Patient.getPatientAge(name, t);
	
		System.out.println(age);
		
		scan.close();

		
	}

}
