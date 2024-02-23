package sample;

import java.util.Scanner;

public class Sample06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int workingTime;
		int dayTime = 24;
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("勤務開始時刻を入力してください（例: 9）: ");
		 int startTime = scanner.nextInt();
		 System.out.print("勤務終了時刻を入力してください（例: 17）: ");
		 int endTime = scanner.nextInt();
		 
		 if(endTime >= startTime) {
			 workingTime = endTime - startTime;
		 }else {
			 workingTime  = dayTime - startTime + endTime;
		 }
		 
		 System.out.println("あなたの勤務時間は" + workingTime + "時間です。");
		 
	}

}
