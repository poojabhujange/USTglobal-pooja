package com.ustgobal.jpawithhibernet.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustgobal.jpawithhibernet.dto.ProductInfo;

public class SelectNameJpql {
	
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManger = entityManagerFactory.createEntityManager();
		String jpql = "select pname from ProductInfo";
		Query query = entityManger.createQuery(jpql);
		List<String>  productInfos = query.getResultList();
		for(String product:productInfos){
			System.out.println(product);
		}


		
	}

}
