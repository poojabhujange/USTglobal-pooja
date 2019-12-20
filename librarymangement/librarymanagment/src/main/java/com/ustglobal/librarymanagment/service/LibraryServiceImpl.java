package com.ustglobal.librarymanagment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagment.dao.LibraryDao;
import com.ustglobal.librarymanagment.dto.Book;
import com.ustglobal.librarymanagment.dto.Order;
import com.ustglobal.librarymanagment.dto.User;

@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryDao dao;

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		return dao.register(user);
	}

	@Override
	public User login(String email, String password) {
		User user= new User();
		if(email == user.getEmail() && password == user.getPassword()){
			System.out.println("login succesfull");
		}else{
		 System.out.println("login is failed");
		}
		
		return dao.login(email, password);
	}

	@Override
	public List<Book> displayAllBook() {
		// TODO Auto-generated method stub
		return dao.displayAllBook();
	}

	@Override
	public Book searchBook(String name) {
		// TODO Auto-generated method stub
		return dao.searchBook(name);
	}

	@Override
	public Book searchBook(int book_id) {
		// TODO Auto-generated method stub
		return dao.searchBook(book_id);
	}

	@Override
	public boolean requestBook(int id, int book_id, String status) {
		// TODO Auto-generated method stub
		return dao.requestBook(id, book_id, status);
	}

	@Override
	public boolean returnBook(int id, int book_id) {
		// TODO Auto-generated method stub
		return dao.returnBook(id, book_id);
	}

	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return dao.addBook(book);
	}

	@Override
	public boolean deletBook(int book_id) {
		// TODO Auto-generated method stub
		return dao.deletBook(book_id);
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		return dao.deleteUser(id);
	}

	@Override
	public List<Order> issueBook() {
		// TODO Auto-generated method stub
		return dao.issueBook();
	}

}
