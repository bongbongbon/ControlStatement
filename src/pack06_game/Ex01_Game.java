package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Ex01_Game {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		int random = new Random(). nextInt(100)+1; // 랜덤한 숫자 1~100까지 주는 것
		System.out.println(random);
		int i =0;
		while(true) {
			i++;
			System.out.println("1부터 100사이의 정수를 입력하세요");
			int num = Integer.parseInt(sc.nextLine());
			if(num > random) {
				System.out.println("더 작은 수를 입력하세요!");
				continue;
			}else if(num < random ) {
				System.out.println("더 큰 수를 입력하세요!");
				continue;
			}else if(num == random ) {
				System.out.println("맞췄습니다."+ "시도횟수는" + i + "번");
				break;
			}

		
		
		
		
		
		}
	}
}
