package com.day10;

import java.util.TreeSet;

public class Patient implements Comparable<Patient> {
	
	private  int patientId;
	private String name;
	private  int age;
	
	public Patient(int patientId, String name, int age) {
		
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	
	}

	public Patient() {
		
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Patient o) {
		
		return this.getName().compareTo(o.getName());
	}
	
public static int getPatientAge(String name1,TreeSet<Patient> t) 
{
	
	int age1=0;
	for(Patient pati:t) {
		boolean t1=pati.getName().equals(pati);
	if(t1==true) {
		
		age1=pati.age;		
	}
	
	
	}
	return age1;
}

}
