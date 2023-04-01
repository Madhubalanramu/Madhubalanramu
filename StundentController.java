package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.module.StudentLogin;
import com.example.service.JspStudentService;

@RestController
public class StundentController 
{
	@Autowired
	JspStudentService s3;
	
	@PostMapping("/savestd1")
	ResponseEntity<StudentLogin> savestd1(@RequestBody StudentLogin s1)
	{
		return new ResponseEntity<StudentLogin>(s3.saveStudent(s1),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/Details")
	
		List<StudentLogin>allDetails()
	    {
		return s3.allDetails();
	    }
	
	@GetMapping("/findById/{studentId}")
	
	ResponseEntity<StudentLogin>studentById(@PathVariable int studentId)
	{
		return new ResponseEntity<StudentLogin>(s3.getStudentById(studentId),HttpStatus.OK);
	
	}
	
	@GetMapping("/Details/{studentcourse}")
	List<StudentLogin>studentDetailsBystudentcourse(@PathVariable String studentcourse)
	{
		return s3.getstudentByCourse(studentcourse);
	}
	
	@DeleteMapping("/delete/{studentId}")
	ResponseEntity<StudentLogin>delete(@PathVariable int studentId){
		return new ResponseEntity<StudentLogin>(s3.deleteByIdStudent(studentId),HttpStatus.OK);
	}
	@PutMapping("/update/{StudentId}")
	ResponseEntity<StudentLogin>updatestudent(@RequestBody StudentLogin s, @PathVariable int studentId)
	{
		return new ResponseEntity<StudentLogin> (s3.updateStudent(s, studentId), HttpStatus.OK);
	}
}