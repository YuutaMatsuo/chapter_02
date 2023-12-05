
public class Main08 {

	public static void main(String[] args) {
		int a = 100;
		int b = 300;
		
		//引数に渡された２つの値を比較し大きい方の値を返す
		int c = Math.max(a, b);
		//引数に渡された２つの値を比較し、小さい方の値を返す
		int d = Math.min(a, b);
		
		System.out.println("aの中身は" + a);
		System.out.println("bの中身は" + b);
		System.out.println("cの中身は" + c);
		System.out.println("dの中身は" + d);
	}

}
