package com.training.bms.model;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("customer_registration")
public class CustomerRegistration {

	@Id
	@Column("userid")
	private Integer userId;
	
	@NotNull
	@Column("username")
	private String userName;
	private String name;
	@NotNull
	private String password;
	@NotNull
	private String address;
	@NotNull
	private String state;
	@NotNull
	private String country;
	@NotNull
	@Email
	@Column("emailaddress")
	private String emailAddress;
	@Size(max=15)
	private String pan;
	@Column("contactno")
	@Size(max=15)
	private String contactNo;
	@NotNull
	private String accounttype;

	public CustomerRegistration() {

	}

	public CustomerRegistration(Integer userId, String userName, String name, String password, String address,
			String state, String country, String emailAddress, String pan, String contactNo, String accounttype) {
		this.userId = userId;
		this.userName = userName;
		this.name = name;
		this.password = password;
		this.address = address;
		this.state = state;
		this.country = country;
		this.emailAddress = emailAddress;
		this.pan = pan;
		this.contactNo = contactNo;
		this.accounttype = accounttype;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

}
