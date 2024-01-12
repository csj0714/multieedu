package test.com;

public enum Test02_season {

	// ()안에 설명추가가능
	SPRING("3월~5월"), SUMMER("6월~8월"), FALL("9월~11월"), WINTER("12월~2월");

	// 위치조심 : 열거형상수 밑에 선언할것.
	private String season;

	Test02_season() {
		// 생성자
	}

	Test02_season(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return season;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

}