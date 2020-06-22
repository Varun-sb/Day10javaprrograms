package com.store.test;

import java.util.Scanner;
import java.util.TreeSet;

import com.day10.InvalidOrderException;
import com.day10.Order;
import com.day10.OrderServiceUtil;

public class TestClient {

	public static void main(String[] args) throws InvalidOrderException {
		Scanner scan= new Scanner(System.in);

		OrderServiceUtil osu = new OrderServiceUtil();

		Order o1 = new Order("abc", "Varu", 20, "cod");
		Order o2= new Order("def","veg1",39,"gift");

		osu.addOrder(o1);
		osu.addOrder(o2);

		System.out.println("enter the searchid");
		String searchId=scan.next();

		System.out.println(osu.searchOrder(searchId));
		
		System.out.println("total amount is"+osu.findTotal());
		scan.close();
	}

}

