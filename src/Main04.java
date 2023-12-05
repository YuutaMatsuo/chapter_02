
public class Main04 {
	public static void main(String[] args) {
//		double型の変数に対し、int型のデータを格納
//		このとき型変換が行われint型の160がdouble型へ変換された
		double height = 160;
		System.out.println(height);
		
		//int型の変数に対し、double型のデータを格納（int型としてキャスト）
		int age = (int)30.0;
		
		System.out.println(age);
		
		//double型のデータをint型のデータで割った結果を出力する（演算時に自動型変換される）
		System.out.println(10.0 / 4);
	}
}
