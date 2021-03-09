package com.infy.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productsordered")
public class ProductsOrdered {
	@Id
	@Column(name="orderid")
	Integer orderId;
	@Column(name="prodid")
	Integer prodId;
	@Column(name="sellerid" , nullable = false)
	Integer sellerId;
	@Column(nullable = false)
	Integer quantity;
	@Column(nullable = false)
	String Status;
	double price;
	
	
	public ProductsOrdered() {
		super();
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	public Integer getSellerId() {
		return sellerId;
	}

	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}

	public Integer getQyantity() {
		return quantity;
	}

	public void setQyantity(Integer qyantity) {
		this.quantity = qyantity;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
