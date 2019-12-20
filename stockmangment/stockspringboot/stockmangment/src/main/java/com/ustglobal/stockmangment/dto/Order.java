package com.ustglobal.stockmangment.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="orderin")
public class Order {
	
	@Id
	@Column
	@GeneratedValue
	private int orde_id;
	
	@Column
	private double total_price;
	
	@Column
	private double price_gst;
	
	@ManyToMany(cascade = CascadeType.ALL)
    private List<Product_info> id ;

	public int getOrde_id() {
		return orde_id;
	}

	public void setOrde_id(int orde_id) {
		this.orde_id = orde_id;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public double getPrice_gst() {
		return price_gst;
	}

	public void setPrice_gst(double price_gst) {
		this.price_gst = price_gst;
	}

	public List<Product_info> getId() {
		return id;
	}

	public void setId(List<Product_info> id) {
		this.id = id;
	}
	
	
	

}
