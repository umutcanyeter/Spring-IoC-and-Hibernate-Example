package com.springiocandhibernatedemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class);
		
		IProductServices productService = context.getBean("service",IProductServices.class);	
		
		//For list datas
		productService.list();
		//For insert data
		productService.verifyProductToAddDb("nameproducts", 9999, "categoryproduct");
		//For update data
		productService.update(9, "nameproducts", 9999, "categoryproduct");
		//For delete data
		productService.delete(9);
	}

}
