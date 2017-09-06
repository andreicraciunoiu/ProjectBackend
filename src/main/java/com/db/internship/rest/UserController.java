package com.db.internship.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.db.internship.model.Book;
import com.db.internship.model.BookState;
import com.db.internship.model.Borrow;
import com.db.internship.model.User;
import com.db.internship.repository.BookRepository;
import com.db.internship.repository.BorrowRepository;
import com.db.internship.repository.UserRepository;
import com.db.internship.service.UserService;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import static org.springframework.web.bind.annotation.RequestMethod.PUT;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BorrowRepository borrowRepository;

	@Enumerated(EnumType.STRING)
	private BookState bookState;

	// READ
	// METHODS*************************************************************************************************
	@RequestMapping(method = GET, value = "/users/{userId}")
	@PreAuthorize("hasRole('ADMIN')")
	public User loadById(@PathVariable Long userId) {
		return this.userService.findById(userId);
	}

	@RequestMapping(method = GET, value = "/users")
	@PreAuthorize("hasRole('ADMIN')")
	public List<User> loadAll() {
		return this.userRepository.findAll();
	}

	@RequestMapping(method = GET, value = "/users/getUserByEmail")
	@PreAuthorize("hasRole('ADMIN')")
	public User findUserByEmail(String email) {
		return userRepository.findByEmailAddress(email);
	}

	@RequestMapping(method = GET, value = "/users/getUserByFullName/")
	@PreAuthorize("hasRole('ADMIN')")
	public List<User> findUserByFullName(@PathVariable String firstName, @PathVariable String lastName) {
		return userRepository.findByFirstNameContainingAndLastNameContaining(firstName, lastName);
	}

	@RequestMapping(method = GET, value = "/users/getUserByUsername/{username}")
	@PreAuthorize("hasRole('ADMIN')")
	public User findUserByUsername(@PathVariable String username) {
		return userRepository.findByUsernameContaining(username);
	}

	@RequestMapping(method = GET, value = "/books/getBookByTitle/{title}")
	@PreAuthorize("hasRole('USER')")
	public List<Book> findBookByTytle(@PathVariable String title) {
		return bookRepository.findByTitleContaining(title);
	}

	@RequestMapping(method = GET, value = "/books/getBookByAuthor/{author}")
	@PreAuthorize("hasRole('USER')")
	public List<Book> findBookByAuthor(@PathVariable String author) {
		return bookRepository.findByAuthorContainingOrderByTitleAsc(author);
	}

	@RequestMapping(method = GET, value = "/books/getBookByGenre/{genre}")
	@PreAuthorize("hasRole('USER')")
	public List<Book> findBookByGenre(@PathVariable String genre) {
		return bookRepository.findByGenreContaining(genre);
	}

	@RequestMapping(method = GET, value = "/books")
	@PreAuthorize("hasRole('USER')")
	public List<Book> findBooks() {
		return bookRepository.findAll();
	}

	@RequestMapping(method = GET, value = "/books/{bookId}")
	@PreAuthorize("hasRole('USER')")
	public Book findBook(@PathVariable Long bookId) {
		return bookRepository.findOne(bookId);
	}

	@RequestMapping(method = GET, value = "/books/getByState/{bookState}")
	@PreAuthorize("hasRole('USER')")
	public List<Book> findAvailableBooks(@PathVariable BookState bookState) {
		return bookRepository.findByAvailableState();
	}

	@RequestMapping(method = GET, value = "/borrows")
	@PreAuthorize("hasRole('USER')")
	public List<Borrow> findBorrows() {
		return borrowRepository.findAll();
	}

	@RequestMapping(method = GET, value = "/borrows/borrowId")
	@PreAuthorize("hasRole('USER')")
	public Borrow findBorrow(Long borrowId) {
		return borrowRepository.findOne(borrowId);
	}

	@RequestMapping("/whoami")
	@PreAuthorize("hasRole('USER')")
	public User user() {
		return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	@RequestMapping("/who")
	public User admin() {
		return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

	// CREATE
	// METHODS**********************************************************************************
	@RequestMapping(method = POST, value = "/books")
	@PreAuthorize("hasRole('ADMIN')")
	public void createBook(@RequestBody Book book) {
		bookRepository.save(book);
	}

	@RequestMapping(method = POST, value = "/users")
	@PreAuthorize("hasRole('ADMIN')")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}

	@RequestMapping(method = POST, value = "/borrows")
	@PreAuthorize("hasRole('USER')")
	public void createUser(@RequestBody Borrow borrow) {
		borrowRepository.save(borrow);
	}

	// DELETE
	// METHODS************************************************************************************
	@RequestMapping(method = DELETE, value = "/users/{userId}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteUser(@PathVariable long id) {
		userRepository.delete(id);
	}

	@RequestMapping(method = DELETE, value = "/books/{bookId}")
	@PreAuthorize("hasRole('ADMIN')")
	public void deleteBook(@PathVariable long id) {
		bookRepository.delete(id);
	}

	// UPDATE
	// METHODS*************************************************************************************
	@RequestMapping(method = PUT, value = "/books/{bookId}")
	@PreAuthorize("hasRole('ADMIN')")
	public void updateBook(@RequestBody long id, @RequestBody Book book) {
		Book existingBook = bookRepository.findOne(id);
		existingBook.setTitle(book.getTitle()).setAuthor(book.getAuthor()).setGenre(book.getGenre())
				.setBookState(book.getBookState()).setImage(book.getImagePath());
		bookRepository.save(existingBook);
	}

	@RequestMapping(method = PUT, value = "/users/{userId}")
	@PreAuthorize("hasRole('ADMIN')")
	public void updateBook(@RequestBody long id, @RequestBody User user) {
		User existingUser = userRepository.findOne(id);
		existingUser.setUsername(user.getUsername()).setFirstName(user.getFirstName()).setLastName(user.getLastName())
				.setEmailAddress(user.getEmailAddress());
		userRepository.save(existingUser);
	}

	// UPLOAD
	// FILE***********************************************************************************************

}
