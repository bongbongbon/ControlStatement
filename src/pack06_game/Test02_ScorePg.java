package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor =-1 , eng = -1 , mat = -1;
		System.out.println("국어 점수를 입력해주세요");
		while(kor == -1) {//초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
			kor =Integer.parseInt(sc.nextLine());
			if(kor > 0 && kor <= 100) {
				System.out.println("성적입력완료");
			}else {
				System.out.println("잘못입력 1~100까지만 가능!!");
				kor = -1;
			}
			while(kor == -1) {//초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
				kor =Integer.parseInt(sc.nextLine());
				if(kor > 0 && kor <= 100) {
					System.out.println("성적입력완료");
				}else {
					System.out.println("잘못입력 1~100까지만 가능!!");
					kor = -1;
				}
				while(kor == -1) {//초기에 -1로 값을 초기화 해놨기 때문에 초기화만 된 상태에서는 계속해서 반복
					kor =Integer.parseInt(sc.nextLine());
					if(kor > 0 && kor <= 100) {
						System.out.println("성적입력완료");
					}else {
						System.out.println("잘못입력 1~100까지만 가능!!");
						kor = -1;
					}
			}//while eng
		} //while kor
		
		
	}
}
}
