package com.ustglobal.stockmangment.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ustglobal.stockmangment.dto.Product_info;



@Repository
public class StockImpl implements StockDAO {
	
	@PersistenceUnit
	private EntityManagerFactory factory;
	

	@Override
	public boolean addproduct(Product_info info) {
		
		EntityManager manger =  factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		try{
			transaction.begin();
			manger.persist(info);
			transaction.commit();
			return true;
			
         }catch(Exception e){
        	 e.printStackTrace();
        	 return false;
         }
	}

		

	@Override
	public boolean updateproduct(Product_info info) {
	
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try{
		transaction.begin();
		Product_info info1 = manager.find(Product_info.class, info.getId());
		info1.setName(info.getName());
		info1.setCompany(info.getCompany());
		info1.setCategory(info.getCategory());
		info1.setPrice(info.getPrice());
		info1.setQuantity(info.getQuantity());
		transaction.commit();
	     return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
        }
 	
		
	}

	@Override
	public Product_info getByname(String name) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try{
			transaction.begin();
			String jpql="from Product_info where name=:name";
			TypedQuery<Product_info> query= manager.createQuery(jpql,Product_info.class);
			query.setParameter("name", name);
			 Product_info info = query.getSingleResult();
			 return info;
		}catch(Exception e){
		  e.printStackTrace();
		  return null;
		}
	}

	@Override
	public Product_info getByCompany(String company) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try{
			transaction.begin();
			String jpql="from Product_info where company=:company";
			TypedQuery<Product_info> query= manager.createQuery(jpql,Product_info.class);
			query.setParameter("company", company);
			 Product_info info = query.getSingleResult();
			 return info;
		}catch(Exception e){
		  e.printStackTrace();
		  return null;
		}
		
	
	}

	@Override
	public Product_info getByCatogarty(String category) {
		
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try{
			transaction.begin();
			String jpql="from Product_info where category=:category";
			TypedQuery<Product_info> query= manager.createQuery(jpql,Product_info.class);
			query.setParameter("category", category);
			Product_info  info = query.getSingleResult();
			return info;
			
		}catch(Exception e){
		  e.printStackTrace();
		  return null;
		}
		
	
	}



	@Override
	public List<Product_info> displayall() {
		String jpql ="from Product_info";
		EntityManager manger = factory.createEntityManager();
		try{
		TypedQuery<Product_info> query = manger.createQuery(jpql,Product_info.class);
		List<Product_info> info1 = query.getResultList();
		return info1;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}
	
	}


