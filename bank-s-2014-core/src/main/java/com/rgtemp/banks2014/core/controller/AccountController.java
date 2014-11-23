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
	
	@RequestMapping(value = "/acccounts", method = RequestMethod.GET)
	public ModelAndView list() {
		//http://localhost:8080/bank/acccounts
		ModelAndView model = new ModelAndView("list");
		List<Account_copy> accounts = getAccounts();
		model.addObject("accounts", accounts);
		
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
	
	@RequestMapping(value = "/acccounts/{id}", method = RequestMethod.GET)
	public ModelAndView show(@PathVariable Long id) {
		ModelAndView model = new ModelAndView("show");
//		Account_copy account = accountDao.findById(id);
//		model.addObject("account", account);
		
		return model;
	}

}
