package com.hashnet.springboot.rest.simplerest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@GetMapping("/books")
	List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "Interview Tips", "Maidul"));
		books.add(new Book(2, "Failure is the pillar", "Nayala"));
		
		return books;
	}
}
