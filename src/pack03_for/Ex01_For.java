package pack03_for;

public class Ex01_For {
	public static void main(String[] args) {
		// 반복문 : for문 ( loop문 , looping , 순환 )
		// 사용 이유 : 기계는 사람보다 반복적인 작업을 잘함. (정확 , 일정)
		// for( 반복에 사용할 변수 초기화; 조건식; 증감식) {
			//반복구간 ( 코드 넣으면 됨 )
		//}
		// 
		//for(① int i = 0; ②i<10; ④i++){
			//③i가 0에서 시작해서 9까지 총 10번 동작하는 반복문
		//
//		for(int i = 0; i < 10 ; ++i) {//무한 루프 : 잘못된 반복문의 예시
//			System.out.println("for문 변수 i의 값:" + i);
//			break;
//		}
		//0부터 시작해서 9사이의 수중 짝수만 콘솔출력되게 반복문을 번형해보기.(많은수정이 필요하지x)
		int result = 0 ; 
		for(int i = 0; i < 9 ; i +=2 ) {//무한 루프 : 잘못된 반복문의 예시
			System.out.println("for문 변수 i의 값:" + i);
			result = i;
		}
		
		System.out.println("i의 최종값 " + result);
	}
}
