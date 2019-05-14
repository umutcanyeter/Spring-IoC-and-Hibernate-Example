package com.springiocandhibernatedemo;

public interface IProductServices {
	void add();
	void list();
	void update(int productId, String nameproducts, int priceproduct, String categoryproduct);
	void verifyProductToAddDb(String nameproducts,int priceproduct,String categoryproduct);
	void delete(int productId);
}
