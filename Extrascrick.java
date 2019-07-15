package com.abc.cricket.model;	
	
	/**
	 * 
	 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

	/**
	 * @author hassan.izharull
	 *
	 */
	@Entity
	@Table(name="EXTRAS")
	@Getter @Setter @ToString
	public class Extrascrick {
		
		@Id
		@SequenceGenerator(name="SEQ_EXTRA")
		@Column(name="ID")
		private int id;
		
		
		@JoinColumn
		@ManyToOne
		private Bowler bowler;
		
		@Column(name="NOBALLS")
		private int noballs;
		
		@Column(name="LEGBYES")
		private int legbyes;
		
		@Column(name="WIDESS")
		private int wides;
		
		@Column(name="PENALTIES")
		private int penalties;
		
		
		
	
	}




