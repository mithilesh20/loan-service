package com.infy.rcc.service;

import org.springframework.stereotype.Service;

import com.infy.rcc.model.CreditDetails;


public interface CreditDetailsService {

	public CreditDetails getCreditDetails() throws Exception;
	public CreditDetails getUpdatedBalance(CreditDetails creditDetails) throws Exception; 
	
}
