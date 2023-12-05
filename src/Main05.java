
public class Main05 {

	public static void main(String[] args) {
		float f = 3;
		double d = f;
		
		System.out.println(f);
		System.out.println(d);
		
//		char型からString型またはString型からchar型への自動型変換はエラーになる
//		char name = '松';
//		String text = (String)name;
		
//		String name ="松";
//		char text = name;
		
//		System.out.println(text);
		
		//long型でaを宣言し、10憶を代入
		long a = 1000000000L;
		//aを出力
		System.out.println(a);
		//double型のbにint型のaを代入
		double b = a;
		System.out.println(b);
		System.out.println((int)b);
		
		

	}

}
