package pack03_for;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04_forFor {
	public static void main(String[] args) {
		System.out.println("A");
		System.out.print("B");
		System.out.println("C");
		System.out.println("D");
		// 제어문은 무한하게 중첩이 가능하다. (순서x)
		// 1~10까지 반복하게 for문 만들어보기.
		
//		for(int i = 1; i <= 10; i++ ) {
//			System.out.println("i"+ i );
//				for(int j = 1; j <= 10; j++) {
//					System.out.println("j"+ j);
//			}
//			//for문을 하나 더 넣을 수 있을까?
//			
//			//for문 하나 더 넣어보기 (중첩)
//			
//			//총 몇회에 동작을 할까?
//		}
		
		// 구구단을 출력해보기. print와 println을 적절히 사용하여.
				// 2x1 = 2
				// 2x2 = 4
				// .
				// .
				// 9x9 = 81
				
				// 출력예시 . 2 x 1 = 2 , 2x 2 = 4 .............
				//                 3 x 1 = 3 , 3x 2 = 6...............
				//
//		for(int i = 2; i <=9 ; i++ ) {
//			System.out.println();
//			for(int i1 = 1; i1 <=9; i1++) {
//				
//				System.out.print(i + " x " + i1 + " = " + i*i1+ "	");
//			}
//			System.out.println();
//		}
		//다중 for문을 이용해서 별찍기
		//
		Scanner sc =new Scanner(System.in);
		int userNum = Integer.parseInt(sc.nextLine());
		System.out.println(userNum);
		
		if(userNum < 2 ) {
				System.out.println("잘못된 숫자");
		}else {
			for(int i = 2; i <= userNum ; i++) {
				 System.out.println( "i + 값" + i);
				 
				 if(i % 2 == 1) {
				 for(int j =1 ; j <= 9 ; j++) {
					 System.out.print(i + "x" + j + "=" + i * j + " ");
				 	}
				 }
				 System.out.println();
			}
		}
		
	}
	}

