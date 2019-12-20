package com.ustglobal.stockmangment.dto;

import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name="productinfo")
public class Product_info {
	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private  String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private double price;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="order_histroy",joinColumns=@JoinColumn(name="id"),
	inverseJoinColumns=@JoinColumn(name="order_id"))
	private List<Order> order_id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<Order> getOrder_id() {
		return order_id;
	}
	public void setOrder_id(List<Order> order_id) {
		this.order_id = order_id;
	}
	
}
