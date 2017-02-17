package com.uwaysz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "id")
	private Long id;
	
	@Column(name = "title") private String title;
	@Column(name = "series") private String series;
	@Column(name = "author") private String author;
	
	protected Book() {
		
	}
	
	public Book(String name, String series, String author) {
		this.title = name;
		this.series = series;
		this.author = author;
	}
	
	public String getName() {
		return title;
	}
	
	public String getSeries() {
		return series;
	}
	
	public String getAuthor() {
		return author;
	}
}
