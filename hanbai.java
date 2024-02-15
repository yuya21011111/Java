package Java学習;

import java.util.Scanner;

public class hanbai {
     Scanner scanner = new Scanner(System.in);
	        System.out.println("配列数を入力してください:");
	        
	        int size = scanner.nextInt();
	        String[] array = new String[size];
	        int strawberry = 320;
	        int montBlanc = 350;
	        int chocoLate = 370;
	        int cheese = 300;
	        int price = 0;
	        
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.next();
	        }
	        
	        for(int i = 0; i < array.length; i+=2) {
	        	String name = array[i];
	        	int count = Integer.parseInt(array[i + 1]);
	        	if(name.equals("いちごケーキ")) {
	        		price += strawberry * count;
	        	}else if(name.equals("モンブラン")) {
	        		price += montBlanc * count;
	        	}else if(name.equals("チョコレートケーキ")) {
	        		price += chocoLate * count;
	        	}
	        }
	        System.out.println(price);
}
