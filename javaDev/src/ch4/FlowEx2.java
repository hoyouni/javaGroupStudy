package ch4;

public class FlowEx2 {
	public static void main(String[] args) {
		int visitCount = 5;
		if(visitCount < 1) {
			System.out.println("처음 오셨네요.");
		} else {
			System.out.println("다시 방문하셨네요.");
		}
		System.out.println("감사합니다.");
	}
}
