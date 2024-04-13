package com.jsp.Verlynk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Verlynk.dto.CommentDto;
import com.jsp.Verlynk.service.CommentService;

//CommentController.java
@RestController
@RequestMapping("/api/comments")
public class CommentController {
 @Autowired
 private CommentService commentService;

 @PostMapping
 public ResponseEntity<?> addComment(@RequestBody CommentDto commentDto) {
	return null;
     // Implement comment creation logic
 }

 @GetMapping("/post/{postId}")
 public ResponseEntity<?> getCommentsForPost(@PathVariable Long postId) {
	return null;
     // Implement logic to get comments for a specific post
 }

 @DeleteMapping("/{commentId}")
 public ResponseEntity<?> deleteComment(@PathVariable Long commentId) {
	return null;
     // Implement comment deletion logic
 }
}

