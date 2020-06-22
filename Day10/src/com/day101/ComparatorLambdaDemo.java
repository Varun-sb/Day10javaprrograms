package com.day101;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
class EmpIdComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getEmpId() - emp2.getEmpId();
	}
}
*/
public class ComparatorLambdaDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(10, "Ram", 12000.00);
		Employee emp2 = new Employee(30, "Amitabh", 92000.00);
		Employee emp3 = new Employee(50, "Prabhas", 42000.00);
		Employee emp4 = new Employee(20, "Aryabhat", 32000.00);
		
		List<Employee> empList = new LinkedList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
//		Collections.sort(empList, new EmpIdComparator());
		
		/*
		Comparator<Employee> cRef = (Employee e1, Employee e2)-> {
			return e1.getEmpId() - e2.getEmpId();
		};
		
		Collections.sort(empList,cRef);
		*/
		
		Collections.sort(empList, (e1, e2)-> {return e1.getEmpId() - e2.getEmpId();});
		
		
		System.out.println("-----------after sorting---------------");
		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
	}

}
