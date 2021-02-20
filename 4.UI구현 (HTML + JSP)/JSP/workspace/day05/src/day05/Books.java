package day05;

public class Books {
	private String name, writer, publisher;
	
	public Books() {}
	
	public Books(String name, String writer, String publisher) {
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		String date = "{ %s, %s, %s }";
		return String.format(date, name, writer, publisher);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
