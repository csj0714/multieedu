package test.com;

public class Test03method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Store s = new Store();

		System.out.printf("커피 %d개 구입가능 잔돈 %d원\n", s.getCount(1100), s.change(1100));

		String[] list = s.getProductList(3);
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

		MemberProcess mp = new MemberProcess();
		Member[] ms = mp.listMember();
		for (int i = 0; i < ms.length; i++) {
			System.out.println(ms[i]);
		}

		BoardProcess bp = new BoardProcess();
		Board[] bs = bp.listBoard();
		for (int i = 0; i < bs.length; i++) {
			System.out.println(bs[i]);
		}

	}

}
