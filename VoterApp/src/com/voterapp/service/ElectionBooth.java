package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public interface ElectionBooth {
	boolean checkEligibility(int age, String locality, int vid) throws InValidVoterException;
}
