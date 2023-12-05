
public class Main03 {

	public static void main(String[] args) {
//		int型で変数ageを宣言し初期値25を代入
		int age = 25;
		
//		画面に出力
		System.out.println(age + "歳です");
		System.out.println("誕生日を迎えました");
		
//		ageを１増やす処理
//		age = age + 1; //算術演算子を用いた方法
//		age += 1; //代入演算子を用いた方法
		age++; //単項演算子を用いた方法（インクリメント）
		
		
//		画面に出力
		System.out.println(age + "歳になりました");
		
		//ageが+1されず文字列として連結される
//		System.out.println("来年は、" + age + 1 +"歳になります");
		
		//++age　ageに+1をしてから出力処理を行う。
		System.out.println("来年は、" + (++age) + "歳になります。");
		
		//age++ 先に出力処理をしてからageに+1を行う
//		System.out.println("来年は、" + (age++) + "歳になります。");
		
		//ageの中身を確認
		System.out.println("変数ageの中身は:" + age);
		
		// 単項演算子を他の演算子と同時に使う場合の処理の流れ
		// age++とすると、ageの中身をtestに代入してからageに+1を行う
		int test = age++;
		
		System.out.println("変数test:" + test);
		
		System.out.println("変数age:" + age);
	}

}
