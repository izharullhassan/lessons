
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
@Table(name="BATMAN")
@Getter @Setter @ToString
public class BatMan {

	@Id
	@SequenceGenerator(name="SEQ_BAT")
	@JoinColumn(name="ID")
	private int id;
	
	@JoinColumn(name="PLAYER_ID")
	@ManyToOne
	private Player player;
	
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="BALLS")
	private int balls;
	
	@Column(name="FOURS")
	private int fours;
	
	@Column(name="SIXES")
	private int sixes;
	
	@Column(name="SR")
	private int sr;
	
	
	
}

