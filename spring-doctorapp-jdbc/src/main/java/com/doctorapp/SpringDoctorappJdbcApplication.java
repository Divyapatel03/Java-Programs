package com.doctorapp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}

	@Autowired
	private IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		Doctor doctor = new Doctor();
		doctor.setDoctorId(2);
		doctor.setDoctorName("Adi");
		doctor.setExperience(12);
		doctor.setFees(5000);
		doctor.setSpeciality("Heart Specialist");
//		start time in format YYYY-MM-DDThh:mm:ss
		doctor.setStartTime(LocalDateTime.parse("2023-06-01T09:38:30"));
		doctor.setEndTime(LocalDateTime.parse("2023-06-01T10:38:30"));

//		doctorService.addDoctor(doctor);
//		doctorService.updateDoctor(1, 230);
//		doctorService.deleteDoctor(2);
		
		System.out.println("------------------------Get all Details--------------------------------------");
		doctorService.getAllDoctors().forEach(System.out::println);
		System.out.println("------------------------Doctor By Id--------------------------------------");
		System.out.println(doctorService.getById(1));

		System.out.println("----------------------Doctor By Specialty-------------------------------------");
		doctorService.getBySpecialty("Heart Specialist").forEach(System.out::println);

		System.out.println("----------------------Doctor By SpecialtyAndExp-------------------------------------");
		doctorService.getBySpecialtyAndExp("Heart Specialist", 12).forEach(System.out::println);

		System.out.println("----------------------Doctor By SpecialtyAndFees-------------------------------------");
		doctorService.getBySpecialtyAndFees("Heart Specialist", 230).forEach(System.out::println);
	}

}
