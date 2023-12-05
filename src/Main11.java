
public class Main11 {

	public static void main(String[] args) {
		//名前の入力を受け付ける
		System.out.println("---名前を入力してください---");
		String name = new java.util.Scanner(System.in).nextLine();
		
		//○○さん、こんにちは！と出力をする
		System.out.println(name + "さん、こんにちは！");
		
		//1~100までの数値を１つ入力してくださいと出力する
		System.out.println("1-100までの数値を１つ入力してください");
		//数値（整数値）の入力を受け付ける(変数宣言をして入寮数値を確保する）
		int number1 = new java.util.Scanner(System.in).nextInt();
		//1-100までの数値の範囲で、乱数を１つ生成する
		int number2 = new java.util.Random().nextInt(100) +1;
		
		//入力数値と生成乱数を分かりやすく出力する
		System.out.println("入力された数値は:" + number1 + "です");
		System.out.println("コンピュータが生成した数値は:" + number2 + "です");
		
		//入力数値と生成乱数を比較して、大きい方の数値を出力する
		int i = Math.max(number1, number2);
		System.out.println("大きい数値は:" + i + "です");
	}

}
