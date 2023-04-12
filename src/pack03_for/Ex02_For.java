package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		//제어문은 무한하게 중첩이 가능하다.
		// 짝수만 출력
		// 짝수 ? %2 == 0
		
		//1. 1부터 10까지의 누적합을 구하시오
		int result = 0;
		for(int i = 0 ; i <= 10 ; ++i) {
			result = result+ i;
			//짝수
//			if( i%2==0 ) {
//				System.out.println("짝수" + i);
//				}else if (i%2 ==1) {
//					System.out.println("홀수"+i );
//				}
			}
	
	System.out.println(result);
	
		}
	}

