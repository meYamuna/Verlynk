package com.jsp.Verlynk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Verlynk.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    // Define any custom query methods if needed
}
