package com.db.internship.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.db.internship.model.Book;
import com.db.internship.model.User;
import com.db.internship.repository.BookRepository;
import com.db.internship.repository.UserRepository;
import com.db.internship.service.UserService;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private BookRepository bookRepository;

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public User findByUsername( String username ) throws UsernameNotFoundException {
        User u = userRepository.findByUsernameContaining( username );
        return u;
    }

    @PreAuthorize("hasRole('ADMIN')")
    public User findById( Long id ) throws AccessDeniedException {
        User u = userRepository.findOne( id );
        return u;
    }

    @PreAuthorize("hasRole('ADMIN')")
    public List<User> findAll() throws AccessDeniedException {
        List<User> result = userRepository.findAll();
        return result;
    }
    
    @PreAuthorize("hasRole('USER')")
    public List<Book> findAllBooks() throws AccessDeniedException {
        List<Book> result = bookRepository.findAll();
        return result;
    }
}
