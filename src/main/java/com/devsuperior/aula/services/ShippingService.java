package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

import com.devsuperior.aula.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		
		double shipValue = 0.00;
	
		if (order.getBasic()< 100.00) {
				shipValue = 20.00;
		} else if (order.getBasic()< 200.00){
				shipValue = 12.00;
		}		
		return shipValue;
	}
}
