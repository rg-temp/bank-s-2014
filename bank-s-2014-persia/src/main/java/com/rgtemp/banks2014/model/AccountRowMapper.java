package com.rgtemp.banks2014.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

public class AccountRowMapper implements ParameterizedRowMapper<Account> {
	
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		Account account = new Account();
//		account.setIban(rs.getString("iban"));
//		account.setBic(rs.getString("iban"));
		
		return account;
	}

}
