package org.tnsindia.service;

import org.tnsindia.entities.Student;

public interface studentService {
	void create(Student student);
	void ubdate(Student student);
	void delete(Student student);
	Student retrive(int RoolNO);
	
	

}
