package com.vism.controllers;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vism.beans.Book;
import com.vism.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService service;

	@RequestMapping(value = "/catalog", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody List<Book> getCatalog() {

		List<Book> books = service.getBookDetails();

		return books;
	}

	@RequestMapping(value = "/catalog/{id}", method = RequestMethod.GET, produces = { "application/json",
			"application/xml" })
	public @ResponseBody Book getCatalogBasedOnId(@PathVariable @Valid @NotNull Integer id) {

		return service.getBookDetailsBasedOnId(id);

	}

	@RequestMapping(value = "/catalog", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody boolean updateBook(@RequestBody @Valid Book book) {

		return service.updateBookDetails(book.getId(), book.getName());

	}

	@RequestMapping(value = "/book", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody boolean updateBook(@RequestParam("cost") String cost,
			@RequestParam("printedDate") Date printedDate) {

		return service.updateBookCost(cost);

	}

	@RequestMapping(value = "/bookinput", method = RequestMethod.GET)
	public String bookInput() {
		return "BookInput";
	}

}
