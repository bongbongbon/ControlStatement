package pack02_switch;

public class Test01_Switch {
	public static void main(String[] args) {
		int score = 91;
		// switch문을 이용해서 다중 if문으로 해결했던 문제를 해결해보기.
				// 90~100 : A
				// 80~89 : B
				// 70~79 : C
				// 그외에 ( 70미만 : D )
				
		
		switch ( score / 10 ) {
			case 10:
			System.out.println("A");
			break;
			
			case 9: 
			System.out.println("A");
			break;
			
			case 8: 
			System.out.println("B");
			break;
			
			case 7: 
			System.out.println("C");
			break;
			
			case 6: 
			System.out.println("D");
			break;
			
			default: 
			System.out.println("E");
			break;
		}
	}
}
