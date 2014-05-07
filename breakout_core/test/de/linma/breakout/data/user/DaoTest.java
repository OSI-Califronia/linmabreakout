package de.linma.breakout.data.user;

import java.util.List;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import de.linma.breakout.data.user.dao.IUserDao;
import de.linma.breakout.data.user.dao.impl.couchDB.UserDaoCouchDB;
import de.linma.breakout.data.user.dao.impl.db4o.UserDaoDB4O;
import de.linma.breakout.data.user.dao.impl.hibernate.UserDaoHibernate;

public class DaoTest extends TestCase {
	
	@Mock
	private Logger logger;

	private IUserDao db4o;
	private IUserDao couchDb;
	
	@InjectMocks
	private IUserDao testingDao;

	@Before
	protected void setUp() {
		
		
		db4o = new UserDaoDB4O("db40_junit.db");
		couchDb = new UserDaoCouchDB("http://lenny2.in.htwg-konstanz.de:5984", "breakout_test");
	}

	@Test
	public void testDb4o() {
		IUser userFirst = db4o.createUser("Name1", "pass1");
		IUser userSecond = db4o.createUser("Name2", "pass2");
		IUser userThird = db4o.createUser("Name3", "pass3");
		
		List<IUser> allUsers = db4o.getAllUsers();
		assertEquals(3, allUsers.size());
		
		IUser userDbFirst = db4o.getUser("Name1");
		assertEquals(userFirst, userDbFirst);
		
		IUser userDbSecond = db4o.getUser("Name2");
		assertEquals(userSecond, userDbSecond);
		
		IUser userDbThird = db4o.getUser("Name3");
		assertEquals(userThird, userDbThird);
		
		userFirst.setUsername("new1");
		userSecond.setUsername("new2");
		userThird.setUsername("new3");
		db4o.updateUser(userFirst);
		db4o.updateUser(userSecond);
		db4o.updateUser(userThird);
		
		List<IUser> allUsersNew = db4o.getAllUsers();
		assertEquals(3, allUsersNew.size());
		
		IUser userDbFirstNew = db4o.getUser("new1");
		assertEquals(userFirst, userDbFirstNew);
		
		IUser userDbSecondNew = db4o.getUser("new2");
		assertEquals(userSecond, userDbSecondNew);
		
		IUser userDbThirdNew = db4o.getUser("new3");
		assertEquals(userThird, userDbThirdNew);
		
		IUser userNotExist = db4o.getUser("empty");
		assertNull(userNotExist);
		
		db4o.deleteUser(userFirst);
		db4o.deleteUser(userSecond);
		db4o.deleteUser(userThird);
		
		List<IUser> allUsersEmpty = db4o.getAllUsers();
		assertEquals(0, allUsersEmpty.size());
	}
	
	@Test
	public void testCouchDB(){
		IUser userFirst = couchDb.createUser("Name1", "pass1");
		IUser userSecond = couchDb.createUser("Name2", "pass2");
		IUser userThird = couchDb.createUser("Name3", "pass3");
		
		IUser userDbFirst = couchDb.getUser("Name1");
		assertEquals(userFirst, userDbFirst);
		
		IUser userDbSecond = couchDb.getUser("Name2");
		assertEquals(userSecond, userDbSecond);
		
		IUser userDbThird = couchDb.getUser("Name3");
		assertEquals(userThird, userDbThird);
		
		couchDb.deleteUser(userFirst);
		couchDb.deleteUser(userSecond);
		couchDb.deleteUser(userThird);
	}
	
	@Test
	@Ignore
	public void testHibernate() {
		testingDao = new UserDaoHibernate();
		
		MockitoAnnotations.initMocks(this);
		
		daoTesting();
	}

	public void daoTesting() {
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
		
		userFirst.setUsername("new1");
		userSecond.setUsername("new2");
		userThird.setUsername("new3");
		testingDao.updateUser(userFirst);
		testingDao.updateUser(userSecond);
		testingDao.updateUser(userThird);
		
		List<IUser> allUsersNew = testingDao.getAllUsers();
		assertEquals(3, allUsersNew.size());
		
		IUser userDbFirstNew = testingDao.getUser("new1");
		assertEquals(userFirst, userDbFirstNew);
		
		IUser userDbSecondNew = testingDao.getUser("new2");
		assertEquals(userSecond, userDbSecondNew);
		
		IUser userDbThirdNew = testingDao.getUser("new3");
		assertEquals(userThird, userDbThirdNew);
		
		IUser userNotExist = testingDao.getUser("empty");
		assertNull(userNotExist);
		
		testingDao.deleteUser(userFirst);
		testingDao.deleteUser(userSecond);
		testingDao.deleteUser(userThird);
		
		List<IUser> allUsersEmpty = testingDao.getAllUsers();
		assertEquals(0, allUsersEmpty.size());
	}
	
	@Override
	protected void tearDown(){
		db4o.close();
	}
}
