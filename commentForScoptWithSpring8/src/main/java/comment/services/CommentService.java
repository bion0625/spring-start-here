package comment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import comment.model.Comment;
import comment.processor.CommentProcessor;
import comment.repository.CommentRepository;

@Service
public class CommentService {
	
	@Autowired
	private ApplicationContext context;
	
	public void send(Comment c) {
		CommentProcessor p = context.getBean(CommentProcessor.class);
		p.setComment(c);
		p.processComment(c);
		p.validateComment(c);
	}
}
