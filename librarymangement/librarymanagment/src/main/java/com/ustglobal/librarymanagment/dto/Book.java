package com.ustglobal.librarymanagment.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;


@Data 
@Entity
@Table(name="book")
public class Book {
	
	  @Id
	  @Column
	  @GeneratedValue
	  private int book_id;

	  @Column
	  private String name;
	
	  @Column
	  private String author;
	  
	  @Column
	  private String publisher;
	  
	  @Column
	  private int available;
	  
	    @JsonIgnore
		@Exclude
		@OneToMany(mappedBy="book")
		private List<Order> bookIssues;
		
	 
}
