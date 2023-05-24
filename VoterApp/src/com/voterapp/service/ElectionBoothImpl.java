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
		boothImpl = new ElectionBoothImpl();
		boolean flag = true;
		if (boothImpl.checkAge(age) == false) {
			flag = false;
			throw new UnderAgeException("Under Age");
		} else if (boothImpl.checkLocality(locality) == false) {
			flag = false;
			throw new LocalityNotFoundException(locality + " locality not found");
		} else if (boothImpl.checkVoterId(vid) == false) {
			flag = false;
			throw new NoVoterIDException(vid + " not found");
		}
		return flag;

	}

	private boolean checkAge(int age) {
		if (age > 18) {
			return true;
		} else {
			return false;
		}

	}

	private boolean checkLocality(String localityy) {
		for (String locality : localities) {
			if (locality.equals(localityy)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkVoterId(int vid) {
		if (vid >= 1000 && vid <= 9999) {

			return true;
		} else {
			return false;
		}

	}

}
