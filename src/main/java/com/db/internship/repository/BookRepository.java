package com.db.internship.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.db.internship.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

	public Book findByTitle(@Param("title") String title);

	public List<Book> findByAuthorContainingOrderByTitleAsc(@Param("author") String author);


	public List<Book> findByTitleContaining(@Param("title") String title);

	public List<Book> findByGenreContaining(@Param("genre") String genre);
	
	@Query("select b from Book b where b.bookState = com.db.internship.model.BookState.PENDING_FOR_BORROW")
	public List<Book> findByPendingState();
	
	@Query("select b from Book b where b.bookState = com.db.internship.model.BookState.BORROWED")
	public List<Book> findByBorrowedState();
	
	@Query("select b from Book b where b.bookState = com.db.internship.model.BookState.AVAILABLE")
	public List<Book> findByAvailableState();
	
//	@Query("select b from Book b order by numberOfBorrows desc")
//	public List<Book> findBooksOrderByNumberOfBorrowsDesc();
//	
//	@Query("select b from Book b order by numberOfBorrows limit 5")
//	public List<Book> findFirst5ByOrderByNumberOfBorrows();
}