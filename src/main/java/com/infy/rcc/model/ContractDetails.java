package com.infy.rcc.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ContractDetails {
	
	private long contractNumber;
	private String loanType;
	private String contractHolderName;
	private boolean isDefaulter;
	@JsonFormat(pattern = "yyyy-MMM-dd")
	private Date contractSignedDate;
	@JsonFormat(pattern = "yyyy-MMM-dd")
	private Date contractStartDate;
	
	public ContractDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public ContractDetails(long contractNumber, String loanType, String contractHolderName, boolean isDefaulter, Date contractSignedDate, Date contractStartDate) {
		this.contractNumber = contractNumber;
		this.loanType = loanType;
		this.contractHolderName = contractHolderName;
		this.isDefaulter = isDefaulter;
		this.contractSignedDate = contractSignedDate;
		this.contractStartDate = contractStartDate;
	}
	
	public long getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(long contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getContractHolderName() {
		return contractHolderName;
	}
	public void setContractHolderName(String contractHolderName) {
		this.contractHolderName = contractHolderName;
	}
	public Date getContractSignedDate() {
		return contractSignedDate;
	}
	public void setContractSignedDate(Date contractSignedDate) {
		this.contractSignedDate = contractSignedDate;
	}
	public boolean isDefaulter() {
		return isDefaulter;
	}
	public void setDefaulter(boolean isDefaulter) {
		this.isDefaulter = isDefaulter;
	}
	public Date getContractStartDate() {
		return contractStartDate;
	}
	public void setContractStartDate(Date contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

}
