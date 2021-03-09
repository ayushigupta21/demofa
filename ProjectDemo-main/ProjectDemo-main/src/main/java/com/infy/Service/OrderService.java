package com.infy.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.Entity.Order;
import com.infy.Entity.ProductsOrdered;
import com.infy.dto.OrderDTO;
import com.infy.dto.ProductsOrderedDTO;
import com.infy.repository.OrderRepo;
import com.infy.repository.ProductsOrderedRepo;

@Service
public class OrderService {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	OrderRepo orderRepo;
	@Autowired
	ProductsOrderedRepo productsOrderedRepo;
	
	// Fetches all order details
		public List<OrderDTO> getAllOrders() {

			List<Order> orders = orderRepo.findAll();
			List<OrderDTO> orderDTOs = new ArrayList<>();

			for (Order order : orders) {
				OrderDTO orderDTO = OrderDTO.valueOf(order);
				orderDTOs.add(orderDTO);
			}

			logger.info("Order details : {}", orderDTOs);
			return orderDTOs;
		}
		
	// Fetch specific order details
		public OrderDTO getSpecificOrder(Integer orderId) {
			logger.info("Order details : {}", orderId);
			OrderDTO orderDTO = null;
			Optional<Order> optOrder = orderRepo.findById(orderId);
			if (optOrder.isPresent()) {
				Order order = optOrder.get();
				orderDTO = OrderDTO.valueOf(order);
			}

			return orderDTO;

		}
		
	// Create/Add order
		public void addOrderDetails (Order order) {
			orderRepo.save(order);
		}
		
	// Fetches all order details
		public List<ProductsOrderedDTO> getAllProductsOrdered() {

			List<ProductsOrdered> productsOrdereds = productsOrderedRepo.findAll();
			List<ProductsOrderedDTO> productsOrderedDTOs = new ArrayList<>();

			for (ProductsOrdered productsOrdered : productsOrdereds) {
				ProductsOrderedDTO productsOrderedDTO = ProductsOrderedDTO.valueof(productsOrdered);
				productsOrderedDTOs.add(productsOrderedDTO);
			}

		logger.info("Order details : {}", productsOrderedDTOs);
			return productsOrderedDTOs;
		}
		
	// Fetch specific product details
		public ProductsOrderedDTO getSpecificProduct(Integer orderId) {
		 logger.info("Product details : {}", orderId);
		 ProductsOrderedDTO productsOrderedDTO = null;
			Optional<ProductsOrdered> optProductsOrdered = productsOrderedRepo.findById(orderId);
			if (optProductsOrdered.isPresent()) {
				ProductsOrdered productsOrdered = optProductsOrdered.get();
				productsOrderedDTO = ProductsOrderedDTO.valueof(productsOrdered);
			}

			return productsOrderedDTO;

		}
		
	//Delete product
		public void deleteSpecificProduct(Integer orderId) {
			productsOrderedRepo.deleteById(orderId);
		}
}
