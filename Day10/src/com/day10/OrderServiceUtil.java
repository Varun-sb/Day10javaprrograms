package com.day10;

import java.util.ArrayList;
import java.util.TreeSet;

public class OrderServiceUtil{
	
	
	ArrayList<Order> l =new ArrayList<Order>();
	Order	orderSearch=null;
	float total=0;
	public void addOrder(Order o1) {
		if(o1!=null) {
			l.add(o1);	
			
		}
	}
	
	public Order searchOrder(String orderId)  {
		for(Order i:l) {
			if(i.getOrderId().equals(orderId))
			{
				
		orderSearch=i;
		break;
			}	
	}
		return orderSearch;
	}
	
	public float findTotal() {
		for(Order t:l) {
			total=total+t.getOrderAmount();
		}
		return total;
	}
	
	
}
