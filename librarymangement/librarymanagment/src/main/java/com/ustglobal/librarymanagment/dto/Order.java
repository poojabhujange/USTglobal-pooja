package com.ustglobal.librarymanagment.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="order_book")
public class Order {
	@Id
	@Column
	@GeneratedValue
	private int transactionId;
	@Column
	private Date issueDate;
	@Column
	private Date returnDate;
	
	@Column
	private String status;
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private User user;
	

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	private Book book;
	
	


}
