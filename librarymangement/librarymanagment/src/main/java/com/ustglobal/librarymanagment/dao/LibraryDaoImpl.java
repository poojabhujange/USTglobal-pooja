package com.ustglobal.librarymanagment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagment.dto.Book;
import com.ustglobal.librarymanagment.dto.Order;
import com.ustglobal.librarymanagment.dto.User;

@Repository
public class LibraryDaoImpl implements LibraryDao {

	@Autowired
	private EntityManagerFactory factory;
	
	@Override
	public User register(User user) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		try{
			transaction.begin();
			manger.persist(user);
			transaction.commit();
			return user;
			
         }catch(Exception e){
        	 e.printStackTrace();
        	 return null;
         }
		
	}

	@Override
	public User login(String email, String password) {
		String jpql = "from User where email=:email and password=:password";
		EntityManager manger = factory.createEntityManager();
		TypedQuery<User> query= manger.createQuery(jpql,User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try{
			User bean = query.getSingleResult();
			return bean;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public List<Book> displayAllBook() {
		String jpql ="from Book";
		EntityManager manger = factory.createEntityManager();
		try{
		TypedQuery<Book> query = manger.createQuery(jpql,Book.class);
		List<Book> book = query.getResultList();
		return book;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public Book searchBook(String name) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		Book book = manger.find(Book.class, name);
		transaction.commit();
		return book;
	}

	@Override
	public Book searchBook(int book_id) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		Book book = manger.find(Book.class, book_id);
		transaction.commit();
		return book;
	}

	@Override
	public boolean requestBook(int id, int book_id, String status) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		try{
			Book book = manger.find(Book.class, book_id);
			User user = manger.find(User.class, id);
			Order order = new Order();
			order.setUser(user);
			order.setBook(book);
			order.setStatus(status);
			manger.persist(order);
			transaction.commit();
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean returnBook(int id, int book_id) {
		EntityManager manger = factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		try{
		String jpql="update Order set status=:status where id=:id and book_id=:book_id";
		TypedQuery<Order> query= manger.createQuery(jpql,Order.class);
		query.setParameter("status", "return");
		query.setParameter("id", id);
		query.setParameter("book_id", book_id);
		query.executeUpdate();
		transaction.commit();
		return true;
	}catch(Exception e){
		e.printStackTrace();
		return false;
	}
	}

	@Override
	public Book addBook(Book book) {
		EntityManager manger =  factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		try{
			transaction.begin();
			manger.persist(book);
			transaction.commit();
			return book;
			
         }catch(Exception e){
        	 e.printStackTrace();
        	 return null;
         }
	}

	@Override
	public boolean deletBook(int book_id) {
		EntityManager manger =  factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		Book book = manger.find(Book.class, book_id);
		if(book!=null){
		manger.remove(book);		 
		transaction.commit();
		return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean deleteUser(int id) {
		EntityManager manger =  factory.createEntityManager();
		EntityTransaction transaction = manger.getTransaction();
		transaction.begin();
		User user = manger.find(User.class, id);
		if(user!=null){
		manger.remove(user);		 
		transaction.commit();
		return true;
		}else{
			return false;
		}
	}

	@Override
	public List<Order> issueBook() {
		EntityManager manager=factory.createEntityManager();
		String jpql="from Order where status=:status";
		TypedQuery<Order> query=manager.createQuery(jpql, Order.class);
		query.setParameter("status", "issue");
		List<Order> order=query.getResultList();
		return order;
	}

}
