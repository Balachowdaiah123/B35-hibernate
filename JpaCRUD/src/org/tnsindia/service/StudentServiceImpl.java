package org.tnsindia.service;

import org.tnsindia.dao.StudentDAO;
import org.tnsindia.dao.StudentDAOImpl;
import org.tnsindia.entities.Student;

public class StudentServiceImpl implements studentService{
	
	private StudentDAO dao;
	
	public StudentServiceImpl() {
		super();
		dao=new StudentDAOImpl();
	}

	@Override
	public void create(Student student) {
		dao.beginTraction();
		dao.addstudent(student);
		dao.commitTranction();
	
		
	}

	@Override
	public void ubdate(Student student) {
		dao.beginTraction();
		dao.ubdatestudent(student);
		dao.commitTranction();
		
	}

	@Override
	public void delete(Student student) {
		dao.beginTraction();
		dao.deletestudent(student);
		dao.commitTranction();
		
	}

	@Override
	public Student retrive(int RoolNO) {
		Student student=dao.getStudentByID(RoolNO);
		return student;
	}

}
