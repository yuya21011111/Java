package sample;

public class Sample07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sample07_car mocoCar = new Sample07_car("ホンダ","ムチ","RED",100,true);
		Sample07_car kazuCar = new Sample07_car();
		mocoCar.carName();
		kazuCar.carName();
		
//		mocoCar.accelerator();
		mocoCar.brake();
		System.out.println(mocoCar.speed);
		System.out.println(kazuCar.speed);
	}

}
