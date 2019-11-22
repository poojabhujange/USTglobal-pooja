
package com.ustgobal.jpawithhibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.jpawithhibernet.onetomany.Pencil;
import com.ustgobal.jpawithhibernet.onetomany.PencilBox;
import com.ustgobal.jpawithhibernet.onetoone.VoterId;

public class TestOnetoMany {
	
	public static void main(String[] args) {
		PencilBox box = new PencilBox();
		box.setBid(20);
		box.setBname("doms");
		
		Pencil pencil = new Pencil();
		pencil.setPid(3);
	    pencil.setColor("black");
	    pencil.setPencilbox(box);
	    
	    Pencil pencil2 = new Pencil();
	    pencil2.setPid(4);
	    
	    pencil2.setColor("red");
	    pencil2.setPencilbox(box);
	    
	    
		
		
		EntityManager entityManager=null;
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction entityTransaction = null;
		try{
		entityManagerFactory =Persistence.createEntityManagerFactory("TestPersistence");
		entityManager=entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();//unit of work it invoking 
			entityTransaction.begin();// When we are perforing a db operation we use transaction
			PencilBox pBox = entityManager.find(PencilBox.class, 10);//it getting the data 
			System.out.println(pBox.getPencil());
			//entityManager.persist(pencil); // use to add the data in the  table ,it add the created object
			//entityManager.persist(pencil2);
			System.out.println("record save");
		    entityTransaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		
	    
	    entityManager.close();

	}

}
