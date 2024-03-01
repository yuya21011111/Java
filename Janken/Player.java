package sample;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		System.out.println("審判役の名前を入力してね");
		String referee = scanner.next();
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
		
		Referee refereeJudge = new Referee(referee);
		makeHandStatus handStatus = new makeHandStatus(player[0],player[1]);
		makeHandStatus handStatus2 = new makeHandStatus(player2[0],player2[1]);
		
		System.out.println(refereeJudge.name + "「じゃんけん・・・ぽん！！！！！」");
		if(handStatus.handStatus.equals(handStatus2.handStatus) ) {
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの手は" + handStatus.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの手は" + handStatus2.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「結果は・・・」");
			System.out.println(refereeJudge.name + "「あいこ！勝負がつかず！」");
		}else if(handStatus.handStatus.equals("グー") && handStatus2.handStatus.equals("チョキ")) {
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの手は" + handStatus.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの手は" + handStatus2.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「結果は・・・」");
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの勝利！」");
		}else if(handStatus.handStatus.equals("グー") && handStatus2.handStatus.equals("パー")) {
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの手は" + handStatus.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの手は" + handStatus2.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「結果は・・・」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの勝利！」");
		}else if(handStatus.handStatus.equals("チョキ") && handStatus2.handStatus.equals("パー")) {
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの手は" + handStatus.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの手は" + handStatus2.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「結果は・・・」");
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの勝利！」");
		}
		else if(handStatus.handStatus.equals("チョキ") && handStatus2.handStatus.equals("グー")) {
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの手は" + handStatus.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの手は" + handStatus2.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「結果は・・・」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの勝利！」");
		}else if(handStatus.handStatus.equals("パー") && handStatus2.handStatus.equals("グー")) {
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの手は" + handStatus.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの手は" + handStatus2.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「結果は・・・」");
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの勝利！」");
		}else if(handStatus.handStatus.equals("パー") && handStatus2.handStatus.equals("チョキ")) {
			System.out.println(refereeJudge.name + "「" + handStatus.name + "さんの手は" + handStatus.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの手は" + handStatus2.handStatus + "でした！」");
			System.out.println(refereeJudge.name + "「結果は・・・」");
			System.out.println(refereeJudge.name + "「" + handStatus2.name + "さんの勝利！」");
		}
		
		
	}

}
