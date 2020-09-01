package com.infy.rcc.service;


import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

import com.infy.rcc.model.ContractDetails;

@Service
public class ContractDetailsServiceImpl implements ContractDetailsService {

	private final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	@Override
	public ContractDetails getContracts() throws Exception {
		return new ContractDetails(61185461, "PersoonlijkeLening", "Peters", false, format.parse ( "2019-04-09" ),format.parse ( "2019-05-09" ));
	}

}
