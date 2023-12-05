
public class Main02 {

	public static void main(String[] args) {
		System.out.println("こんにちは！");
		System.out.println("\""); //\を入力することで"を文字として出力することができる（エスケープシーケンス）
		
		//今までの方法
		System.out.println("おはようございます");
		System.out.println("いい天気ですね！");
		
		//エスケープシーケンスを用いた方法
		System.out.println("おはようございます\nいい天気ですね！");
		System.out.println("\\1,000"); //エスケープシーケンスを用いることで\を表示させることができる
		
		double a = 10;
		double b = 3;
		double c = a % b;
		System.out.println(c);
		
	}

}
