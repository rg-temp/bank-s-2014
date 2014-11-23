package com.rgtemp.banks2014.core.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import com.rgtemp.banks2014.model.Account;

@Controller
public class AccountController {
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list() {
		//http://localhost:8080/bank/list
		ModelAndView model = new ModelAndView("list");
		List<Account> accounts = getAccounts();
		model.addObject("accounts", accounts);
		
		return "list";
	}

	private List<Account> getAccounts() {
		 // possible improvement: delegate and move this to a service
		List<Account> list = new ArrayList<>();
		Account account;
		account = new Account(1, "l1", "l1a");
		list.add(account);
		account = new Account(2, "l2", "l2a");
		list.add(account);
		account = new Account(3, "l3", "l3a");
		list.add(account);
		account = new Account(4, "l4", "l4a");
		list.add(account);
 
		return list;
	}

}
