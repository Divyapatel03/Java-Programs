package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {
	void addDoctor(Doctor doctor);

	void updateDoctor(int doctorId, double fees);

	Doctor getById(int doctorId);

	void deleteDoctor(int doctorId);

	List<Doctor> getAllDoctors();

	List<Doctor> getBySpecialty(String speciality) throws DoctorNotFoundException;

	List<Doctor> getBySpecialtyAndExp(String speciality, int experience) throws DoctorNotFoundException;

	List<Doctor> getBySpecialtyAndFees(String speciality, double fees) throws DoctorNotFoundException;
}