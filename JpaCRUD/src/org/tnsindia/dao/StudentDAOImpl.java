package org.tnsindia.dao;

import javax.persistence.EntityManager;

import org.tnsindia.entities.Student;

public class StudentDAOImpl implements StudentDAO{
	
	private EntityManager em;
	
	
	public StudentDAOImpl() {
		em=JPAUtil.getEntityManager();
	}
	
	

	@Override
	public void addstudent(Student student) {
		em.persist(student);
		
	}

	@Override
	public void ubdatestudent(Student student) {
		em.merge(student);
		
	}

	@Override
	public void deletestudent(Student student) {
		em.remove(student);
		
	}

	@Override
	public Student getStudentByID(int RoolNO) {
		Student student=em.find(Student.class,RoolNO);
		return student;
	}

	@Override
	public void beginTraction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void commitTranction() {
		// TODO Auto-generated method stub
		
	}

}
