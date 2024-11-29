package comment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comment.repository.CommentRepository;

@Service
public class UserService {
	@Autowired
	private CommentRepository commentRespository;

	public CommentRepository getCommentRespository() {
		return commentRespository;
	}
}
