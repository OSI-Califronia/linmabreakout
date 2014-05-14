package de.linma.breakout.data.user;

import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import de.linma.breakout.data.user.dao.IUserDao;
import de.linma.breakout.data.user.dao.impl.couchDB.UserCouchDB;
import de.linma.breakout.data.user.dao.impl.couchDB.UserDaoCouchDB;
import de.linma.breakout.data.user.dao.impl.db4o.UserDaoDB4O;
import de.linma.breakout.data.user.dao.impl.hibernate.UserDaoHibernate;

public class DaoTest extends TestCase {
	
	@Mock
	private Logger logger;

	private IUserDao testingDao;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testDb4o() {
		testingDao = new UserDaoDB4O("db40_junit_test.db");
		testingDao.setLogger(logger);
				
		daoTesting();
	}
	
	@Test
	public void testCouchDB(){		
		testingDao = new UserDaoCouchDB("http://lenny2.in.htwg-konstanz.de:5984", "breakout1_07_test");
		testingDao.setLogger(logger);
		
		if (testingDao.getUser("Name1") != null) {
			testingDao.deleteUser(new UserCouchDB("Name1", ""));
		}
		if (testingDao.getUser("Name2") != null) {
			testingDao.deleteUser(new UserCouchDB("Name2", ""));
		}
		if (testingDao.getUser("Name3") != null) {
			testingDao.deleteUser(new UserCouchDB("Name3", ""));
		}
		
		daoTesting();
	}
	
	@Test	
	public void testHibernate() {
		testingDao = new UserDaoHibernate();
		testingDao.setLogger(logger);
		
		daoTesting();
	}

	private void daoTesting() {		
		IUser userFirst = testingDao.createUser("Name1", "pass1");
		IUser userSecond = testingDao.createUser("Name2", "pass2");
		IUser userThird = testingDao.createUser("Name3", "pass3");
		
		List<IUser> allUsers = testingDao.getAllUsers();
		assertEquals(3, allUsers.size());
		
		IUser userDbFirst = testingDao.getUser("Name1");
		assertEquals(userFirst, userDbFirst);
		
		IUser userDbSecond = testingDao.getUser("Name2");
		assertEquals(userSecond, userDbSecond);
		
		IUser userDbThird = testingDao.getUser("Name3");
		assertEquals(userThird, userDbThird);
		
		userFirst.setPassword("new1");
		userSecond.setPassword("new2");
		userThird.setPassword("new3");
		testingDao.updateUser(userFirst);
		testingDao.updateUser(userSecond);
		testingDao.updateUser(userThird);
		
		List<IUser> allUsersNew = testingDao.getAllUsers();
		assertEquals(3, allUsersNew.size());
		
		userDbFirst = testingDao.getUser("Name1");
		assertEquals(userDbFirst.getPassword(), "new1");
		
		userDbSecond = testingDao.getUser("Name2");
		assertEquals(userDbSecond.getPassword(), "new2");
		
		userDbThird = testingDao.getUser("Name3");
		assertEquals(userDbThird.getPassword(), "new3");
		
		testingDao.deleteUser(userFirst);
		testingDao.deleteUser(userSecond);
		testingDao.deleteUser(userThird);
		
		List<IUser> allUsersEmpty = testingDao.getAllUsers();
		assertEquals(0, allUsersEmpty.size());
	}
	
	@Override
	protected void tearDown(){
		testingDao.close();
	}
}
