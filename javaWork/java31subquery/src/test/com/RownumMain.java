package test.com;

public class RownumMain {

	public static void main(String[] args) {
		System.out.println("rownum + subquery");

		
		//주어진 pageBlock에 따라
		//각페이지별(cpage) 시작행(startRow),끝행(endRow)을 출력하는 프로그램을 작성하세요
		//예: selectAll(1, 5) >> 	1,	5
		//예: selectAll(2, 5) >> 	6,	10
		//예: selectAll(1,10) >> 	1,	10
		//예: selectAll(2,10) >> 	11,	20
		
		selectAll(1,5);
		selectAll(2,5);
		selectAll(1,10);
		selectAll(2,10);
		
	}//end main

	private static void selectAll(int cpage, int pageBlock) {
		System.out.println("cpage:"+cpage+",pageBlock:"+pageBlock);
		int startRow = (cpage-1)*pageBlock + 1;
		int endRow = startRow + pageBlock -1;
		System.out.println(startRow+","+ endRow);
	}

}//end class
