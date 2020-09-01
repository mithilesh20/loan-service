package com.infy.rcc.service;

import java.text.SimpleDateFormat;
import org.springframework.stereotype.Service;

import com.infy.rcc.model.CreditDetails;

@Service
public class CreditDetailsServiceImpl implements CreditDetailsService {
	
	private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public CreditDetails getCreditDetails() throws Exception {
		return new CreditDetails("NL94 ABNA 0485 9279 34", format.parse ( "2019-12-09" ), 4.5, 60, "Peters", 5, 10000, 8000, 300, 0);
	}

	@Override
	public CreditDetails getUpdatedBalance(CreditDetails creditDetailsUpdated) throws Exception {
		CreditDetails creditDetails = null;
			creditDetails = getCreditDetails();
		creditDetails.setBalance(creditDetails.getBalance() - creditDetailsUpdated.getPartialCreditAmount());
		return creditDetails;
	}
}
