package com.doctorapp.repository;

import java.util.List;

import com.doctorapp.model.Doctor;

public interface IDoctorRepository {
	void addDoctor(Doctor doctor);

	void updateDoctor(int doctorId, double fees);

	Doctor findById(int doctorId);

	void deleteDoctor(int doctorId);

	List<Doctor> findAllDoctors();

	List<Doctor> findBySpecialty(String speciality);

	List<Doctor> findBySpecialtyAndExp(String speciality, int experience);

	List<Doctor> findBySpecialtyAndFees(String speciality, double fees);
}
