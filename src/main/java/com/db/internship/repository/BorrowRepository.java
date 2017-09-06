package com.db.internship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.db.internship.model.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long>{
	
}
