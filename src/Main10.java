
public class Main10 {

	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
		System.out.println();
		
		int number1 = new java.util.Random().nextInt(100)+1;
		int number2 = new java.util.Random().nextInt(100)+1;
		
		//number1とnumber2の値を比較して大きい方の値を出力する
		int m = Math.max(number1, number2);
		System.out.println("１つめの値は:" + number1 + "、2つ目の値は:" + number2);
		System.out.println("大きい値は:" + m);
	}

}
