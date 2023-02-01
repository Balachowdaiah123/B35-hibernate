package org.tnsindia.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//the below annotations defions 
@Entity
@Table(name="Student")
public class Student {
	
	@Id
	private int RollNo;
	private String Name;
	
	
	//getters and setters method
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	

}
