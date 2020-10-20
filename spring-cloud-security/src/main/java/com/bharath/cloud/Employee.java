package com.bharath.cloud;

public class Employee {
	private int accountNo;
	
	private String acctType;
	
	private String acctHolderName;
	
	private String bankName;

	public Employee(int accountNo, String acctType, String acctHolderName, String bankName) {
		super();
		this.accountNo = accountNo;
		this.acctType = acctType;
		this.acctHolderName = acctHolderName;
		this.bankName = bankName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAcctType() {
		return acctType;
	}

	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}

	public String getAcctHolderName() {
		return acctHolderName;
	}

	public void setAcctHolderName(String acctHolderName) {
		this.acctHolderName = acctHolderName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
