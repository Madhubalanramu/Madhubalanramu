package com.example.service;

import java.util.List;

import com.example.module.StudentLogin;

public interface JspStudentService 
{
	StudentLogin saveStudent(StudentLogin s);	
	
	List<StudentLogin>allDetails();
	
	StudentLogin getStudentById(int studentId);
	
	List<StudentLogin> getstudentByCourse(String studentcourse);
	
	StudentLogin deleteByIdStudent(int studentId);
	
	StudentLogin updateStudent(StudentLogin s, int studentId);
}
