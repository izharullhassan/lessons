
	/**
	 * 
	 */
package com.abc.cricket.model;

	

	



	import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Table(name="FallOfWickets")
	@Getter @Setter @ToString
	public class FallOfWickets {
		
		@Id
		@SequenceGenerator(name="SEQ_FOW")
		@Column(name="ID")
		private int id;
		
		
		
		@Column(name="RUN_AT")
		private int runat;
		
		@Column(name="WICKET_AT")
		private int wicketfallat;
		
		@JoinColumn(name="PLAYER_NO")
		@ManyToOne
		private Player player;
		
		
		
	}





