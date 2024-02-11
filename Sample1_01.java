import java.util.Scanner;

class Sample1_01 {

	public static void main(String[] args) {

        // Hello,Worldの表示
		System.out.println("Hello, World!!");

        int price = 1000;
		// 消費税
		double tax = 1.1;
		// 合計金額
		double fullPrice  = price * tax;
		
		// 合計金額を表示
		System.out.println("支払い金額は" + (int)fullPrice + "円です");

        // 練習問題　１〜５
		
		int ans = 3 + (7 % 4) / 2;
		System.out.println(ans);
		
		int calc = 10;
		int ans2 = ++calc;
		System.out.println(calc);
		System.out.println(ans2);
		
		int calc2 = 10;
		int ans3 = calc2++;
		
		System.out.println(ans3);

        int calc3 = 10;
		int ans4 = calc3 + 1;
		System.out.println(calc3);
		System.out.println(ans4);
		
		System.out.println( "1" + "6");
		
		// 練習問題　6〜９
		
		boolean  ans1 = 5 == 3 + 2;
		System.out.println(ans1);

        boolean answ = 5 >= 3 + 2;
		System.out.println(answ);
		
		boolean answ2 = 5 >= 3 + 2 && 10 % 3 != 1;
		System.out.println(answ2);
		
		boolean answ3 = (5 >= 3 + 2 || 2 + 8 != 9) && !(6 == 2 + 4);
		System.out.println(answ3);

        // データ型の変換
        int a = 100;
		double b = 1.5;
		String c = "7";
		double d = 1.2;
		
		System.out.println(Integer.parseInt((int)(a + b) + c) + d);

        // 配列
		
		String[] names = {"taro","takashi", "naoto","moco"};
		String name = names[3];
		
		System.out.println(name);
		System.out.println(names[3]);

        String[][] animals = {{"芝犬","ミニチュアダックス","トイプードル"},{"シベリアンハスキー","ゴールデンレトリバー","ブルドッグ"},{"秋田犬","土佐犬","猫ミーム"}};
		
		String animal = animals[0][2];
		System.out.println(animal);

        // 1文字に2バイト必要である。

        // for文
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("for文を回す回数を数字で入力してください。");
		 int countNumber = scanner.nextInt();
		 String display = "";
		 
		 for(int i = 0; countNumber > i; i++) {
			 display = display + "*";
		 }
		 System.out.println(display);
		 
         // 掛け算　1 2 3 4 5 6 7.....
		 String display2 = "";
		 for(int i = 1; i <= 9; i++) {
			 display2 = "";
			 for(int j = 1; j <= 9; j++) {
				 display2 = display2 + i * j + " ";
			 }
			 System.out.println(display2);
		 }

         // 足し算 01 02 03 04 05 06 07.....
         String display3 = "";
		 for(int i = 0; i <= 9; i++) {
			 display3 = "";
			 for(int j = 0; j <= 9; j++) {
				 String number = String.valueOf(i);
				 display3 = display3 + number + j + " ";
			 }
			 System.out.println(display3);
		 }
	}

}
