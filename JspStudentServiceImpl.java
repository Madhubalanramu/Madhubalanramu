package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.ResourceNotFoundException;
import com.example.module.StudentLogin;
import com.example.repository.JspStudentRepo;
import com.example.service.JspStudentService;

@Service
public class JspStudentServiceImpl implements JspStudentService
{

	@Autowired
	JspStudentRepo repo;
	
	@Override
	public StudentLogin saveStudent(StudentLogin s1) 
	{
		
		return repo.save(s1);
	}

	@Override
	public List<StudentLogin> allDetails() 
	{
		
		return repo.findAll();
	}

	@Override
	public StudentLogin getStudentById(int studentId) {
		
		return repo.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("StudentLogin"," studentId", studentId));
	}

	@Override
	public List<StudentLogin> getstudentByCourse(String studentcourse) {
		
		return repo.findbystudentcourse(studentcourse);
	}

	@Override
	public StudentLogin deleteByIdStudent(int studentId) {
		if(repo.existsById(studentId)) 
		{
			StudentLogin s2= repo.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("StudentLogin"," studentId", studentId));
			repo.deleteById(studentId);
			return s2;
		}
		else
		{
			return null;	
		}
		
		 
	}

	@Override
	public StudentLogin updateStudent(StudentLogin s, int studentId) {
		StudentLogin std1= repo.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("StudentLogin"," studentId", studentId));
		std1.setName(s.getName());
		std1.setCourse(s.getCourse());
		std1.setMailId(s.getMailId());
		std1.setPhoneNumber(s.getPhoneNumber());
		return repo.save(std1);
	}

}
