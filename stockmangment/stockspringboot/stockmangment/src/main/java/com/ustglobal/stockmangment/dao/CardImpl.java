package com.ustglobal.stockmangment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ustglobal.stockmangment.dto.Order;
import com.ustglobal.stockmangment.dto.Product_info;

@Repository
public class CardImpl implements CardDAO{
	@Autowired
	private EntityManagerFactory factory;

	public boolean addToCard(int id, int orde_id, double price) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		try{
			Product_info info1 = manger.find(Product_info.class, id);
			info1.getPrice();
			info1.getQuantity();
			Order order = manger.find(Order.class, orde_id);
			manger.persist(info1);
			manger.persist(order);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Order OrderItems() {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		String jpql ="from Order";
		try{
			TypedQuery<Order> query = manger.createQuery(jpql,Order.class);
			Order order1 = query.getSingleResult();
			return order1;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		
	}

}
