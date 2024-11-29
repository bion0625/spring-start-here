package comment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import comment.repository.CommentRespository;

@Service
public class UserService {
	@Autowired
	private CommentRespository commentRespository;

	public CommentRespository getCommentRespository() {
		return commentRespository;
	}
}
