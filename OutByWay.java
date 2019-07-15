package com.abc.cricket.model;
/**
 * 
 */
	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	
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
	@Table(name="OUTBYWAY")
	@Getter @Setter @ToString
	public class OutByWay {
		
		@Id
		@SequenceGenerator(name="SEQ_OBY")
		@Column(name="ID")
		private int id;
		
		
		@Column(name="CAUGHT")
		private String caught;
		
		@Column(name="BOWLED")
		private String bowled;
		
		@Column(name="STUMPED")
		private String stumped;
		
		
	}







