package sample;

class Carcolor {
	private String color;
	private String name;
	private String car_color;
	
	public Carcolor() {
		color = "未登録";
		name = "未登録";
	}
	
	public Carcolor(String string, String string2) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.name = string;
		this.color = string;
	}

	public void getColor(String string) {
		// TODO 自動生成されたメソッド・スタブ
		if(searchColor(string)) {
			System.out.print(string);
		}
		
	}

	private boolean searchColor(String string) {
		// TODO 自動生成されたメソッド・スタブ
		boolean col = false;
		if(string.equals("GOLD")) {
			col = true;
		}
		return col;
	}

	public String getName() {
		return this.name;
	}
	
}
