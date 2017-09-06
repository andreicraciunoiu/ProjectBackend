package com.db.internship.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity 
public class Book implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String author;
	private String genre;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "bookState")
	private BookState bookState;
	private int numberOfBorrows;
	private String imagePath;
	
	public Book() {
		
	}
	public Book(String title, String author, String genre, BookState bookState, int numberOfBorrows, String imagePath) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.bookState = bookState;
		this.numberOfBorrows = numberOfBorrows;
		this.imagePath = imagePath;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Book setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getAuthor() {
		return author;
	}

	public Book setAuthor(String author) {
		this.author = author;
		return this;
	}

	public String getGenre() {
		return genre;
	}

	public Book setGenre(String genre) {
		this.genre = genre;
		return this;
	}

	public String getImagePath() {
		return imagePath;
	}

	public Book setImage(String imagePath) {
		this.imagePath = imagePath;
		return this;
	}

	
	public int getNumberOfBorrows() {
		return numberOfBorrows;
	}

	public Book setNumberOfBorrows(int numberOfBorrows) {
		this.numberOfBorrows = numberOfBorrows;
		return this;
	}

	public BookState getBookState() {
		return bookState;
	}

	public Book setBookState(BookState bookState) {
		this.bookState = bookState;
		return this;
	}
}