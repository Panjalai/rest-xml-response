package com.asl.pcf.test.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.asl.pcf.test.app.model.Customer;

@RestController
public class RestXmlController {
	
@GetMapping(path = "/getcustinfoXML")
public Customer getCustomerInfoXML() {

		Customer loCustomer = new Customer();
		loCustomer.setCustNo(1000);
		loCustomer.setName("Royal Bank of Scotland");
		loCustomer.setCountry("United Kingdom");
		loCustomer.setZipCode("670672");
		return loCustomer;
}//eof getCustomerInfoXML

@RequestMapping(value = "/getcustinfoJSON", method = RequestMethod.GET, produces = "application/json")
public Customer getCustomerInfoJSON() {

	Customer loCustomer = new Customer();
	loCustomer.setCustNo(1000);
	loCustomer.setName("Royal Bank of Scotland");
	loCustomer.setCountry("United Kingdom");
	loCustomer.setZipCode("670672");
	return loCustomer;
}//eof getCustomerInfoJSON

}//eof class
