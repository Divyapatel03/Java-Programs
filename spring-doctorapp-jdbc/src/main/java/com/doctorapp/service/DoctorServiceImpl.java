package com.doctorapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.IDoctorRepository;

@Service
public class DoctorServiceImpl implements IDoctorService {
	IDoctorRepository doctorRepository;

	public DoctorServiceImpl(IDoctorRepository doctorRepository) {
		super();
		this.doctorRepository = doctorRepository;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.addDoctor(doctor);
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		doctorRepository.updateDoctor(doctorId, fees);
	}

	@Override
	public Doctor getById(int doctorId) {
		Doctor doctor=doctorRepository.findById(doctorId);
		return doctor;
	}

	@Override
	public void deleteDoctor(int doctorId) {
		doctorRepository.deleteDoctor(doctorId);
	}

	@Override
	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAllDoctors();
	}

	@Override
	public List<Doctor> getBySpecialty(String speciality) {
		List<Doctor> doctors=doctorRepository.findBySpecialty(speciality);
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialtyAndExp(String speciality, int experience) {
		List<Doctor> doctors=doctorRepository.findBySpecialtyAndExp(speciality, experience);
		return doctors;
	}

	@Override
	public List<Doctor> getBySpecialtyAndFees(String speciality, double fees) {
		List<Doctor> doctors=doctorRepository.findBySpecialtyAndFees(speciality, fees);
		return doctors;
	}

}
