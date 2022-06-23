package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private int prodId;
	private String prodName;
	private String prodDesc;
	private String prodCost;
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
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
	public String getProdCost() {
		return prodCost;
	}
	public void setProdCost(String prodCost) {
		this.prodCost = prodCost;
	}
	public Product(int prodId, String prodName, String prodDesc, String prodCost) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodCost = prodCost;
	}
	public Product() {
		super();
	}
	
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodDesc=" + prodDesc + ", prodCost="
				+ prodCost + "]";
	}
	
	

}
