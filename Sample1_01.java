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
	}

}
