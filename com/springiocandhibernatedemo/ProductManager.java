package com.springiocandhibernatedemo;

public class ProductManager implements IProductServices {

	private IProductDal productDal;
	public ProductManager(IProductDal productDal) {
		this.productDal = productDal;
	}

	private String nameproducts;
	private int priceproduct;
	private String categoryproduct;
	private String productidproducts;

	@Override
	public void add() {
		productDal.add(nameproducts, productidproducts, priceproduct, categoryproduct);
	}

	@Override
	public void verifyProductToAddDb(String nameproducts, int priceproduct, String categoryproduct) {
		char categoryFirstChar = categoryproduct.charAt(0);
		String price = Integer.toString(priceproduct);
		this.nameproducts = nameproducts;
		this.priceproduct = priceproduct;
		this.categoryproduct = categoryproduct;
		this.productidproducts = categoryFirstChar+price;
		add();
	}

	@Override
	public void list() {
		productDal.list();
	}

	@Override
	public void delete(int productId) {
		productDal.delete(productId);		
	}

	@Override
	public void update(int productId, String nameproducts, int priceproduct, String categoryproduct) {
		productDal.update(productId, nameproducts, priceproduct, categoryproduct);
	}

}
