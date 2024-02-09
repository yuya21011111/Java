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
	}

}
