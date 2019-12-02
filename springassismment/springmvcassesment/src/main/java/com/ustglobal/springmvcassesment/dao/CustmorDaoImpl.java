package com.ustglobal.springmvcassesment.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ustglobal.springmvcassesment.dto.ProductBean;
import com.ustglobal.springmvcassesment.dto.Custmar;


@Repository
public class CustmorDaoImpl implements CustmorDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public Custmar login(int id, String password) {
		String jpql="from Custmar where id=:id and password=:pass";
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery(jpql);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		try {
			Custmar bean=(Custmar) query.getSingleResult();
			return bean;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int register(Custmar bean) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();

			return bean.getId();
		}
		catch (Exception e) {
			e.printStackTrace();

			return -1;
		}
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		Custmar bean=manager.find(Custmar.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	public ProductBean searchProduct(int id) {
		
		EntityManager manager=factory.createEntityManager();
		return manager.find(ProductBean.class, id);
	}

	@Override
	public Custmar products(int id) {
		EntityManager manager=factory.createEntityManager();
		return manager.find(Custmar.class, id);
	}

//	@Override
//	public Order orderProduct(Order order) {
//		try {
//			EntityManager manager=factory.createEntityManager();
//			manager.getTransaction().begin();
//			manager.persist(order);
//			manager.getTransaction().commit();
//			manager.close();
//			return order;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return order;
//	}
//		
		
		
	}


