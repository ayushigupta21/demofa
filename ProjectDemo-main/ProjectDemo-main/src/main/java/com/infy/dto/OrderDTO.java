package com.infy.dto;

import java.time.LocalDate;

import com.infy.Entity.Order;


public class OrderDTO {
	Integer orderId;
	Integer buyerId;
	double Amount;
	LocalDate Date;
	String Address;
	String Status;
	
	public OrderDTO() {
		super();
	}
	public OrderDTO(Integer orderId, Integer buyerId, double Amount, LocalDate Date, String Address, String Status) {
		super();
		this.orderId=orderId;
		this.buyerId=buyerId;
		this.Amount=Amount;
		this.Date=Date;
		this.Address=Address;
		this.Status=Status;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	public static OrderDTO valueOf(Order order) {
		OrderDTO orderdto=new OrderDTO();
		orderdto.setOrderId(order.getOrderId());
		orderdto.setBuyerId(order.getBuyerId());
		orderdto.setAmount(order.getAmount());
		orderdto.setAddress(order.getAddress());
		orderdto.setDate(order.getDate());
		orderdto.setStatus(order.getStatus());
		return orderdto;
		
	}
	
	@Override
	public String toString() {
		return "OrderDTO [orderid=" + orderId + ", buyerid=" + buyerId + ", Amount=" + Amount + ", Date="
				+ Date + ", Address=" + Address + ", Status=" + Status + "]";
	}
	
	
}
