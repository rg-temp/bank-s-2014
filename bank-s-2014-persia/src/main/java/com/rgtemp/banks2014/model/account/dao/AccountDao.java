package com.rgtemp.banks2014.model.account.dao;

import java.util.List;

import com.rgtemp.banks2014.model.Account;

public interface AccountDao {
	
	public void insert(Account account);
	
	// possible improvement: check if parameter as Integer prevents autoboxing 
	public Account findById(Long id);
	
	// possible improvement: improve update interface for common updates so not all the columns needs to be provided
	public void update(Long id);

	public void delete(Long id);
	
	public int count();
	
	public List<Account> list();

	public long getNextId();

	public Account find(String iban, String bic);

}
