package com.infy.rcc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infy.rcc.model.CreditDetails;
import com.infy.rcc.service.CreditDetailsServiceImpl;

import io.swagger.annotations.Api;

@Api(value = "Credit", description = "REST API for Credit", tags = { "Credit" })
@RequestMapping("/consumercredits")
@RestController
public class CreditDetailsController {

	@Autowired
	private CreditDetailsServiceImpl creditDetailsService;
	@GetMapping(value = "/credit")
	public CreditDetails getCreditDetails() {
		try {
			return creditDetailsService.getCreditDetails();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@RequestMapping(value = "/credit", method = RequestMethod.POST)
	public ResponseEntity<CreditDetails> updateCreditAmount(@RequestBody CreditDetails creditDetails) throws Exception {
		return new ResponseEntity<>(creditDetailsService.getUpdatedBalance(creditDetails), HttpStatus.ACCEPTED);
	}
	
}
