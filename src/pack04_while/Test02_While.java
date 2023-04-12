package pack04_while;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			i++;
			int j = 1;
			while (j < i) {
				System.out.print("★");
				j++;
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		if(num < 2 ) {
			System.out.println("오류");
		}

	
	
	
	
	}
			
}
