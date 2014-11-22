package com.rgtemp.banks2014.model.account.dao.impl;

import javax.sql.DataSource;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import com.rgtemp.banks2014.model.account.dao.AccountDao;

@Repository
public class JdbcAccountDao extends JdbcDaoSupport implements AccountDao {
/*
 * Possible improvement:
 * Configure bean annotation to have id="accountDAO" instead of id="jdbcAccountDAO" 
 */
	
	@Autowired 
	public JdbcAccountDao(DataSource dataSource) {
	    super();
	    setDataSource(dataSource);
	}
	
	@Override
	public void delete(Integer id) {
		throw new RuntimeException("Implement me");
	}

}
