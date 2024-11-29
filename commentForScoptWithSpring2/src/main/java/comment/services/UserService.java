package comment.services;

import org.springframework.stereotype.Service;

import comment.repository.CommentRepository;

@Service
public class UserService {
	private final CommentRepository commentRepository;
	
	public UserService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}
	
	public CommentRepository getCommentRepository() {
		return commentRepository;
	}

}
