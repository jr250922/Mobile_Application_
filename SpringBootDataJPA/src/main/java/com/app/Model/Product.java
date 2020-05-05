package com.app.Model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue	
	private Integer prodId;
	private String  prodName;
	private double  prodCost;
	private String  color;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer prodId) {
		super();
		this.prodId = prodId;
	}
	public Product(String prodName, double prodCost, String color) {
		super();
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.color = color;
	}
	public Product(Integer prodId, String prodName, double prodCost, String color) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCost = prodCost;
		this.color = color;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdCost() {
		return prodCost;
	}
	public void setProdCost(double prodCost) {
		this.prodCost = prodCost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCost=" + prodCost + ", color=" + color
				+ "]";
	}
}
