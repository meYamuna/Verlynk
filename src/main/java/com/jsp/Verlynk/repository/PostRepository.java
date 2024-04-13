package com.jsp.Verlynk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.Verlynk.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // Define any custom query methods if needed
}
