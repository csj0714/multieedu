package test.com;

public class Board {
	int num;
	String title;
	static String content;
	String name;
	String date;

	public Board() {
		System.out.println("constructor...");
	}

	public Board(int num, String title, String content, String name, String date) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.name = name;
		this.date = date;
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + ", name=" + name + ", date=" + date
				+ "]";
	}

}
