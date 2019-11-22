package com.ustgobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.dto.ProductInfo;

public class UpdateDemo {
  public static void main(String[] args) {

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		
	try {
				//interface                                                 //method
		EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerfactory.createEntityManager();
	    entityTransaction = entityManager.getTransaction();//unit of work it invoking 
		entityTransaction.begin();// When we are perforing a db operation we use transaction
		//ProductInfo productInfo = entityManager.find(ProductInfo.class, 101);
		
		ProductInfo productInfo = entityManager.getReference(ProductInfo.class, 101);

		productInfo.setPname("car");
		
		

		System.out.println("update save");
	    entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	    
	    entityManager.close();
		
		

		
		
		
	}

}
	
	
	
	

