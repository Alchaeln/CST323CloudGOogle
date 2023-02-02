package com.gcu.business;

import java.util.List;

import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the AnotherOrdersBusinessService to the console");
	}

	@Override
	public List<OrderEntity> getOrders() {
		// TODO Auto-generated method stub
		return null;
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
