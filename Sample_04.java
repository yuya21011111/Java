package Java学習;

public package sample;

import java.util.ArrayList;
import java.util.List;

public class Sample05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

        // 4歳以上でメスの犬のみ抽出するプログラム
		String age = "歳";
		String[][] dogs = {
				{"モコ","4歳","メス"},
				{"ムギ","2歳","オス"},
				{"ブブ","3歳","メス"},
				{"シロ","8歳","オス"},
				{"プチ","3歳","メス"},
				{"ペロ","1歳","メス"},
				{"ルル","14歳","オス"},
				{"モモ","10歳","メス"},
				{"ポチ","6歳","オス"},
				{"エル","2歳","メス"},
		};
		List<String> abultFemaleDogsList = new ArrayList<String>();
		
		for(int i = 0; i < dogs.length; i++) {
			for(int j = 0; j < dogs[i].length; j++) {
				if(Integer.parseInt(dogs[i][1].replace(age, "")) >= 4 && dogs[i][2].equals("メス")) {
					abultFemaleDogsList.add(dogs[i][j]);
				}
			}
		}
		
		for(int x = 0; x < abultFemaleDogsList.size(); x++) {
			System.out.println( abultFemaleDogsList.get(x));
		}
	}

}
 {
    
}
