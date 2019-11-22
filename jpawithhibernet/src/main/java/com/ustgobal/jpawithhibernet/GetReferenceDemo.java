package com.ustgobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.dto.ProductInfo;

public class GetReferenceDemo {

	public static void main(String[] args) {
	   EntityTransaction entityTransaction=null;
	   
	   EntityManager entityManager = null;
	   
	   EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	   
	   entityManager=entityManagerFactory.createEntityManager();
	   ProductInfo productinfo = entityManager.getReference(ProductInfo.class, 102);
	   System.out.println(productinfo.getPid());
	   System.out.println(productinfo.getPname());
	   System.out.println(productinfo.getQuantity());
	   entityManager.close();
	   
		
		
		
		

	}

}
