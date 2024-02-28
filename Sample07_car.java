package sample;

class Sample07_car {
	String carModel;
	String owner;
	String color;
	int speed;
	boolean right;
	
	Sample07_car(){
		 carModel = "未登録";
		 owner =  "未登録";
		 color = "未登録";
		 speed = 0;
		 right = false;
	}
	
	public Sample07_car(String string, String string2, String string3, int i, boolean b) {
		// TODO 自動生成されたコンストラクター・スタブ
		carModel = string;
		 owner =  string2;
		 color = string3;
		 speed = i;
		 right = b;
	}

	// メソッド
	void carName() {
		System.out.println("車種名は" + carModel + "です");
	}
	
	void accelerator() {
		speed++;
		System.out.println("スピードが上がった");
	}
	
	void brake() {
		speed--;
		System.out.println("スピードが下がった");
	}
}
