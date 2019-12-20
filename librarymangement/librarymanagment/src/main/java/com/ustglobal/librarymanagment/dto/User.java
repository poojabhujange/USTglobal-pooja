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
@Table(name="user")
public class User {
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private long phone;
	@Column(unique = true)
	private String email;
	@Column
	private String password;
	
	@Column
	private String role;
	

	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy ="user")
	private List<Order> bookIssues;
	


}
