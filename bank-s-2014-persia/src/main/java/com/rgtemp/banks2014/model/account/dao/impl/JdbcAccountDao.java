package com.rgtemp.banks2014.model.account.dao.impl;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.core.simple.ParameterizedBeanPropertyRowMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.rgtemp.banks2014.model.Account;
import com.rgtemp.banks2014.model.AccountRowMapper;
import com.rgtemp.banks2014.model.account.dao.AccountDao;

@Repository
public class JdbcAccountDao extends JdbcDaoSupport implements AccountDao {
/*
 * Possible improvement:
 * Configure bean annotation to have id="accountDAO" instead of id="jdbcAccountDAO"
 * Extract string account as TABLE_NAME
 */
	
	@Autowired 
	public JdbcAccountDao(DataSource dataSource) {
	    super();
	    setDataSource(dataSource);
	}
	
	@Override
	public void delete(Long id) {
		String sql = "DELETE FROM account WHERE acc_id = ?";
		getJdbcTemplate().update(sql, id);
	}

	@Override
	public void insert(Account account) {
		/* 
		 * possible improvement: add constraints on iban and bic before
		 * 		trying to persist.  
		 * 
		 */
		String sql = "INSERT INTO account " +
				"(acc_id, iban, bic) VALUES (?, ?, ?)";
				 
			getJdbcTemplate().update(sql, account.getAccId(), 
						account.getIban(), account.getBic()  
			);
	}

	@Override
	public Account findById(Long id) {
		throw new RuntimeException("Implement me");
//		return null;
	}

	@Override
	public void update(Long id) {
		throw new RuntimeException("Implement me");
	}

	@Override
	public List<Account> list() {
		String sql = "SELECT * FROM PUBLIC.ACCOUNT";
		List<Account> accounts = getJdbcTemplate().query(sql,
				ParameterizedBeanPropertyRowMapper.newInstance(Account.class));

		return accounts;
	}

	@Override
	public int count() {
		// Possible improvement: use sql count, no need to read contents of columns
		return list().size();
	}

	@Override
	public long getNextId() {
		String sql = "SELECT MAX(acc_id) FROM account";
		
		// Possible improvement: prevent autoboxing.
		long id = getJdbcTemplate().queryForObject(sql, Long.class);
				
		return id + 1;
	}

	@Override
	public Account find(String iban, String bic) {
		String sql = "SELECT * FROM account WHERE iban = ? AND bic = ? LIMIT 1";
		Account account = getJdbcTemplate().queryForObject(
				sql,  new AccountRowMapper(), iban, bic);
	
		return account;
	}
}
