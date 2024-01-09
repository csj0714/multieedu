package test.com;

public class BoardAbsEx extends BoardAbs {

	@Override
	public int insert(BoardVO vo) {
		System.out.println("insert()....");
		System.out.println(vo);
		return 0;
	}

}
