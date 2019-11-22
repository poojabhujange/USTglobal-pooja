package com.ustgobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.dto.ProductInfo;

public class InsertDemo {
	public static void main(String[] args) {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setPid(102);
		productInfo.setPname("PEN");
		productInfo.setQuantity(40);
		
		EntityManagerFactory  entityManagerfactory=null;
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		
	try {
				//interface                                                 //method
		entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerfactory.createEntityManager();
	    entityTransaction = entityManager.getTransaction();//unit of work it invoking 
		entityTransaction.begin();// When we are perforing a db operation we use transaction
		entityManager.persist(productInfo);
		System.out.println("record save");
	    entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	    
	    entityManager.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
