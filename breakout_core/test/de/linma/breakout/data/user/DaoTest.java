package de.linma.breakout.data.user;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.linma.breakout.data.dao.DaoDB4O;
import de.linma.breakout.data.dao.IDao;
import junit.framework.TestCase;

public class DaoTest extends TestCase {

	IDao db4o;

	@Before
	protected void setUp() {
		db4o = new DaoDB4O("db40_junit.db");
	}

	@Test
	public void testDb4o() {
		User userFirst = db4o.createUser("Name1", "pass1");
		User userSecond = db4o.createUser("Name2", "pass2");
		User userThird = db4o.createUser("Name3", "pass3");
		
		List<User> allUsers = db4o.getAllUsers();
		assertEquals(3, allUsers.size());
		
		User userDbFirst = db4o.getUser("Name1", "pass1");
		assertEquals(userFirst, userDbFirst);
		
		User userDbSecond = db4o.getUser("Name2", "pass2");
		assertEquals(userSecond, userDbSecond);
		
		User userDbThird = db4o.getUser("Name3", "pass3");
		assertEquals(userThird, userDbThird);
		
		userFirst.setUsername("new1");
		userSecond.setUsername("new2");
		userThird.setUsername("new3");
		db4o.updateUser(userFirst);
		db4o.updateUser(userSecond);
		db4o.updateUser(userThird);
		
		List<User> allUsersNew = db4o.getAllUsers();
		assertEquals(3, allUsersNew.size());
		
		User userDbFirstNew = db4o.getUser("new1", "pass1");
		assertEquals(userFirst, userDbFirstNew);
		
		User userDbSecondNew = db4o.getUser("new2", "pass2");
		assertEquals(userSecond, userDbSecondNew);
		
		User userDbThirdNew = db4o.getUser("new3", "pass3");
		assertEquals(userThird, userDbThirdNew);
		
		User userNotExist = db4o.getUser("empty", "asd");
		assertNull(userNotExist);
		
		db4o.deleteUser(userFirst);
		db4o.deleteUser(userSecond);
		db4o.deleteUser(userThird);
		
		List<User> allUsersEmpty = db4o.getAllUsers();
		assertEquals(0, allUsersEmpty.size());
	}
	
	@Override
	protected void tearDown(){
		db4o.close();
	}
}
