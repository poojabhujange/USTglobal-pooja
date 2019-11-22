package com.ustgobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.dto.ProductInfo;

public class ReattachingDemo {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction =null;
		
		try{
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager =entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction .begin();
			ProductInfo productInfo = entityManager.find(ProductInfo.class, 102);
            entityManager.detach(productInfo); 
			
			System.out.println(entityManager.contains(productInfo));
			
			entityManager.detach(productInfo);
			System.out.println(entityManager.contains(productInfo));
            ProductInfo productInfo2 = entityManager.merge(productInfo);
            
            productInfo2.setPname("car");
			
			
			System.out.println("Update record");
			entityTransaction.commit();
	    	}catch(Exception e){
			e.printStackTrace();
			entityTransaction.rollback();
		}

		
		
	}

}
