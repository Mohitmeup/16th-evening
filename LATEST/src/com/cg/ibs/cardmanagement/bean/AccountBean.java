package com.cg.ibs.cardmanagement.bean;

import java.math.BigInteger;

public class AccountBean {
	private BigInteger accountNumber;
	private BigInteger UCI;
	public BigInteger getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigInteger getUCI() {
		return UCI;
	}
	public void setUCI(BigInteger uCI) {
		UCI = uCI;
	}
	public AccountBean() {
		super();
	}
	@Override
	public String toString() {
		return "AccountBean [accountNumber=" + accountNumber + ", UCI=" + UCI + "]";
	}
	public AccountBean(BigInteger accountNumber, BigInteger uCI) {
		super();
		this.accountNumber = accountNumber;
		UCI = uCI;
	}
	
}