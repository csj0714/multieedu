package test.com;

public class BoardInterImpl implements BoardInter {

	@Override
	public int update(BoardVO vo) {
		System.out.println("update()...");
		System.out.println(vo);
		return 1;
	}

	public BoardVO[] searchList(BoardVO vo) {
		System.out.println(vo);
		BoardVO[] vos = new BoardVO[2];
		BoardVO vo2 = new BoardVO();
		vo2.setNum(22);
		vo2.setTitle("제목22");
		vo2.setContent("내용22");
		vo2.setWdate("2024-01-05");
		vo2.setWriter("작성자");
		vos[0] = vo2;
		System.out.println(vos[0]);

		vo2.setNum(222);
		vo2.setTitle("제목222");
		vo2.setContent("내용222");
		vo2.setWdate("2024-01-06");
		vo2.setWriter("작성자");
		vos[1] = vo2;

		return vos;
	}

	public BoardVO[] searchList2(String searchKey, String searchWord) {
		System.out.println("searchList2()");
		System.out.println(searchKey);
		System.out.println(searchWord);

		if (searchKey.equals("title")) {
			System.out.println("제목으로 검색");

		} else if (searchKey.equals("writer")) {
			System.out.println("작성자로 검색");
		} else {
			System.out.println("내용으로 검색");
		}

		BoardVO[] vos = new BoardVO[2];

		BoardVO vo2 = new BoardVO();
		vo2.setNum(22);
		vo2.setTitle("제목22");
		vo2.setContent("내용22");
		vo2.setWdate("2024-01-05");
		vo2.setWriter("작성자");
		vos[0] = vo2;

		vo2.setNum(222);
		vo2.setTitle("제목222");
		vo2.setContent("내용222");
		vo2.setWdate("2024-01-06");
		vo2.setWriter("작성자");
		vos[1] = vo2;

		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i]);
		}

		return vos;
	}

}
