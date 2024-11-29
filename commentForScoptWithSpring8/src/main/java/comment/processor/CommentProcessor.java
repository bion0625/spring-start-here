package comment.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import comment.model.Comment;
import comment.repository.CommentRepository;

@Component
@Scope("prototype")
public class CommentProcessor {
	
	@Autowired
	private CommentRepository commentRepository;
	
	private Comment comment;
	
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	
	public Comment getComment() {
		return comment;
	}
	
	public void processComment(Comment c) {}
	public void validateComment(Comment c) {}
}
