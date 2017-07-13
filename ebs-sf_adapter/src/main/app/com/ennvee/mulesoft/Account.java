package com.ennvee.mulesoft;


public class Account implements java.io.Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String	accountName;
public String getAccountName() {
	return accountName;
}
public void setAccountName(String accountName) {
	this.accountName = accountName;
}
public String getName1() {
	return name1;
}
public void setName1(String name1) {
	this.name1 = name1;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getBillingStreet() {
	return billingStreet;
}
public void setBillingStreet(String billingStreet) {
	this.billingStreet = billingStreet;
}
public String getBillingCity() {
	return billingCity;
}
public void setBillingCity(String billingCity) {
	this.billingCity = billingCity;
}
public String getBillingPostalCode() {
	return billingPostalCode;
}
public void setBillingPostalCode(String billingPostalCode) {
	this.billingPostalCode = billingPostalCode;
}
public String getBillingState() {
	return billingState;
}
public void setBillingState(String billingState) {
	this.billingState = billingState;
}
private String	name1;
private String	country;
private String	billingStreet;
private String	billingCity;
private String	billingPostalCode;
private String	billingState;

}
