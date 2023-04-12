package pack01_if;

public class TestIF {
	public static void main(String[] args) {
		//int형 변수  code를 만든다. code의 값이 1이면 남자 2이면 여자 3이면 남자 4이면 여자 출력 그 외의 값은 오류 출력
		
		//int random =(int) (Math.random() * 6) + 1 ; <= 해당 코드가 실행되고나면 1~6까지의 수가 랜덤하게 할당이됨.
		//조건문을 이용해서 random의 숫자가 몇인지를 출력하기.
		//ex) random(1) : 1이 출력되었습니다......~6까지
		//int random = (int) (Math.random() * 6) + 1;
		//System.out.println(random + "이 출력되었습니다.");//(x)
		
		
		// 여기는 진짜 심심하면 해보기.
		//3. 주사위 게임만들기
		//  (int) (Math.random() * 6 ) +1 <= 코드를 이용해서 첫번째로 나온숫자는 나의 숫자(사용자)
		//두번째로 나온 숫자는 컴퓨터의 숫자 입니다.
				
		// 누구의 주사위 수가 큰지 배틀하는 게임을 만드세요. 
		// 나 : 1 , 컴퓨터 : 6 => 결과 : 컴퓨터가 이겼습니다.
		
		//1번
		int code = 1;
		
		if(code == 1 || code == 3 ){
			System.out.println("남자");
		}else if(code == 2 || code ==4) {
			System.out.println("여자");
		}else {
			System.out.println("오류");
		}
		
		//2번
		int random =(int) (Math.random() * 6) + 1 ;
		if(random == 1) {
			System.out.println("1이 출력되었습니다.");
		}else if (random == 2 ) {
			System.out.println("2가 출력되었습니다.");		
		}else if (random == 3 ) {
			System.out.println("3이 출력되었습니다.");
		}else if (random == 4 ) {
			System.out.println("4가 출력되었습니다.");
		}else if (random == 5 ) {
			System.out.println("5가 출력되었습니다.");
		}else if (random == 6) {
			System.out.println("6이 출력되었습니다.");
		}
		
		//3번
		int ranMe = (int) (Math.random() * 6) + 1, ranCo = (int) (Math.random() * 6) + 1;
		
		if(ranMe > ranCo) {
			System.out.println("나 : " + ranMe + " , 컴퓨터 : " + ranCo + " 사용자가 이겼습니다.");
		}else if(ranCo > ranMe) {
			System.out.println("컴퓨터 : " + ranCo +" , 나 : " + ranMe + " 컴퓨터가 이겼습니다.");
		}else {
			System.out.println("동점.");
		} 
		
		}
	}

