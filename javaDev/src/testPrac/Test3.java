package testPrac;

public class Test3 {
	public static void main(String[] args) {
		String str = "image/홍길동.jpg";
		String test = str.replaceAll("[^가-힣]", "");
		System.out.println(test);
		
	}
}













