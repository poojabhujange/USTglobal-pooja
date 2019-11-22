package com.ustgobal.jpawithhibernet.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ustgobal.jpawithhibernet.onetoone.Person;
import com.ustgobal.jpawithhibernet.onetoone.VoterId;

import lombok.Data;

@Data
@Entity
@Table(name="Pencil")
public class Pencil {
	@Id
	@Column
	private int pid;
	@Column
	private String color;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid")
	private PencilBox pencilbox;
	
	

}
