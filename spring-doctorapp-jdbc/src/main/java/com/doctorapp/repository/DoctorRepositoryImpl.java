package com.doctorapp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.doctorapp.model.Doctor;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addDoctor(Doctor doctor) {
		String sql = "insert into doctor(doctorId,doctorName,speciality,experience,fees,startDate,endTime) values(?,?,?,?,?,?,?)";
		Object[] doctorArray = { doctor.getDoctorId(),doctor.getDoctorName(), doctor.getSpeciality(), doctor.getExperience(),
				doctor.getFees(), doctor.getStartTime(), doctor.getEndTime() };
		jdbcTemplate.update(sql, doctorArray);

	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		String sql = "update doctor set fees=? where doctorId=?";
		jdbcTemplate.update(sql, fees, doctorId);
	}

	@Override
	public Doctor findById(int doctorId) {
		String sql = "select * from doctor where doctorId=?";
		return jdbcTemplate.queryForObject(sql, new DoctorMapper(),doctorId);
	}

	@Override
	public void deleteDoctor(int doctorId) {
		String sql = "delete from doctor where doctorId=?";
		jdbcTemplate.update(sql, doctorId);
	}

	@Override
	public List<Doctor> findAllDoctors() {
		String sql = "select * from doctor";
		return jdbcTemplate.query(sql, new DoctorMapper());
	}

	@Override
	public List<Doctor> findBySpecialty(String speciality) {
		String sql = "select * from doctor where speciality=?";
		return jdbcTemplate.query(sql, new DoctorMapper(),speciality);
	}

	@Override
	public List<Doctor> findBySpecialtyAndExp(String speciality, int experience) {
		String sql = "select * from doctor where speciality=? and experience=?";
		return jdbcTemplate.query(sql, new DoctorMapper(),speciality,experience);
	}

	@Override
	public List<Doctor> findBySpecialtyAndFees(String speciality, double fees) {
		String sql = "select * from doctor where speciality=? and fees=?";
		return jdbcTemplate.query(sql, new DoctorMapper(),speciality,fees);
	}

}
