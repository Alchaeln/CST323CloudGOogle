package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

public interface OrdersBusinessServiceInterface {
	public void test();
	
	public List<OrderEntity> getOrders();
	
	public void init();
	
	public void destroy();
}
