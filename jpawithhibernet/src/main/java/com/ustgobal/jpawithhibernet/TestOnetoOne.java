package com.ustgobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.onetoone.Person;
import com.ustgobal.jpawithhibernet.onetoone.VoterId;

public class TestOnetoOne {
	public static void main(String[] args) {
	
		VoterId vc = new VoterId();
		vc.setVid(20);
		vc.setVname("pooja");
		
		Person pn = new Person();
		pn.setPid(2);
        pn.setPname("pooja");
        pn.setVotrid(vc);
		
		EntityManager entityManager=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction = null;
		try{
		entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();//unit of work it invoking 
			entityTransaction.begin();// When we are perforing a db operation we use transaction
			VoterId vCard = entityManager.find(VoterId.class, 10);//it getting the data 
			System.out.println(vCard.getPerson().getPid());
			entityManager.persist(pn);// use to add the data in the  table ,it add the created object
			
			System.out.println("record save");
		    entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	    
	    entityManager.close();
		
	
		
	}

}
