package com.infy.Entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class Order {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderid")
	Integer orderId;
	@Column(name="buyerid" , nullable = false)
	Integer buyerId;
	@Column(nullable = false)
	double Amount;
	LocalDate Date;
	@Column(nullable = false)
	String Address;
	@Column(nullable = false)
	String Status;

	public Order() {
		super();
	}
	
	public Order(Integer orderId, Integer buyerId, double Amount, LocalDate Date, String Address, String Status) {
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

	public Double getAmount() {
		return Amount;
	}

	public void setAmount(Double amount) {
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
	
	
}
