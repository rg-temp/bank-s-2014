package com.rgtemp.banks2014.model.account.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.rgtemp.banks2014.model.account.dao.AccountDao;

@Repository
public class JdbcAccountDao extends JdbcDaoSupport implements AccountDao {
/*
 * Possible improvement:
 * Configure bean annotation to have id="accountDAO" instead of id="jdbcAccountDAO" 
 */
	
	@Override
	public void delete(Integer id) {
		throw new RuntimeException("Implement me");
	}

}
