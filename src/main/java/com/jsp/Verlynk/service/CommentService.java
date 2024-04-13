package com.jsp.Verlynk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Verlynk.dto.CommentDto;
import com.jsp.Verlynk.model.Comment;
import com.jsp.Verlynk.repository.CommentRepository;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment addComment(CommentDto commentDto) {
		return null;
        // Implement logic to add a comment
    }

    public List<Comment> getCommentsForPost(Long postId) {
		return null;
        // Implement logic to get comments for a post
    }

    public void deleteComment(Long commentId) {
        // Implement logic to delete a comment
    }
}
