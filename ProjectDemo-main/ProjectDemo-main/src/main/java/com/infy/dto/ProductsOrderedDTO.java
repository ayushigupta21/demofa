package com.infy.dto;

import com.infy.Entity.ProductsOrdered;

public class ProductsOrderedDTO {
	Integer orderId;
	Integer prodId;
	Integer sellerId;
	Integer quantity;
	String Status;
	double price;
	
	public ProductsOrderedDTO() {
		super();
	}
	
	public ProductsOrderedDTO(Integer orderId, Integer prodId, Integer sellerId, Integer quantity, String Status, double price) {
		super();
		this.orderId=orderId;
		this.prodId=prodId;
		this.sellerId=sellerId;
		this.quantity=quantity;
		this.Status=Status;
		this.price=price;
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

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
	
	public static ProductsOrderedDTO valueof(ProductsOrdered productsordered) {
		ProductsOrderedDTO productsOrderedDTO = new ProductsOrderedDTO();
		productsOrderedDTO.setOrderId(productsordered.getOrderId());
		productsOrderedDTO.setProdId(productsordered.getProdId());
		productsOrderedDTO.setSellerId(productsordered.getSellerId());
		productsOrderedDTO.setQuantity(productsordered.getQyantity());
		productsOrderedDTO.setPrice(productsordered.getPrice());
		productsOrderedDTO.setStatus(productsordered.getStatus());
		return productsOrderedDTO;
	}
	
	@Override
	public String toString() {
		return "ProductsOrderedDTO [orderid=" + orderId + ", prodid=" + prodId + ", sellerid=" + sellerId + ", quantity="
				+ quantity + ", Status=" + Status + ", price=" + price + "]";
	}
}
