package com.day10;

public class Order {
	
	
	private String orderId;
	private String customerName;
	private float orderAmount;
	private String paymentOption;
	
	public Order(String orderId, String customerName, float orderAmount, String paymentOption) {
		
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.paymentOption = paymentOption;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", orderAmount=" + orderAmount
				+ ", paymentOption=" + paymentOption + "]";
	}
}
