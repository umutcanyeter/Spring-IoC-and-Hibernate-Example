package com.springiocandhibernatedemo;

public interface IProductDal {
	void add(String nameproducts,String productidproducts,int priceproduct,String categoryproduct);
	void delete(int productId);
	void list();
	void update(int productId, String nameproducts, int priceproduct, String categoryproduct);
}
