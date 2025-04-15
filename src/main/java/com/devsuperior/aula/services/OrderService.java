package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Order;

@Service
public class OrderService {

	private ShippingService shippingService = new ShippingService();
	
	public double total(Order order) {

		return order.getBasic() - (order.getBasic() * (order.getDiscount()/100)) + shippingService.shipment(order);		
	}
}
