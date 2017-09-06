package com.db.internship.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;


@SuppressWarnings("serial")
@Entity
@Table(name = "borrow")
@Component
public class Borrow implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "book_id", referencedColumnName="id"),
        @JoinColumn(name="book_title", referencedColumnName="title"),
        @JoinColumn(name="book_author", referencedColumnName="author"),
        @JoinColumn(name="book_genre", referencedColumnName="genre")
    })
	private Book book;
	
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name = "user_id", referencedColumnName="id"),
        @JoinColumn(name="user_username", referencedColumnName="username"),
        @JoinColumn(name="user_email", referencedColumnName="email"),
    })
	private User user;
	
	private BorrowState borrowState;
	
	@Column(name = "begin_date")
	private Date beginDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BorrowState getBorrowState() {
		return borrowState;
	}

	public void setBorrowState(BorrowState borrowState) {
		this.borrowState = borrowState;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public Borrow setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
		return this;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Borrow setEndDate(Date endDate) {
		this.endDate = endDate;
		return this;
	}
}