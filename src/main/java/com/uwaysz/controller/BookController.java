package com.uwaysz.controller;

import java.util.List;
import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uwaysz.model.Book;
import com.uwaysz.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository repository;
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public Callable<List<Book>> findBook(@RequestParam(value="name") String name) throws InterruptedException {
		return () -> { return repository.findByName('%'+name+'%'); };
    }

}
