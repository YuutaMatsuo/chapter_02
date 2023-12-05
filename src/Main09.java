
public class Main09 {

	public static void main(String[] args) {
		//キャスト演算子が使えない例(String型をint型へ）
//		int a = (int)"100";
		
		//文字列を数値に変換する
		String age = "100";
		int a = Integer.parseInt(age);
		System.out.println(a);
		
		
	}

}
