package com.example.demo.bean;

public class Product {
	
	private String prodId;
	private String prodName;
	private String prodDesc;
	
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public Product(String prodId, String prodName, String prodDesc) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
	}
	public Product() {
		super();
	}
	
	
	

}
