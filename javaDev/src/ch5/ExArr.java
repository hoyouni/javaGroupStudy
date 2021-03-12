package ch5;

public class ExArr {
	public static void main(String[] args) {
		int[][] arr = {
				{5 , 5 , 5 , 5 , 5} , 
				{10 , 10 , 10 , 10 , 10}, 
				{20 , 20 , 20 , 20 , 20}, 
				{30 , 30 , 30 , 30 , 30} 	
		};
		
		int total = 0;
		float average = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("행이 " + ""+i+"" + " 일때");
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print("arr["+i+"]["+j+"] = " + arr[i][j] + "  ");
				total = total + arr[i][j];
			}
			System.out.println();
		}
		
		average = total / (float)(arr.length * arr[0].length);
			
		
		System.out.println("\n" + "total : " + total);
		System.out.println("average : " + average);
	}
}
