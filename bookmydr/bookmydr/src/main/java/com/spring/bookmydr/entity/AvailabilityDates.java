package com.spring.bookmydr.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
@Entity
public class AvailabilityDates {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int availabilityId;
	@OneToOne
private Doctor doctor;
	@NotNull(message="This field is mandatory")
	private LocalDate fromDate;
	@NotNull(message="This field is mandatory")
	private LocalDate endDate;
public AvailabilityDates() {
	super();
	// TODO Auto-generated constructor stub
}
public AvailabilityDates(int availabilityId, Doctor doctor, LocalDate fromDate, LocalDate endDate) {
	super();
	this.availabilityId = availabilityId;
	this.doctor = doctor;
	this.fromDate = fromDate;
	this.endDate = endDate;
}
public int getAvailabilityId() {
	return availabilityId;
}
public void setAvailabilityId(int availabilityId) {
	this.availabilityId = availabilityId;
}
public Doctor getDoctor() {
	return doctor;
}
public void setDoctor(Doctor doctor) {
	this.doctor = doctor;
}
public LocalDate getFromDate() {
	return fromDate;
}
public void setFromDate(LocalDate fromDate) {
	this.fromDate = fromDate;
}
public LocalDate getEndDate() {
	return endDate;
}
public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
}
@Override
public String toString() {
	return "AvailabilityDates [availabilityId=" + availabilityId + ", doctor=" + doctor + ", fromDate=" + fromDate
			+ ", endDate=" + endDate + "]";
}

}
