package sample;

import java.util.Scanner;

public class Player2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
;		String[] player  = new String[2];
		String[] player2  = new String[2];
		System.out.println("プレイヤー１の名前とグー、チョキ、パーのどれかを入力してね");
		for(int i = 0; i < 2; i++) {
			player[i] = scanner.next();
		}
		System.out.println("プレイヤー２の名前とグー、チョキ、パーのどれかを入力してね");
		for(int i = 0; i < 2; i++) {
			player2[i] = scanner.next();
		}
		
		Make_HandStatus player1_name = new Make_HandStatus(player[0],player[1]);
		Make_HandStatus player2_name = new Make_HandStatus(player2[0],player2[1]);
	}

}
