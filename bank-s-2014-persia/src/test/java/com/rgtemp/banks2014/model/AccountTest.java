package com.rgtemp.banks2014.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import com.rgtemp.banks2014.model.account.dao.AccountDao;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class AccountTest {

	/*
	 * Possible improvement:
	 * add test for 
	 * thatCanBeCreated
	 * thatCanBeRead
	 * thatCanBeUpdated
	 * 
	 * thatDeletingNonExistingLogsAWarning(), 
	 * thatCreatingExistingThrowsAnException(), 
	 * thatReadingNonExistingFoo(),
	 * thatUpdatingNonExistingLogsAWarning(),
	 */
	
	@Test
	public void thatCanBeDeleted() {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("Beans.xml");

 		AccountDao accountDao = (AccountDao) context.getBean("jdbcAccountDao");
 		//count
 		Integer count = accountDao.count();
		//create
 		Account account = new Account(accountDao.getNextId(), "d1", "ad1");
 		accountDao.insert(account);
 		Integer newCount;
 		//newCount
 		newCount = accountDao.count();
 		//assert count
 		assertThat("Number of accounts should increase after creating an account", newCount, is(count + 1));
 		//select
 		account = accountDao.find("d1", "ad1");
 		//get id
 		Long id = account.getAccId();
 		//delete
 		accountDao.delete(id);
 		//new count
		newCount = accountDao.count();
 		//assert count (same as in create)
		assertThat("Number of accounts should decrease after delete an existing account", newCount, is(count));
	}
	
	@Test
	public void testFoo() {
		assertThat("rsn", 2, is(2));
	}
}
