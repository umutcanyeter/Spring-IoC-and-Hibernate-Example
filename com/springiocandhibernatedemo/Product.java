package com.springiocandhibernatedemo;

import javax.persistence.*;

@Entity
@Table(name="products")
public class Product {
	@Id
	@Column(name="idproducts")
	private int id;
	@Column(name="nameproducts")
	private String nameproducts;
	@Column(name="productidproducts")
	private String productidproducts;
	@Column(name="priceproduct")
	private int priceproduct;
	@Column(name="categoryproduct")
	private String categoryproduct;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameproducts() {
		return nameproducts;
	}
	public void setNameproducts(String nameproducts) {
		this.nameproducts = nameproducts;
	}
	public String getProductidproducts() {
		return productidproducts;
	}
	public void setProductidproducts(String productidproducts) {
		this.productidproducts = productidproducts;
	}
	public int getPriceproduct() {
		return priceproduct;
	}
	public void setPriceproduct(int priceproduct) {
		this.priceproduct = priceproduct;
	}
	public String getCategoryproduct() {
		return categoryproduct;
	}
	public void setCategoryproduct(String categoryproduct) {
		this.categoryproduct = categoryproduct;
	}
}
