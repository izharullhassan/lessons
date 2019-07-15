package com.abc.cricket.model;	
	/**
	 * 
	 */

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;
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
	@Table(name="ScoreCard")
	@Getter @Setter @ToString
	public class ScoreCard {
		
		@Id
		@SequenceGenerator(name="SEQ_FOW")
		@Column(name="ID")
		private int id;
		
		@JoinColumn(name="MATCH_NO")
		@OneToOne
		private Match match;
		
		@JoinColumn(name="INNINGS_NO1")
		@OneToOne
		private Innings innings1;
		
		@JoinColumn(name="INNINGS_NO2")
		@OneToOne
		private Innings innings2;
		
	}








