package sample;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String[] player  = new String[2];
		String[] player2  = new String[2];
		System.out.println("プレイヤー１の名前とグー、チョキ、パーのどれかを入力してね");
		for(int i = 0; i < 2; i++) {
			player[i] = scanner.next();
		}
		System.out.println("プレイヤー２の名前とグー、チョキ、パーのどれかを入力してね");
		for(int i = 0; i < 2; i++) {
			player2[i] = scanner.next();
		}
		
		makeHandStatus handStatus = new makeHandStatus(player[0],player[1]);
		makeHandStatus handStatus2 = new makeHandStatus(player2[0],player2[1]);
		
		System.out.println("じゃんけん・・・ぽん！！！！！");
		if(handStatus.handStatus.equals(handStatus2.handStatus) ) {
			System.out.println(handStatus.name + ":" + handStatus.handStatus);
			System.out.println(handStatus2.name + ":" + handStatus2.handStatus);
			System.out.println("結果は・・・");
			System.out.println("あいこ！勝負がつかず！");
		}else if(handStatus.handStatus.equals("グー") && handStatus2.handStatus.equals("チョキ")) {
			System.out.println(handStatus.name + ":" + handStatus.handStatus);
			System.out.println(handStatus2.name + ":" + handStatus2.handStatus);
			System.out.println("結果は・・・");
			System.out.println(handStatus.name + "さんの勝利！");
		}else if(handStatus.handStatus.equals("グー") && handStatus2.handStatus.equals("パー")) {
			System.out.println(handStatus.name + ":" + handStatus.handStatus);
			System.out.println(handStatus2.name + ":" + handStatus2.handStatus);
			System.out.println("結果は・・・");
			System.out.println(handStatus2.name + "さんの勝利！");
		}else if(handStatus.handStatus.equals("チョキ") && handStatus2.handStatus.equals("パー")) {
			System.out.println(handStatus.name + ":" + handStatus.handStatus);
			System.out.println(handStatus2.name + ":" + handStatus2.handStatus);
			System.out.println("結果は・・・");
			System.out.println(handStatus.name + "さんの勝利！");
		}
		else if(handStatus.handStatus.equals("チョキ") && handStatus2.handStatus.equals("グー")) {
			System.out.println(handStatus.name + ":" + handStatus.handStatus);
			System.out.println(handStatus2.name + ":" + handStatus2.handStatus);
			System.out.println("結果は・・・");
			System.out.println(handStatus2.name + "さんの勝利！");
		}else if(handStatus.handStatus.equals("パー") && handStatus2.handStatus.equals("グー")) {
			System.out.println(handStatus.name + ":" + handStatus.handStatus);
			System.out.println(handStatus2.name + ":" + handStatus2.handStatus);
			System.out.println("結果は・・・");
			System.out.println(handStatus.name + "さんの勝利！");
		}else if(handStatus.handStatus.equals("パー") && handStatus2.handStatus.equals("チョキ")) {
			System.out.println(handStatus.name + ":" + handStatus.handStatus);
			System.out.println(handStatus2.name + ":" + handStatus2.handStatus);
			System.out.println("結果は・・・");
			System.out.println(handStatus2.name + "さんの勝利！");
		}
		
		
	}

}
