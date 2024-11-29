package comment.service;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import comment.aop.ToLog;
import comment.model.Comment;

@Service
public class CommentService {
	
	private Logger logger = Logger.getLogger(CommentService.class.getName());

	@ToLog
	public String publishComment(Comment comment) {
		logger.info("Publishing comment: " + comment.getText());
		return "SUCCESS";
	}
}
