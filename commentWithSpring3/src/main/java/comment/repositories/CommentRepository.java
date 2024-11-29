package comment.repositories;

import comment.model.Comment;

public interface CommentRepository {
	void storeComment(Comment comment);
}
