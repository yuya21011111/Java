package sample;

import java.util.Scanner;

public class Sample06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int workingTime;
		int dayTime = 24;
		int salary;
		int max_salary;
	
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("勤務開始時刻を入力してください（例: 9）: ");
		 int startTime = scanner.nextInt();
		 System.out.print("勤務終了時刻を入力してください（例: 17）: ");
		 int endTime = scanner.nextInt();
		 System.out.print("賃金を入力してください（例: 900）: ");
		 int wage = scanner.nextInt();
		 System.out.print("月の出勤日数を入力してください（例: 20）: ");
		 int days = scanner.nextInt();
		 
		 if(endTime >= startTime) {
			 workingTime = endTime - startTime;
			 salary = getMany(workingTime);
			 
		 }else {
			 workingTime  = dayTime - startTime + endTime;
			 salary = getMany(workingTime);
		 }
		 
		 System.out.println("あなたの勤務時間は" + workingTime + "時間です。");
//		 System.out.println("あなたの1日の給料は" + salary + "円です。");
//		 System.out.println("あなたの" + days + "日での給料は" + max_salary  + "円です。");
		 
	}

	public static int getMany(int workingTime) {
		// TODO 自動生成されたメソッド・スタブ
		int seconds = 60;
		int minutes = 60;
		int workingSeconds;
		int breakSeconds;
		int workingTime2;
		int breakTime = 45;
		if(workingTime >= 6 && workingTime <= 8) {
			 workingSeconds = (workingTime * minutes) * seconds;
			 breakSeconds = breakTime * seconds;
			 workingSeconds  =  workingSeconds  - breakSeconds;
			 workingTime2 = (workingSeconds / seconds) % minutes;
			 System.out.println(workingSeconds);
			 System.out.println(workingTime2);
		}
		return 0;
	}

}
