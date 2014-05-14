package de.linma.breakout.data.highscore.dao.impl.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import de.linma.breakout.data.highscore.Highscore;
import de.linma.breakout.data.highscore.IHighscore;

/**
 * 
 * @author MBausch
 *
 */
@Entity
@Table(name="breakout1_highscore")
public class HighscoreHibernate extends Highscore {
	
	private static final long serialVersionUID = 1671158891191308643L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Integer id;
	
	public HighscoreHibernate(IHighscore modelHighscore) {
		super(modelHighscore);
	}
	
	public HighscoreHibernate(String userName, Integer points) {
		super(userName, points);
	}
	
	@Column(name = "username", nullable = false)
	@Override
	public String getUserName() {
		return super.getUserName();
	}
	
	public void setUserName(String userName) {
		super.setUserName(userName);
	}
	
	@Column(name = "date", nullable = false)
	@Temporal(TemporalType.DATE)
	@Override
	public Date getDate() {
		return super.getDate();
	}
	
	public void setDate(Date date) {
		super.setDate(date);
	}
	
	@Column(name = "points", nullable = false)
	@Override
	public Integer getPoints() {
		return super.getPoints();
	}
	
	public void setPoints(Integer points) {
		super.setPoints(points);
	}
}
