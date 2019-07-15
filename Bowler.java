
	/**
	 * 
	 */

package com.abc.cricket.model;



	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
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
	@Table(name="BOWLER")
	@Getter @Setter @ToString
	public class Bowler {
		
		@Id
		@SequenceGenerator(name="SEQ_PLAYER")
		@Column(name="ID")
		private int id;
		
		@JoinColumn
		@ManyToOne
		private Player player;
		
		@Column(name="OVERS")
		private int overs;
		
		@Column(name="MAIDENS")
		private int maidens;
		
		@Column(name="RUNS")
		private int runs;
		
		@Column(name="WICKETS")
		private int wickets;
		
		@Column(name="NOBALLS")
		private int noballs;
		
		@Column(name="WIDES")
		private int wides;
		
		@Column(name="ECO")
		private int economy;
	}



