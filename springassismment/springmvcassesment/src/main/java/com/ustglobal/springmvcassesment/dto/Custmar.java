package com.ustglobal.springmvcassesment.dto;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="customer_details")
public class Custmar {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	 
	@Column
	private String name;
	
	@Column(unique = true)
	private String email;
	
	@Column
	private String password;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="user_product",joinColumns = @JoinColumn(name="id"),inverseJoinColumns = @JoinColumn(name="pid"))
	private List<ProductBean> product;

	public List<ProductBean> getProduct() {
		return product;
	}

	public void setProduct(List<ProductBean> product) {
		this.product = product;
	}
	
}
