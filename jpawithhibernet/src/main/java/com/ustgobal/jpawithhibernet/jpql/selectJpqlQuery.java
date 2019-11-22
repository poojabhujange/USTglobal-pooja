package com.ustgobal.jpawithhibernet.jpql;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustgobal.jpawithhibernet.dto.ProductInfo;


 
public class selectJpqlQuery {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManger = entityManagerFactory.createEntityManager();
		String jpql = "from ProductInfo";
		
		Query query = entityManger.createQuery(jpql);
		
		List<ProductInfo>  productInfos = query.getResultList();
		for (ProductInfo productInfo : productInfos ) {
			System.out.println(productInfo.getPid());
			System.out.println(productInfo.getPname());
		    System.out.println(productInfo.getQuantity());
		}
		
		
		
		
		
				
		
	}
	

}
