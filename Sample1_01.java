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
	}

}
