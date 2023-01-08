package com.core.bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AccountStatement {
	
	//file: TransactionDate,Narration,WithdrawalAmount,DepositAmount
	
	@Override
	public String toString() {
		return "AccountStatement [transactionDate=" + transactionDate + ", narration=" + narration
				+ ", withdrawalAmount=" + withdrawalAmount + ", ddepositAmount=" + ddepositAmount + "]";
	}




	private LocalDate transactionDate;
	private String narration;
	private double withdrawalAmount;
	private double ddepositAmount;
	
	
	
	
	public AccountStatement(LocalDate transactionDate, String narration, double withdrawalAmount,
			double ddepositAmount) {
		super();
		this.transactionDate = transactionDate;
		this.narration = narration;
		this.withdrawalAmount = withdrawalAmount;
		this.ddepositAmount = ddepositAmount;
	}




	public LocalDate getTransactionDate() {
		return transactionDate;
	}




	public String getNarration() {
		return narration;
	}




	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}




	public double getDdepositAmount() {
		return ddepositAmount;
	}




	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}




	public void setNarration(String narration) {
		this.narration = narration;
	}




	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}




	public void setDdepositAmount(double ddepositAmount) {
		this.ddepositAmount = ddepositAmount;
	}
	
	

	 
	// LocalDate date = LocalDate.parse("2005-nov-12", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	

	
	

}
