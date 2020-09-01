package com.infy.rcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infy.rcc.model.ContractDetails;
import com.infy.rcc.service.ContractDetailsServiceImpl;

import io.swagger.annotations.Api;

@RestController
@Api(value = "Contracts", description = "REST API for Contracts", tags = { "Contracts" })
@RequestMapping("/consumercredits")
public class ContractDetailsController {

	@Autowired
	private ContractDetailsServiceImpl contractDetailsService;

	@RequestMapping(value = "/contracts", method = RequestMethod.GET)
	public ContractDetails getContractDetails() {
		
		try {
			return contractDetailsService.getContracts();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
