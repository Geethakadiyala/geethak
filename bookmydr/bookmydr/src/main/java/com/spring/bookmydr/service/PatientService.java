package com.spring.bookmydr.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bookmydr.entity.Appointment;
import com.spring.bookmydr.entity.Doctor;
import com.spring.bookmydr.entity.Patient;
import com.spring.bookmydr.repo.PatientRepository;
@Service
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	public Patient addPatient(Patient bean) {
		return patientRepository.save(bean);
		
	}
	public Patient updatePatientDetails(int patientId,Patient bean) {
		Optional<Patient> bookmydrContainer=patientRepository.findById(patientId);
		if(bookmydrContainer.isPresent()) {
			Patient oldObj=bookmydrContainer.get();
			oldObj.setPatientName(bean.getPatientName());
			oldObj.setAge(bean.getAge());
			oldObj.setAddress(bean.getAddress());
			oldObj.setMobileNo(bean.getMobileNo());
			oldObj.setPassword(bean.getPassword());
			System.out.println("Successfully Updated!!");
			
		return patientRepository.saveAndFlush(oldObj);
		
	}
		System.out.println("No Objects found with this ID");
		return bean;
	}
		
	public String removePatientDetails(int patientId) {
		Optional<Patient> bookmydrContainer=patientRepository.findById(patientId);
		if(bookmydrContainer.isPresent()) {
			Patient oldObj=bookmydrContainer.get();
		patientRepository.delete(oldObj);
		return "Deleted Successfully";
		
		}
			else {
				return "The specified id is  not present in the DB:"+patientId;
			}
		
	}
	
	public Patient getPatient(int patientId) {
		Optional<Patient> bookmydrContainer=patientRepository.findById(patientId);
		if(bookmydrContainer.isPresent()) {
		return bookmydrContainer.get();
		}
		else
			return null;
		
		
	}
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
		
	}
	/*@SuppressWarnings("unchecked")
	public List<Patient> getPatientListByDoctor(Doctor doctor) {
		return (List<Patient>) patientRepository.getById(doctor.getDoctorId());
		
	}
	public List<Patient> getPatientListByDate(LocalDate appdate) {
		return (List<Patient>) patientRepository.getById(appdate.get(null));
		
	}*/

}
