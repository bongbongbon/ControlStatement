package pack01_if;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		// ex) 사용자가 어떤 동작을 했을 때 게임이 진행되는 것 == 조작
		// 나 vs 컴퓨터 
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그 외에는 시작");
		Scanner sc = new Scanner(System.in);
		//sc nextLine() 이용 -1을 입력하면 종료합니다. 그외에는 시작되게 해보기.
		//-1은 종료가 출력되고 그 외에는 게임시작이 콘솔에 출력되게 조건문을 이용해서 만들어보기.
		String str = sc.nextLine();
		int iNum = Integer.parseInt(str);
		if(iNum == -1) {
			System.out.println("종료 합니다");
		}else {
			System.out.println("게임시작!!");
			System.out.println("사용자가 주사위를 굴릴 차례입니다. (굴리기 Enter)");
			sc.nextLine(); 
			int userNum = (int) (Math.random() * 6) + 1;
			System.out.println("사용자의수 :" + userNum);
			System.out.println("컴퓨터가 주사위를 굴립니다. (진행 ENTER)");
			sc.nextLine();
			int comNum = (int) (Math.random() * 5) + 1;
			System.out.println("컴퓨터의 수 : " + comNum);
			if( userNum > comNum ) {
				System.out.println("사용자의 수 : " + userNum + " 사용자가 이겼습니다.");
			}else if ( userNum < comNum ) { 
				System.out.println("컴퓨터의 수 : "+ comNum + "컴퓨터가 이겼습니다.");
			}else { 
				System.out.println("동점");
			}
		}

		
	}
}
