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
    double tax = 0.08;
    double discount = 0.8;
    
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
        }else if(name.equals("チーズケーキ")) {
            price += cheese  * count;
        }
    }
    price = (int)(price + price * tax);
    if(price >= 1000) {
        price = (int)(price * discount);
    }
    System.out.println("合計金額は" + price + "円です。");
}
