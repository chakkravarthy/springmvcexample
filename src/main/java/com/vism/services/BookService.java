package com.vism.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vism.beans.Book;
import com.vism.dao.BookDao;

@Component
public class BookService {

	@Autowired
	private BookDao dao;

	public List<Book> getBookDetails() {

		return dao.getBookData();
	}

	public Book getBookDetailsBasedOnId(Integer id) {

		Book bToBeSent = null;

		for (Book b : dao.getBookData()) {
			if (b.getId().equals(id)) {
				bToBeSent = b;
				break;
			}
		}

		return bToBeSent;

	}

	public boolean updateBookDetails(Integer id, String name) {

		boolean status = false;

		for (Book b : dao.getBookData()) {
			if (b.getId().equals(id)) {
				b.setName(name);
				break;
			}
		}

		status = true;

		return status;
	}

	public boolean updateBookCost(String cost) {
		// TODO Auto-generated method stub
		return false;
	}

}
