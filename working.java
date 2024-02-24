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
		 System.out.print("残業時間を入力してください（例: 1時間の場合 1）: ");
		 int overTime = scanner.nextInt();
		 System.out.print("賃金を入力してください（例: 900）:");
		 int wage = scanner.nextInt();
//		 System.out.print("月の出勤日数を入力してください（例: 20）: ");
//		 int days = scanner.nextInt();
		 
		 if(endTime >= startTime) {
			 workingTime = endTime - startTime;
			getMany(workingTime, wage, overTime);
			 
		 }else {
			 workingTime  = dayTime - startTime + endTime;
			getMany(workingTime, wage, overTime);
		 }
		 
//		 System.out.println("あなたの" + days + "日での給料は" + max_salary  + "円です。");
		 
	}

	public static void getMany(int workingTime, int wage, int overTime) {
		// TODO 自動生成されたメソッド・スタブ
		int seconds = 60;
		int minutes = 60;
		int workingSeconds;
		int breakSeconds;
		int workingClock;
		int workingMinutes;
		int breakTime = 45;
		int breakTime2 = 1;
		int salary;
		double  premium = 1.25;
		
		if(workingTime >= 6 && workingTime <= 8) {
			 workingSeconds = (workingTime * minutes) * seconds;
			 breakSeconds = breakTime * seconds;
			 workingSeconds  =  workingSeconds  - breakSeconds;
			 workingClock = (workingSeconds / seconds) / minutes;
			 workingMinutes = (workingSeconds / seconds) % minutes;
			 salary = (workingClock  * wage) + ((wage / minutes) * workingMinutes);
			 salary = (int) (salary + (wage * premium * overTime));
			 System.out.println("あなたの勤務時間は" + workingClock + "時間" + workingMinutes + "分です。");
			 System.out.println("あなたの1日の給料は" + salary + "円です。");
		}else if(workingTime > 8) {
			 workingTime = workingTime - breakTime2;
			 salary = (int) ((workingTime  * wage) + ((wage * overTime) * premium ));
			 System.out.println("あなたの勤務時間は" + workingTime + "時間です。");
			 System.out.println("あなたの1日の給料は" + salary + "円です。");
		}else {
			 salary = (int) ((workingTime  * wage) + ((wage * overTime) * premium ));
			 System.out.println("あなたの勤務時間は" + workingTime + "時間です。");
			 System.out.println("あなたの1日の給料は" + salary + "円です。");
		}
	}

}