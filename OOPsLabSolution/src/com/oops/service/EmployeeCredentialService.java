package com.oops.service;

import java.util.Random;

import com.oops.model.Employee;

/*
 * This class contains the logic to generate email address and password for an employee
 */
public class EmployeeCredentialService implements CredentialService {

	private Employee employee;
	private String department;
	private static final String chars = "abcdefghijklmnopqrstuvwxyz";
	private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final int NUMS = 999;
	private static final String SPEC = "@#$%^&+=";

	public EmployeeCredentialService(Employee employee, String department) {

		this.employee = employee;
		this.department = department;
	}

	//This method is for generating random password.
	@Override
	public String generatePassword() {
		// System.out.println("\nInside generatePassword...");
		int index;
		String password = "";
		Random rnd = new Random();

		password += rnd.nextInt(NUMS);

		index = rnd.nextInt(CHARS.length());
		password += CHARS.charAt(index);

		index = rnd.nextInt(SPEC.length());
		password += SPEC.charAt(index);

		index = rnd.nextInt(chars.length());
		password += chars.charAt(index);

		index = rnd.nextInt(CHARS.length());
		password += CHARS.charAt(index);
		index = rnd.nextInt(CHARS.length());
		password += CHARS.charAt(index);

		return password;
	}

	//This method is for generating email address based on the Employee object.
	@Override
	public String generateEmailAddress() {
		// System.out.println("\nInside generateEmailAddress...");

		String emailAddress = employee.getFirstName().toLowerCase() + employee.getLastName().toLowerCase() + "@"
				+ this.department + "." + Employee.getCompany() + Employee.getEmaildomain();
		return emailAddress;
	}

	//This method is for showing email address and password.
	@Override
	public void showCredentials() {

		// System.out.println("\nInside showCredentials...");
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email ---> " + generateEmailAddress());
		System.out.println("Password ---> " + generatePassword());
	}

}
