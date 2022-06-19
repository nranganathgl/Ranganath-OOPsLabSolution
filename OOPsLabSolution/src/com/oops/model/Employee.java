package com.oops.model;

public class Employee {

	private String firstName;
	private String lastName;
	private static final String company = "abc";
	private static final String emailDomain = ".com";

	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public static String getCompany() {
		return company;
	}

	public static String getEmaildomain() {
		return emailDomain;
	}

}
