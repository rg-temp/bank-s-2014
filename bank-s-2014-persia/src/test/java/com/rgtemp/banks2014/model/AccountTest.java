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
	 * add test for thatDeletingNonExistingLogsAWarning(), 
	 * thatCreatingExistingThrowsAnException(), 
	 * thatReadingNonExistingFoo(),
	 * thatUpdatingNonExistingLogsAWarning(),
	 */
	
	@Test
	public void thatCanBeDeleted() {
		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("Beans.xml");

 		AccountDao accountDao = (AccountDao) context.getBean("jdbcAccountDao");
		Integer id = Integer.MIN_VALUE;
		accountDao.delete(id);
		assertThat("rsn", 2, is(2));
	}
	
	@Test
	public void testFoo() {
		assertThat("rsn", 2, is(2));
	}
}
