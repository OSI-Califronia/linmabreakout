package de.linma.breakout.data.highscore.dao.impl.hibernate;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.NoArgsConstructor;
import de.linma.breakout.data.highscore.Highscore;
import de.linma.breakout.data.highscore.IHighscore;

/**
 * 
 * @author MBausch
 *
 */
@Entity
@Table(name="breakout1_highscore")
@Access(AccessType.PROPERTY)
@NoArgsConstructor
public class HighscoreHibernate extends Highscore {
	
	private static final long serialVersionUID = 1671158891191308643L;
		
	private Integer id;	
	
	public HighscoreHibernate(IHighscore modelHighscore) {
		super(modelHighscore);
	}
	
	public HighscoreHibernate(String userName, Integer points) {
		super(userName, points);
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	public Integer getTest() {
		return id;
	}
	
	public void setTest(Integer id) {
		this.id = id;
	}
	
	@Override
	@Column(name = "username", nullable = false)	
	public String getUserName() {
		return super.getUserName();
	}
	
	public void setUserName(String userName) {
		super.setUserName(userName);
	}
	
	@Override
	@Column(name = "date", nullable = false)
	@Temporal(TemporalType.DATE)	
	public Date getDate() {
		return super.getDate();
	}
	
	public void setDate(Date date) {
		super.setDate(date);
	}
	
	@Override
	@Column(name = "points", nullable = false)
	public Integer getPoints() {
		return super.getPoints();
	}
	
	public void setPoints(Integer points) {
		super.setPoints(points);
	}
	
	
}
