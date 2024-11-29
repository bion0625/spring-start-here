package comment.model;

public class Comment {
	private String author;
	private String text;
	
	public String getAuthor() {
		return author;
	}
	
	public String getText() {
		return text;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return "Comment{text='" + this.text + "', author='" + this.author + "'}";
	}
}
