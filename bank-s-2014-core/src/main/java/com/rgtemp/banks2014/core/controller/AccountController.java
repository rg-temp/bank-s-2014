package com.rgtemp.banks2014.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.rgtemp.banks2014.model.Account_copy;

@Controller
public class AccountController {
	/* possible improvement: use AccountService to interact with Accounts, in 
	 * 		case there are complex logic and business logic for operations
	*/
	
	@RequestMapping(value = "/accounts", method = RequestMethod.GET)
	public ModelAndView list() {
		//http://localhost:8080/bank/accounts
		ModelAndView model = new ModelAndView("account/list");
		List<Account_copy> accounts = getAccounts();
		model.addObject("accounts", accounts);
		model.addObject("uriContext", "accounts");
		
		return model;
	}

	private List<Account_copy> getAccounts() {
		 // possible improvement: delegate and move this to a service
		List<Account_copy> list = new ArrayList<>();
		Account_copy account;
		account = new Account_copy(1, "l1", "l1a");
		list.add(account);
		account = new Account_copy(2, "l2", "l2a");
		list.add(account);
		account = new Account_copy(3, "l3", "l3a");
		list.add(account);
		account = new Account_copy(4, "l4", "l4a");
		list.add(account);
 
		return list;
	}
	
	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.GET)
	public ModelAndView show(@PathVariable Long id) {
		/* possible improvement: if UI needs to be implemented on another 
		 * 			controller instead of ajax call
		 * 		if not found for the given id
		 * 			set error status to 404 or
		 * 			set flash message and redirect to list()
		*/
		ModelAndView model = new ModelAndView("show");
//		Account_copy account = accountDao.findById(id);
//		model.addObject("account", account);
		return model;
	}
	
	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.PUT)
	public ModelAndView update(@PathVariable Long id) {
		/* possible improvement: if UI needs to be implemented on another 
		 * 			controller instead of ajax call
		 * 		if not found for the given id
		 * 			set error status to 404 or
		 * 			set flash message and redirect to list()
		 * 		if validation fails, flash and redirect to update view with 
		 * 			fields prefilled with entered values
		*/
		ModelAndView model = new ModelAndView("show");
//		Account_copy account = accountDao.findById(id);
//		model.addObject("account", account);
		
		return model;
	}
	
	@RequestMapping(value = "/accounts", method = RequestMethod.POST)
	public ModelAndView create() {
		/* possible improvement: return id of created resource
		 * if some of the fields are considered to contain sensitive information,
		 * 		use js to send as byte array, after persisted on the controller
		 * 		write with 2 or more passes on the write array
		 * 		1st pass 100% of positions with random values
		 * 		2nd pass ~75% of random positions with random values
		 * 		
		 *		Writing on the byte array reduces the window of time 
		 *		for which the sensitive information is stored in the memory 
		 *		(i.e.: reading memory addresses on the server where the 
		 *		application is running, accessing a memory dump of the
		 *		server).
		 *		Writing several passes reduces the chances of recovering 
		 *		information from the physical device (i.e.: replacing or 
		 *		accessing memory hardware of the server) 
		*/
		ModelAndView model = new ModelAndView("show");
//		Account_copy account = accountDao.findById(id);
//		model.addObject("account", account);
		
		return model;
	}
	
	@RequestMapping(value = "/accounts/{id}", method = RequestMethod.DELETE)
	public ModelAndView delete(@PathVariable Long id) {
		/* possible improvement: if UI needs to be implemented on another 
		 * 			controller instead of ajax call
		 * 		if not found for the given id
		 * 			set error status to 404 or
		 * 			set flash message and redirect to list()
		 * 		if cannot be deleted, flash and redirect to show()
		*/
		ModelAndView model = new ModelAndView("list");
//		Account_copy account = accountDao.findById(id);
//		model.addObject("account", account);
		
		return model;
	}

}
