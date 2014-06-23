package de.linma.breakout.data.highscore;

import java.util.List;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import de.linma.breakout.data.highscore.dao.IHighscoreDao;
import de.linma.breakout.data.highscore.dao.impl.couchDB.HighscoreDaoCouchDB;
import de.linma.breakout.data.highscore.dao.impl.db4o.HighscoreDaoDB4O;
import de.linma.breakout.data.highscore.dao.impl.hibernate.HighscoreDaoHibernate;

public class HighscoreDaoTest {
	
	@Mock
	private Logger logger;

	private IHighscoreDao testingDao;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testDb4o() {
		testingDao = new HighscoreDaoDB4O("db40_junit_test.db");
		testingDao.setLogger(logger);
				
		daoTesting();
	}
	
	@Test
	public void testCouchDB(){		
		testingDao = new HighscoreDaoCouchDB("http://lenny2.in.htwg-konstanz.de:5984", "breakout1_07_test_highscore");
		testingDao.setLogger(logger);
		
//		if (testingDao.getUser("Name1") != null) {
//			testingDao.deleteUser(new UserCouchDB("Name1", ""));
//		}
//		if (testingDao.getUser("Name2") != null) {
//			testingDao.deleteUser(new UserCouchDB("Name2", ""));
//		}
//		if (testingDao.getUser("Name3") != null) {
//			testingDao.deleteUser(new UserCouchDB("Name3", ""));
//		}
//		
		daoTesting();
	}
	
	@Test
	public void testHibernate() {
		testingDao = new HighscoreDaoHibernate();
		testingDao.setLogger(logger);
		
		daoTesting();
	}

	private void daoTesting() {	
		testingDao.clearHighscore();
		
		Assert.assertTrue(testingDao.addHighscore("Name1", 200));
		Assert.assertTrue(testingDao.addHighscore("Name2", 100));
		Assert.assertTrue(testingDao.addHighscore("Name3", 500));
		Assert.assertTrue(testingDao.addHighscore("Name4", 200));
		
				
		List<IHighscore> list = testingDao.getSortedHighscore();
		Assert.assertEquals(4, list.size());
		
		IHighscore entry = list.get(0);
		Assert.assertEquals(entry.getUserName(), "Name3");
		Assert.assertEquals(entry.getPoints().intValue(), 500);
		
		entry = list.get(1);
		Assert.assertEquals(entry.getUserName(), "Name1");
		Assert.assertEquals(entry.getPoints().intValue(), 200);
		
		entry = list.get(2);
		Assert.assertEquals(entry.getUserName(), "Name4");
		Assert.assertEquals(entry.getPoints().intValue(), 200);
	}
	
	@After
	public void tearDown(){
		testingDao.close();
	}
}
