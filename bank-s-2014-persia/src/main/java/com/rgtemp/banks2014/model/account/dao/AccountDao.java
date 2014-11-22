package com.rgtemp.banks2014.model.account.dao;

import java.util.List;

import com.rgtemp.banks2014.model.Account;

public interface AccountDao {
	
	public void insert(Account account);
	
	// possible improvement: check if parameter as Integer prevents autoboxing 
	public Account findById(Integer id);
	
	// possible improvement: improve update interface for common updates so not all the columns needs to be provided
	public void update(Integer id);

	public void delete(Integer id);
	
	public List<Account> list();

}
