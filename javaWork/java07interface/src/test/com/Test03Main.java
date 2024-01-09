package test.com;

public class Test03Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BoardVO 임의의 값을 세팅-세터를 사용할것
		BoardVO vo = new BoardVO();
		System.out.println(vo);

		BoardVO vo2 = new BoardVO(2, "java", "hello", "admin", "2024-01-05");
		System.out.println(vo2);

		BoardVO vo3 = new BoardVO();
		vo3.setNum(3);
		vo3.setTitle("jsp");
		vo3.setContent("web");
		vo3.setWriter("tester");
		vo3.setWdate("2024-01-04");

		System.out.println(vo3);

		// BoardAbs 객체생성 활용하기
		BoardAbs abs = new BoardAbsEx();
		int result = abs.insert(vo3);
		System.out.println("result:" + result);

		// 익명내부클래스 활용하기
		BoardAbs abs2 = new BoardAbs() {
			@Override
			public int insert(BoardVO vo) {
				System.out.println("insert()....2");
				System.out.println(vo);
				return 0;
			}
		};
		result = abs2.insert(vo3);
		System.out.println("result:" + result);

		// BoardInter 객체생성 활용하기
		BoardInter inter = new BoardInterImpl();
		result = inter.update(vo3);
		System.out.println("result:" + result);

		// 익명내부클래스 활용하기

		BoardInter inter2 = new BoardInter() {
			@Override
			public int update(BoardVO vo) {
				System.out.println("update()...2");
				System.out.println(vo);
				return 1;
			}

			@Override
			public BoardVO[] searchList(BoardVO vo) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public BoardVO[] searchList2(String searchKey, String searchWord) {
				// TODO Auto-generated method stub
				return null;
			}

		};
		result = inter2.update(vo3);
		System.out.println("result:" + result);

		BoardVO vo5 = new BoardVO();
		vo5.setWriter("작성자");

		BoardVO[] vos = inter.searchList(vo5);
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i]);
		}
		System.out.println("===========");

		vos = inter.searchList2("title", "제목22");
		for (int i = 0; i < vos.length; i++) {
			System.out.println(vos[i]);
		}
		test(11, 22, 33);
		test(11, 22);

		add("aaa", "bbb", "ccc");
		add("aaa", "bbb");
	}// end main

	private static void test(int... arr) {
		System.out.println("test");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void add(String... arr) {
		System.out.println("add");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}// end class
