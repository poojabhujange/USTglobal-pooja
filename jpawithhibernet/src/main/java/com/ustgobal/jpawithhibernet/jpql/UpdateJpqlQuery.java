package com.ustgobal.jpawithhibernet.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class UpdateJpqlQuery {
	
	public static void main(String[] args) {
		
		EntityManager entityManger =null;
		EntityTransaction transaction=null;
		try {
			
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("TestPersistence");
		 entityManger = entityManagerFactory.createEntityManager();
	     transaction = entityManger.getTransaction();
	     transaction.begin();
		
		String jpql = "update ProductInfo set pname='watch' where pid =102";
		Query query = entityManger.createQuery(jpql);
		int result= query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally{
			entityManger.close();
		}
		
	}

}
