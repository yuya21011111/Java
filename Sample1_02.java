package Java学習;

import java.util.Scanner;

public class Sample1_02 {
    // メソッドです
    public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scanner = new Scanner(System.in);
	     int[] numbers = new int[2];
	        System.out.println("足し算する数を２つ入力してね:");
	        for (int i = 0; i < 2; i++) {
	        	numbers[i] = scanner.nextInt();
	        }
		int num = sum(numbers[0],numbers[1]);
		System.out.println("合計は" + num + "です。");
	
		}
	
	public static int sum(int i1, int i2) {
		// TODO 自動生成されたメソッド・スタブ
		
		int result = i1 + i2;
		return result;
	}
}
