package pack04_while;

public class Ex02_While {
	public static void main(String[] args) {
		//1~10까지의 누적합을 while 문을 통해서 구하고 출력해보기.
		int result = 0;
		int i = 0;
		while(i <= 10) {
			System.out.println(i);
			result += i ;
		}
		
		
		System.out.println(result);
	}
}
