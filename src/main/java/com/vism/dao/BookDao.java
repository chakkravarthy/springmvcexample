package com.vism.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.vism.beans.Book;

@Component
public class BookDao {

	public String saveBookData(Book book) {

		return "success";

	}

	public List<Book> getBookData() {

		Book b = new Book();
		b.setId(20);
		b.setName("How are you book");
		
		Book b1 = new Book();
		b1.setId(25);
		b1.setName("How are you book1");
		
		Book b2 = new Book();
		b2.setId(30);
		b2.setName("How are you book2");
		
		List<Book> books = new ArrayList<Book>();
		books.add(b);
		books.add(b2);
		books.add(b1);
		
		return books;
		
		

	}

}
