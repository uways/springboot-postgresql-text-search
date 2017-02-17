package com.uwaysz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uwaysz.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	@Query("SELECT b.title FROM Book b WHERE LOWER(b.author) LIKE :name OR LOWER(b.title) LIKE :name")
	List<Book> findByName(@Param("name") String name);

}
