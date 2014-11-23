package com.rgtemp.banks2014.model;

public class Account_copy {
	/* possible improvement: configure maven to use other modules when the
	 * 		war is created for deploying, so it packages last version of
	 * 		bank-2-persia without requiring maven install locally. 
	*/
	private long accId;
	
	private String iban;
	
	private String bic;
	
	public Account_copy() {
	}
	
	public Account_copy(long accId, String iban, String bic) {
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
