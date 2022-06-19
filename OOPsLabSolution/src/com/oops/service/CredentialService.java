package com.oops.service;

public interface CredentialService {

	//This method is for generating random password.
	public abstract String generatePassword();
	//This method is for generating email address.
	public abstract String generateEmailAddress();
	//This method is for showing email address and password.
	public abstract void showCredentials();
	
}
