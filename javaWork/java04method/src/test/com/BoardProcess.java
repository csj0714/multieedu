package test.com;

public class BoardProcess {
	Board[] listBoard() {
		Board[] list = new Board[4];
		list[0] = new Board(1, "title1", "content1", "kim1", "2024-01-03");
		list[1] = new Board(2, "title2", "content2", "kim2", "2024-01-03");
		list[2] = new Board(3, "title3", "content3", "kim3", "2024-01-03");
		list[3] = new Board(4, "title4", "content4", "kim4", "2024-01-03");
		return list;
	}
}
