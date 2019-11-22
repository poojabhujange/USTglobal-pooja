package com.ustgobal.jpawithhibernet;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.manytomany.Course;
import com.ustgobal.jpawithhibernet.manytomany.Student;
import com.ustgobal.jpawithhibernet.onetomany.PencilBox;

public class TestManytoMany {
	public static void main(String[] args) {
		
		ArrayList<Course>  a1= new ArrayList<Course>();
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("java");
		
		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("python");
		
		Course c3 = new Course();
		c3.setCid(3);
		c3.setCname("jdbc");
		
		Course c4 = new Course();
		c4.setCid(4);
		c4.setCname("hibernet");
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		a1.add(c4);
		
		
		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("pooja");
		s1.setCourse(a1);
		
		Student s2 = new Student();
		s2.setSid(102);
		s2.setSname("pari");
		s2.setCourse(a1);
	
		
		

		EntityManager entityManager=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction = null;
		try{
		entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();//unit of work it invoking 
			entityTransaction.begin();// When we are perforing a db operation we use transaction
			
			entityManager.persist(s1); // use to add the data in the  table ,it add the created object
			entityManager.persist(s2);
			System.out.println("record save");
		    entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	    
	    entityManager.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
