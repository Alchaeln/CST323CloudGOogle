package com.gcu.data.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import com.gcu.data.entity.OrderEntity;

public interface OrdersRepository extends CrudRepository<OrderEntity, Long> {

	@Override
	@Query(value = "SELECT * FROM ORDERS")
	public List<OrderEntity> findAll();
	
	/**
	 * 
	 * EXAMPLES OF CREATE AND UPDATE THAT DONT WOrK??
	OrderEntity entity = new OrderEntity(null, "000000011", "My Product", 1.00f, 1);
	service.create(entity);
	
	OrderEntity entity = new OrderEntity(null, "000001111", "My Product", 1.00f, 1);
	service.update(entity);
	**/
}
