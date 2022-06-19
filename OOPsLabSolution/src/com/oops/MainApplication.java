package com.oops;

import java.util.Scanner;

import com.oops.model.Employee;
import com.oops.service.CredentialService;
import com.oops.service.EmployeeCredentialService;

public class MainApplication {
/*
 * This is the driver class.
 */
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Employee employee = new Employee("Harshit", "Choudary");
		//Employee employee = new Employee("Ranganath", "Nallamothu");
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int departmentId = input.nextInt();
		String department = null;

		switch (departmentId) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			throw new RuntimeException("Input should be between 1 and 4. please enter the valid option.");
		}

		CredentialService empService = new EmployeeCredentialService(employee, department);

		empService.showCredentials();
	}

}
