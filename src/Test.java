
public class Test {

	public static void main(String[] args) {
		// メニューを設定
		String menu1 = "１．ラーメン";
		String menu2 = "２．うどん";
		String menu3 = "３．そば";
		String menu4 = "11．フォー";

		// カート
		int price = 0;
		int order = 1;
		
		//繰り返し処理スタート
		while (order == 1) {
			System.out.println("メニュー番号を選んでください");

			// 注文を行うプログラム
			System.out.println("いらっしゃいませ");
			System.out.println("注文番号を選んでください");
			// メニューを表示
			System.out.println("---------------");
			System.out.println(menu1);
			System.out.println(menu2);
			System.out.println(menu3);
			System.out.println(menu4);
			System.out.println("---------------");

			// メニューを選ぶ

			int ans = new java.util.Scanner(System.in).nextInt();
//		String input = new java.util.Scanner(System.in).nextLine();
//		int ans = Integer.parseInt(input);

			if (ans == 1) {
				System.out.println("ラーメンの金額は500円です");
				System.out.println("個数を選んでください");
				int n = new java.util.Scanner(System.in).nextInt();
				price += 500 * n;
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				order = new java.util.Scanner(System.in).nextInt();
			} else if (ans == 2) {
				System.out.println("うどんの金額は600円です");
				System.out.println("個数を選んでください");
				int n = new java.util.Scanner(System.in).nextInt();
				price += 600 * n;
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				order = new java.util.Scanner(System.in).nextInt();
			} else if (ans == 3) {
				System.out.println("そばの金額は350円です");
				System.out.println("個数を選んでください");
				int n = new java.util.Scanner(System.in).nextInt();
				price += 350 * n;
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				order = new java.util.Scanner(System.in).nextInt();
			} else if (ans == 11) {
				System.out.println("フォーの金額は200円です");
				System.out.println("個数を選んでください");
				int n = new java.util.Scanner(System.in).nextInt();
				price += 200 * n;
				System.out.println("ご注文を続けますか？");
				System.out.println("1.注文を続ける 2.注文を終る");
				order = new java.util.Scanner(System.in).nextInt();
			} else {
				System.out.println("エラー");
			}
		}

		System.out.println("お会計は" + price + "円です");

	}

}
