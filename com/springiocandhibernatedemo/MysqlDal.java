package com.springiocandhibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MysqlDal implements IProductDal{

	@Override
	public void add(String nameproducts, String productidproducts, int priceproduct, String categoryproduct) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Product product = new Product();
			product.setNameproducts(nameproducts);
			product.setPriceproduct(priceproduct);
			product.setCategoryproduct(categoryproduct);
			product.setProductidproducts(productidproducts);
			session.save(product);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	@Override
	public void update(int productId, String nameproducts, int priceproduct, String categoryproduct) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Product product = session.get(Product.class, productId);
			product.setNameproducts(nameproducts);
			product.setPriceproduct(priceproduct);
			product.setCategoryproduct(categoryproduct);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	@Override
	public void delete(int productId) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			Product product = session.get(Product.class, productId);
			session.delete(product);
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

	@Override
	public void list() {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Product> products = session.createQuery("from Product").getResultList();
			for(Product p:products) {
				System.out.println("------#" + p.getId() + "#------");
				System.out.println("Product Name: " + p.getNameproducts());
				System.out.println("Product ID: " + p.getProductidproducts());
				System.out.println("Product Price: " + p.getPriceproduct() + " TL");
				System.out.println("Product Category: " + p.getCategoryproduct());
			}
			session.getTransaction().commit();
		} finally {
			factory.close();
		}
	}

}
