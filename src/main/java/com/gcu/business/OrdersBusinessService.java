package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.OrdersDataService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface {
	
	@Autowired
	OrdersDataService service;
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the OrdersBusinessService to the console");
	}

	@Override
	public List<OrderEntity> getOrders() {
		// TODO Auto-generated method stub
		
		List<OrderEntity> orders =  service.findAll();
		
		return orders;
		
		/**
		List<OrderEntity> ordersEntity = service.findAll();
		
		List<OrderModel> ordersDomain = new ArrayList<OrderModel>();
		for(OrderEntity entity : ordersEntity)
		{
			ordersDomain.add(new OrderModel(entity.getId(), 
											entity.getOrderNo(),
											entity.getProductName(),
							+				entity.getPrice(),
											entity.getQuantity()));
			
		}
		return ordersDomain;
		**/
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("INIT");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("DESTROY");
	}

}
