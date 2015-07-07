package model;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the SCORE database table.
 * 
 */
@Entity
@Table(name="Score", schema="TESTUSER")
@NamedQuery(name="Score.findAll", query="SELECT s FROM Score s")

public class Score implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Temporal(TemporalType.DATE)
	private Date scoredate;

	private Timestamp scoretime;

	private BigDecimal testscore;

	public Score() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getScoredate() {
		return this.scoredate;
	}

	public void setScoredate(Date scoredate) {
		this.scoredate = scoredate;
	}

	public Timestamp getScoretime() {
		return this.scoretime;
	}

	public void setScoretime(Timestamp scoretime) {
		this.scoretime = scoretime;
	}

	public BigDecimal getTestscore() {
		return this.testscore;
	}

	public void setTestscore(BigDecimal testscore) {
		this.testscore = testscore;
	}

}