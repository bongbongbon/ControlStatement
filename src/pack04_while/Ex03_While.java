package pack04_while;

import java.util.Scanner;

public class Ex03_While {
	public static void main(String[] args) {
		//while문을 이용해서 1~100까지의 루프를 만든다.
		//조건문을 이용해서 홀수일때는 홀수(숫자) , 짝수일 떄는 짝수(숫자)가 콘솔창에 출력되게 코딩해보기.
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
		while( num <100) {
			num++;
			if(num % 2 == 1) {
				System.out.println("홀수(" + num + ")");
			}else{
				
			}
			}
		}
	}

