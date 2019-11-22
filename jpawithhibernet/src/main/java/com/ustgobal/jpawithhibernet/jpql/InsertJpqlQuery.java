package com.ustgobal.jpawithhibernet.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class InsertJpqlQuery {
	
	public static void main(String[] args) {
		
	String	jpql ="insert in ProductInfo pid=103,pname='laptop',quantity=40";
	
		
		
		
		
		
		EntityManagerFactory  entityManagerfactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		Query query = entityManager.createQuery(jpql);
		
	try {
				//interface                                                 //method
		entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerfactory.createEntityManager();
	    entityTransaction = entityManager.getTransaction();//unit of work it invoking 
		entityTransaction.begin();// When we are perforing a db operation we use transaction
		entityManager.persist(query);
		System.out.println("record save");
	    entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	    
	    entityManager.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
