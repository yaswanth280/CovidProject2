package com.covid.exception;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

	@Value(value = "${data.exception.message1}")
	private String message1;
	@ExceptionHandler(value = PatientNotFoundException.class)
	public ResponseEntity patientNotFoundException(PatientNotFoundException ex) {
		return new ResponseEntity(message1, HttpStatus.NOT_FOUND);
	}
	
    @Value(value = "${data.exception.message2}")
    private String message2;
    
    @ExceptionHandler(value = HospitalNotFoundException.class)
    public ResponseEntity HospitalNotFoundException(HospitalNotFoundException ex) {
    	return new ResponseEntity(message1, HttpStatus.NOT_FOUND);
    }
}