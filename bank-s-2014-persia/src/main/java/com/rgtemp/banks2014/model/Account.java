package com.rgtemp.banks2014.model;

public class Account {
	
	private long accId;
	
	private String iban;
	
	private String bic;
	
	public Account() {
	}
	
	public Account(long accId, String iban, String bic) {
		super();
		this.accId = accId;
		this.iban = iban;
		this.bic = bic;
	}

	public long getAccId() {
		return accId;
	}

	public void setAccId(long accId) {
		this.accId = accId;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

}
