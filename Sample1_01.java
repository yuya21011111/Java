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

         String[][] aniMals = {
            {"モコ","トイプードル","３歳","オス"},
            {"モモ","芝犬","２歳","メス"}
    };
    String anima = "";
    for(int i = 0; i < aniMals.length; i++) {
         anima = "";
        for(int j = 0; j < aniMals[i].length; j++) {	 
            anima =  anima + aniMals[i][j] + "/";
        }
        System.out.println(anima);
    }
    
    // do while文
    int number;
		do {
			number = 1 + (int)(Math.random() * 6.0);
		}while(number != 6);
		System.out.println("6が出たので終了します");
	}

    // if文

    Scanner scanner = new Scanner(System.in);
		 System.out.println("点数を数字で入力してください。");
		 int score = scanner.nextInt();
		 
		 if(score >= 80 && score < 100) {
			 System.out.println("優秀です！");
		 }else if(score >= 60 && score <= 79) {
			 System.out.println("普通です");
		 }else if(score >= 0 && score <= 59) {
			 System.out.println("赤点です！");
		 } else if(score == 100) {
			 System.out.println("満点だったので宿題を免除します。");
		 }else {
			 System.out.print("不正な点数です");
		 }
		 
		 Scanner scanner2 = new Scanner(System.in);
		 int countNumber = 3;
		 int receiveNuber = scanner2.nextInt();
		 while(countNumber < 100) {
			 if(countNumber % 3 == 0) {
				 System.out.println(countNumber);
				 countNumber *= receiveNuber;
			 }
		 }

         // break, continue文
         quesion1:
		 for(int i = 1; i <= 9; i++) {
			 String display = "";
			 for(int j = 1; j <= 9; j++) {
				 if(i * j == 54) {
					 break quesion1;
				 }
				 display = display + i * j + " "; 
			 }
			 System.out.println(display);
		 }
		 
		 quesion2:
			 for(int i = 1; i <= 9; i++) {
				 String display = "";
				 for(int j = 1; j <= 9; j++) {
					 if(i * j == 54) {
						 continue quesion2;
					 }
					 display = display + i * j + " "; 
				 }
				 System.out.println(display);
			 }

             // Switch文

             Scanner scanner = new Scanner(System.in);
             System.out.println("A型：1 B型:2 O型: 3 AB型: 4");
             int number = scanner.nextInt();
             
             switch(number) {
             
             case 1:
                 System.out.println("あなたは几帳面な性格の方ですね？");
                 break;
             case 2:
                 System.out.println("あなたはマイペースな性格の方ですね？");
                 break;
             case 3:
                 System.out.println("あなたは大雑把な性格ですね？");
                 break;
             case 4:
                 System.out.println("あなたは天才肌な方ですね？");
                 break;
            default:
                System.out.println("数字は１〜４で答えてください。");
                break;
             }
}
