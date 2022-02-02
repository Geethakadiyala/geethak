package com.spring.bookmydr.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int appointmentId;
	@OneToOne
	@JoinColumn(name="Patient_Tb")
	private Patient patient;
	@OneToOne
	@JoinColumn(name="Doctor_Tb")
	private Doctor doctor;
	private LocalDate appointmentDate;
	@NotNull(message="Status cannot be null")
	private String appointmentStatus;
	private String remark;
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Appointment(int appointmentId, Patient patient, Doctor doctor, LocalDate appointmentDate,
			String appointmentStatus, String remark) {
		super();
		this.appointmentId = appointmentId;
		this.patient = patient;
		this.doctor = doctor;
		this.appointmentDate = appointmentDate;
		this.appointmentStatus = appointmentStatus;
		this.remark = remark;
	}
	public int getappointmentId() {
		return appointmentId;
	}
	public void setappointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentStatus() {
		return appointmentStatus;
	}
	public void setAppointmentStatus(String appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", patient=" + patient + ", doctor=" + doctor
				+ ", appointmentDate=" + appointmentDate + ", appointmentStatus=" + appointmentStatus + ", remark="
				+ remark + "]";
	}

}
