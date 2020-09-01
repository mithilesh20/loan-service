package com.infy.rcc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CreditDetails {
	
	private String settlementAccountNumber;
	@JsonFormat(pattern = "yyyy-MMM-dd")
	private Date nextPaymentDate;
	private double monthlyInterestPercentage;
	private int numberOfMonths;
	private String settlementAccountHolderName;
	private double annualInterestPercentage;
	private double creditAmount;
	private double balance;
	private double termAmount;
	private double partialCreditAmount;
	
	public CreditDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public CreditDetails(String settlementAccountNumber, Date nextPaymentDate, double monthlyInterestPercentage, int numberOfMonths, String settlementAccountHolderName, double annualInterestPercentage, double creditAmount, double balance, double termAmount, double partialCreditAmount) {
		this.settlementAccountNumber = settlementAccountNumber;
		this.nextPaymentDate = nextPaymentDate;
		this.monthlyInterestPercentage = monthlyInterestPercentage;
		this.numberOfMonths = numberOfMonths;
		this.settlementAccountHolderName = settlementAccountHolderName;
		this.annualInterestPercentage = annualInterestPercentage;
		this.creditAmount = creditAmount;
		this.balance = balance;
		this.termAmount = termAmount;
		this.partialCreditAmount = partialCreditAmount;
	}
	
	public Date getNextPaymentDate() {
		return nextPaymentDate;
	}
	public void setNextPaymentDate(Date nextPaymentDate) {
		this.nextPaymentDate = nextPaymentDate;
	}
	public String getSettlementAccountNumber() {
		return settlementAccountNumber;
	}
	public void setSettlementAccountNumber(String settlementAccountNumber) {
		this.settlementAccountNumber = settlementAccountNumber;
	}
	public double getMonthlyInterestPercentage() {
		return monthlyInterestPercentage;
	}
	public void setMonthlyInterestPercentage(double monthlyInterestPercentage) {
		this.monthlyInterestPercentage = monthlyInterestPercentage;
	}
	public double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public int getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	public double getAnnualInterestPercentage() {
		return annualInterestPercentage;
	}
	public void setAnnualInterestPercentage(double annualInterestPercentage) {
		this.annualInterestPercentage = annualInterestPercentage;
	}
	public String getSettlementAccountHolderName() {
		return settlementAccountHolderName;
	}
	public void setSettlementAccountHolderName(String settlementAccountHolderName) {
		this.settlementAccountHolderName = settlementAccountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getTermAmount() {
		return termAmount;
	}
	public void setTermAmount(double termAmount) {
		this.termAmount = termAmount;
	}

	public double getPartialCreditAmount() {
		return partialCreditAmount;
	}

	public void setPartialCreditAmount(double partialCreditAmount) {
		this.partialCreditAmount = partialCreditAmount;
	}
}
