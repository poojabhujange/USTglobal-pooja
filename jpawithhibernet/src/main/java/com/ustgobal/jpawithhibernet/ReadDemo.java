package com.ustgobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.dto.ProductInfo;

public class ReadDemo {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	ProductInfo productDetail =entityManager.find(ProductInfo.class,101);
//ProductInfo productDetail =entityManager.getReference(ProductInfo.class,103);

        System.out.println("Id ---"+productDetail.getPid());       
	   System.out.println("Name  "+ productDetail.getPname());    
	  System.out.println("Quantity "+productDetail.getQuantity());
	
	
	
	}
	

}
