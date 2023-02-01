package org.tnsindia.dao;

import org.tnsindia.entities.Student;

public interface StudentDAO {
	
	void addstudent(Student student);
	void ubdatestudent(Student student);
	void deletestudent(Student student);
	Student getStudentByID(int RoolNO);
	
	void beginTraction();
	void commitTranction();
	
	
}
