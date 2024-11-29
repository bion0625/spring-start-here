package comment.proxy;

import comment.model.Comment;

public interface CommentNotificationProxy {
	void sendComment(Comment comment);
}
