package com.vism.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vism.services.BookService;

public class Test {

	public static void main(String argsp[]) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\VISMTech\\MyFirstSpringProject\\src\\main\\resources\\Bean.xml");

		BookService service = context.getBean(BookService.class);

		System.out.println("Service class object..." + service);

	}

}
