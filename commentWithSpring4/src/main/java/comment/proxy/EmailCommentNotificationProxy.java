package comment.proxy;

import org.springframework.stereotype.Component;

import comment.model.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment: " + comment.getText());
	}
}
