package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.LoginModel;
import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.business.SecurityBusinessService;
import com.gcu.data.entity.OrderEntity;
import com.gcu.model.OrderModel;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private OrdersBusinessServiceInterface service;
	
	@Autowired
	private SecurityBusinessService security;
	
	@GetMapping("/test1")
	public String display(Model model) 
	{
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
	@PostMapping("/doLogin")
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) 
	{
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		List<OrderEntity> orders = service.getOrders(); 
		
		model.addAttribute("orders", orders);

		service.destroy();
		
		service.test();
		security.authenticate("Username", "Password");
		
		System.out.println(String.format("Form with Username of %s and Password of %s",loginModel.getUsername(), loginModel.getPassword()));
		return "orders";
	}
	
	

}
