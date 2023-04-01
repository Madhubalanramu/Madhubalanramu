package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.module.StudentLogin;

public interface JspStudentRepo extends JpaRepository<StudentLogin, Integer>
{
	@Query(value = "select * from Student_Login where studentcourse=?",nativeQuery=true)
	List<StudentLogin> findbystudentcourse(String studentcourse);
}
