package com.ustglobal.librarymanagment.dao;

import java.util.List;

import com.ustglobal.librarymanagment.dto.Book;
import com.ustglobal.librarymanagment.dto.Order;
import com.ustglobal.librarymanagment.dto.User;

public interface LibraryDao {
	
    public User register(User user);
	public User login(String email,String password);

	
	public List<Book> displayAllBook();
	public Book searchBook(String name);
	public Book searchBook(int book_id);

	public boolean requestBook(int id, int book_id,String status);
	public boolean returnBook(int id,int book_id);
	
	public Book addBook(Book book);
	public boolean deletBook(int book_id);
	public boolean deleteUser(int id);
	public List<Order> issueBook();
	
	

}
