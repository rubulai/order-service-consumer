package com.bdm.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdm.gmall.service.OrderService;
import com.bdm.gmall.service.impl.OrderServiceImpl;

public class MainApplication {

	public static void main(String args[]) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
		OrderService orderService = ioc.getBean(OrderServiceImpl.class);
		orderService.initOrder("1");
		System.in.read();
	}
}
