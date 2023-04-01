package com.example.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentLogin 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	private String name;
	private String course;
	private String mailId;
	private long phoneNumber;
	
	public StudentLogin(String name, String course, String mailId, long phoneNumber) {
		super();
		this.name = name;
		this.course = course;
		this.mailId = mailId;
		this.phoneNumber = phoneNumber;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "StudentLogin [studentId=" + studentId + ", name=" + name + ", course=" + course + ", mailId=" + mailId
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}
