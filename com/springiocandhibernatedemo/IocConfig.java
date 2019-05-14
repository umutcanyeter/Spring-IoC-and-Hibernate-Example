package com.springiocandhibernatedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springiocandhibernatedemo")
public class IocConfig {
	@Bean
	public IProductDal database() {
		return new MysqlDal();
	}
	@Bean
	public IProductServices service() {
		return new ProductManager(database());
	}
}
