package com.spring.bookmydr.ctrl;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bookmydr.entity.Appointment;
import com.spring.bookmydr.entity.Doctor;
import com.spring.bookmydr.service.AppointmentService;
@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	
	@GetMapping("/appointments")
public List<Appointment> getAllAppointments(){
		return appointmentService.getAllAppointments();
	
}
	@GetMapping("/appointments/{appointmentId}")
public Appointment getAppointment(@PathVariable int appointmentId) {
	return appointmentService.getAppointment(appointmentId);
	
}
	@PostMapping("/appointments")
public Appointment addAppointment(@Valid @RequestBody Appointment app) {
	return appointmentService.addAppointment(app);
}
	@DeleteMapping("/appointments/{appointmentId}")
public String deleteAppointment(@PathVariable int appointmentId) {
	return appointmentService.deleteAppointment(appointmentId);
}
	@PutMapping("/appointments/{appointmentId}")
public Appointment updateAppointment(@PathVariable int appointmentId , @RequestBody Appointment app) {
	return appointmentService.updateAppointment(appointmentId,app);
}
	/*@GetMapping("/appointments/{doctorId}")
public List<Appointment> getAppointments(@PathVariable int  doctorId, Doctor doc){
	
	return appointmentService.getAppointments(doc);

}
	@GetMapping("appointments/{date}")
public List<Appointment> getAppointments(@PathVariable LocalDate date){
	
	return appointmentService.getAppointments(date);

}*/

}
