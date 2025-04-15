package com.devsuperior.aula;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		Order order;
		System.out.print("Código: ");
		Integer code = sc.nextInt();
		System.out.print("Valor base: R$ ");
		Double basic = sc.nextDouble();
		System.out.print("Porcentagem de desconto: ");
		Double discount = sc.nextDouble();
	
		order = new Order(code, basic, discount);
		
		OrderService orderService = new OrderService();
				
		System.out.println();
		System.out.println("Pedido código " + order.getCode());
		double total = orderService.total(order);
		System.out.printf("Valor total: R$ %.2f%n", total);
		
		sc.close();
	}
}
