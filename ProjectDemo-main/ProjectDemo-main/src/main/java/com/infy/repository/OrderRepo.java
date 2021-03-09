package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.infy.Entity.Order;

public interface OrderRepo extends JpaRepository<Order, Integer>{

}
