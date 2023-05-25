package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements ElectionBooth {
	String[] localities = { "bangalore", "navsari" };

	ElectionBoothImpl boothImpl = null;

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws InValidVoterException {
		if (checkAge(age) && checkLocality(locality) && checkVoterId(vid)) {
			System.out.println("Successfully registered");
		}
		return false; 
	}

	private boolean checkAge(int age) throws UnderAgeException{
		if (age > 18) {
			return true;
		} else {
			throw new UnderAgeException(age+" Under age");
		}

	}

	private boolean checkLocality(String localityy) throws LocalityNotFoundException{
		for (String locality : localities) {
			if (locality.equals(localityy)) {
				return true;
			}
			else
				throw new  LocalityNotFoundException("Locality not found");
		}
		return false;
	}

	private boolean checkVoterId(int vid) throws NoVoterIDException{
		if (vid >= 1000 && vid <= 9999) {

			return true;
		} else {
			throw new NoVoterIDException("invalid id");
		}

	}

}
