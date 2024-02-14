package Java学習;

import java.util.Scanner;

public class Jihanki {
    Scanner scanner = new Scanner(System.in);
		 System.out.print("配列のサイズを数字で指定してください：");
	        int size = scanner.nextInt();
	        int[] array = new int[size];
	        int price = 0;

	        System.out.println("硬貨を入れてください:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        
	        for(int j = 0; j < array.length - 1; j++) {
	        	if(array[j] == 1 || array[j] == 5) {
	        		System.out.println("警告：" + array[j] + "円玉は使えません。");
	        	}
	        	else if(array[j] == 10 || array[j] == 50 || array[j] == 100 || array[j] == 500) {
	        		price += array[j];
	        	}
	        	else {
	        		System.out.println(array[j] + "は硬貨として適切な値ではありません。");
	        	}
	        }
	        
	        System.out.println("ただいまの投入金額は" + price + "円です。");
	        
	        int commodity = array[size - 1];
	       
	        if(price >= commodity) {
	        	int change = price - commodity;
	        	System.out.println(change + "円のおつりです。ありがとうございました。");
	        }else {
	        	System.out.println("商品代金が足りていません。");
	        }
}
