package pack06_game;

import java.util.Scanner;

public class Ex02_Game2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int kor,eng,mat,sum;
			System.out.println("국어점수를 입력하세요");
			kor = Integer.parseInt(sc.nextLine());
			if(100 < kor || kor < 0) {
				System.out.println("0~100까지의 숫자로 재입력 바랍니다.");
				continue;	
			}System.out.println("영어점수를 입력하세요");
			eng = Integer.parseInt(sc.nextLine());
			if(100 <  eng|| eng < 0) {
				continue;
			}System.out.println("수학점수를 입력하세요");
			mat = Integer.parseInt(sc.nextLine());
			if(100 < mat|| mat < 0) {	
				continue;
			}
			sum = kor+eng+mat;
			System.out.println("총점" + sum);
			double avg = (double)sum/3;
			System.out.println("평균:" + avg);
			break;
		}
		
//		while(true) {
//
//			int kor,eng,mat,sum;
//
//			System.out.println("국어점수를 입력하세요 : ");
//			kor = Integer.parseInt(sc.nextLine());
//			System.out.println("영어점수를 입력하세요 : ");
//			eng = Integer.parseInt(sc.nextLine());
//			System.out.println("수학점수를 입력하세요 : ");
//			mat = Integer.parseInt(sc.nextLine());
//			sum=kor+eng+mat;
//			System.out.println("총점 : " + sum);
//			double avg= (double)sum/3;
//			System.out.println("평균 : " + avg);
//
//		}

		
		
	}
}
