package comment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comment.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	CommentRepository commentRepository;
	
	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}
	
	public CommentRepository getCommentRepository() {
		return commentRepository;
	}
}
