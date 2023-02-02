package org.tnsindia.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager em=factory.createEntityManager();
        em.getTransaction().begin();
        
        // create one emp
        
        Employee e=new Employee();
        e.setId(1);
        e.setName("bala");
        e.setSalary(30003.4);
        em.persist(e);
        
        //create second emp2
        
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("Teja");
        e1.setSalary(50000.4);
        em.persist(e1);
        
       //create one manager
        
        Manager m=new Manager();
        m.setId(3);
        m.setDeptname("It");
        m.setName("Manoj");
        m.setSalary(76896);
        em.persist(m);
        em.getTransaction().commit();
        System.out.println("Data is added in the database");
        em.close();
        factory.close();
        
	}

}
