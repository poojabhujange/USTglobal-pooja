package com.ustgobal.Employehibernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustgobal.Employehibernet.dto.EmployeeInfo;

public class DeleteDemo {
	
	
		
		  public static void main(String[] args) {

				EntityManager entityManager=null;
				EntityTransaction entityTransaction=null;
				
				
			try {
						//interface                                                 //method
				EntityManagerFactory entityManagerfactory = Persistence.createEntityManagerFactory("TestPersistence");
				entityManager = entityManagerfactory.createEntityManager();
			    entityTransaction = entityManager.getTransaction();//unit of work it invoking 
				entityTransaction.begin();// When we are perforing a db operation we use transaction
			    EmployeeInfo employeeInfo = entityManager.find(EmployeeInfo.class, 1);
				entityManager.remove(employeeInfo);
				System.out.println("deleted record");
			    entityTransaction.commit();
				} catch (Exception e) {
					e.printStackTrace();
					entityTransaction.rollback();
				}
				
			    
			    entityManager.close();
				
				
			}


	}



