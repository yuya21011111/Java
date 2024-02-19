package sample;

import java.util.Random;
import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int hand_number = 0;
		while(hand_number != 4) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("じゃんけんを始めるよ！番号を入力してね： 1:グー 2:チョキ 3: パー 4: ゲームを終わる");
		    hand_number = scanner.nextInt();
			Random random = new Random();
			int randomNumberCPU = random.nextInt(3) + 1;
			 
			 if(hand_number == randomNumberCPU) {
				 System.out.println("あいこです");
			 }
			 else if(hand_number == 1 && randomNumberCPU == 2) {
				 System.out.println("あなたの勝利です！");
			 }
			 else if(hand_number == 1 && randomNumberCPU == 3) {
				 System.out.println("あなたの敗北です！");
			 }
			 else if(hand_number == 2 && randomNumberCPU == 1) {
				 System.out.println("あなたの敗北です！");
			 }
			 else if(hand_number == 2 && randomNumberCPU == 3) {
				 System.out.println("あなたの勝利です！");
			 }
			 else if(hand_number == 3 && randomNumberCPU == 1) {
				 System.out.println("あなたの勝利です！");
			 }
			 else if(hand_number == 3 && randomNumberCPU == 2) {
				 System.out.println("あなたの敗北です！");
			 }
			 
		}
	}

}
