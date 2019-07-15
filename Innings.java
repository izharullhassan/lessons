package com.abc.cricket.model;
/**
 * 
 */

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
@Table(name="INNINGS")
@Getter @Setter @ToString
public class Innings {

	@Id
	@SequenceGenerator(name="SEQ_INN")
	@Column(name="ID")
	private int id;
	
	@JoinColumn(name="TEAM_ID")
	@ManyToOne
	private Team team;
	
	@Column(name="RUNS")
	private int runs;
	
	@Column(name="WICKETS")
	private int wickets;
	
	@Column(name="OVERS")
	private float overs;
	
	
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="BATSMEN_ID")
	private List<BatMan> batsman;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="BOWLER_ID")
	private List<Bowler> bowlers;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="FALLOFWICKETS_ID")
	private List<FallOfWickets> fows;
	
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="EXTRAS")
	private List<Extrascrick> extras;
}





