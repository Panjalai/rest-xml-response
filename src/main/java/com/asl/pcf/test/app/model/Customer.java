package com.asl.pcf.test.app.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	@XmlElement
	private int custNo;
	
	@XmlElement
    private String name;
	
    @XmlElement
    private String country;
    
    @XmlAttribute
    private String zipCode;
 
    public Customer() {
 
    }
 
    public Customer(int custNumber, String name, String country, String zipCode) {
        this.custNo = custNumber;
        this.name = name;
        this.country = country;
        this.zipCode = zipCode;
    }
 
    public int getCustNo() {
        return custNo;
    }
 
    public void setCustNo(int custNo) {
        this.custNo = custNo;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getCountry() {
        return country;
    }
 
    public void setCountry(String country) {
        this.country = country;
    }

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
    

}
