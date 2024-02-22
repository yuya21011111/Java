package Java学習;

public class sampl1_03 {
    package sample;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Sample04 {

    // BigDEcimal
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BigDecimal  a1 = new BigDecimal("0.2");
		BigDecimal  b1 = new BigDecimal("83");
		BigDecimal  c1 = new BigDecimal("10.6");
		BigDecimal  d1 = new BigDecimal("3");
 		BigDecimal result = (a1.multiply(b1)).subtract(c1);
 		BigDecimal result2 = (a1.multiply(b1)).subtract(c1.divide(d1,4,RoundingMode.HALF_UP));
		System.out.println(result);
		System.out.println(result2);

	}

}

}
