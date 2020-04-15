package com.cg.entity;

public class Product 
{
public String prodName;
public int prodId;
public double prodPrice;

public String getProdName() {
	return prodName;
}

public void setProdName(String prodName) {
	this.prodName = prodName;
}

public int getProdId() {
	return prodId;
}

public void setProdId(int prodId) {
	this.prodId = prodId;
}

public double getProdPrice() {
	return prodPrice;
}

public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}

public Product() {
}

public Product(String prodName, int prodId, double prodPrice) {
	super();
	this.prodName = prodName;
	this.prodId = prodId;
	this.prodPrice = prodPrice;
}

}
