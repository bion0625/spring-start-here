package comment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import comment.model.Comment;
import comment.proxy.CommentNotificationProxy;
import comment.repositories.CommentRepository;

@Component
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private CommentNotificationProxy commentNotificationProxy;
	
	public void publishComment(Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
