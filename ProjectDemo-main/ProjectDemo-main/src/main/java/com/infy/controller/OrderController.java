package com.infy.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Entity.Order;
import com.infy.Service.OrderService;
import com.infy.dto.OrderDTO;
import com.infy.dto.ProductsOrderedDTO;

@RestController
@CrossOrigin
@RequestMapping(value="/api")
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderService orderService;
	
	// Fetches all order details
		@GetMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<OrderDTO> getAllOrders() {
			logger.info("Fetching all orders");
			return orderService.getAllOrders();
		}
		
	// Fetch plan details of a specific plan
		@GetMapping(value = "/orders/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
		public OrderDTO getSpecificOrders(@PathVariable Integer orderId) {
			logger.info("Fetching details of Order {}", orderId);
			return orderService.getSpecificOrder(orderId);
		}
		
	// Create a new order
		@PostMapping(value = "/orders/placeOrder", produces = MediaType.APPLICATION_JSON_VALUE)
		public  List<OrderDTO> addOrderDetails(@RequestBody Order order) {
			logger.info("Adding orderDetails");
			orderService.addOrderDetails(order);
			return orderService.getAllOrders();
		}
		
	// Fetches all productOrdered details
		@GetMapping(value = "/prodorders", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<ProductsOrderedDTO> getAllProductsOrdered() {
			logger.info("Fetching all ProductsOrdered");
					
			return orderService.getAllProductsOrdered();
		}
		
	// Deleting product
		@DeleteMapping(value = "/prodorders/{orderId}", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<ProductsOrderedDTO> deleteSpecificProduct(@PathVariable Integer orderId) {
			logger.info("Deleting details of product {}", orderId);
			orderService.deleteSpecificProduct(orderId);
			return orderService.getAllProductsOrdered();
	}

}
