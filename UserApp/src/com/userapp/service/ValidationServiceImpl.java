package com.userapp.service;

import com.userapp.exception.NameExistException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {
	String[] usernames = { "Divya", "Sonu" };

	@Override
	public boolean validateUserName(String username) throws NameExistException {
		for (String name : usernames) {
			if (username.equals(name)) {
				throw new NameExistException();
			}
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if (password.length() < 6)
			throw new TooShortException();
		else if (password.length() > 15)
			throw new TooLongException();
		else
			return true;
	}

}
