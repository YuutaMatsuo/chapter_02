
public class Main06 {

	public static void main(String[] args) {
		//基本情報
		String name = "松尾裕太";
		String food = "カレー";
		byte age = 25;
		String sports = "登山";
		
		//テキストを格納する変数
		String msg;
		
		//msgへ文章を代入
		msg = "はじめまして、私の名前は" + name + "です\n";
		msg += "年齢は" + age + "歳です\n";
		msg += "好きな食べ物は" + food + "です\n";
		msg += "最近ハマっている事は" + sports + "です";
		System.out.println(msg);

	}

}
