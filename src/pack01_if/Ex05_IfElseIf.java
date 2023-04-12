package pack01_if;

public class Ex05_IfElseIf {
	public static void main(String[] args) {
		// if else 문으로는 어떤 조건을 줄 때 ture 인지 false 인지 두가지 경우만 만들 수가 있음 ex)짝수? y(true) else n(false)
		// if (조건식 A)
			// 조건식 A가 TRUE일 때 실행할 코드를 넣어줌..
		//else if(조건식 B){
			//조건식 A가 TRUE가 아니고 조건식 B일 때 실행할 코드를 넣어줌.
		//else if (조건식 C) {
			//조건식 A와 B가 TRUE 가 아니고 조건식 C일 때 실행할 코드를 넣어줌.
		// }else {
			//조건식 A가 TRUE가 아닐 때 실행할 코드를 넣어줌. (규칙 : if문 블럭킹 끝에 붙여서 사용한다.
		//}
		int score = 50; //기존방식으로 score가 90점 이상이면A 80점 이상이면 B , 70점 이상이면 C 그외에는 D가 나오게 처리..

		if(score >= 90 ) {
			System.out.println("A") ;
		}
		if( score >= 80 && score < 90) {
			System.out.println("B");
		}
		if ( score >= 70 && score < 80) {
			System.out.println("C");
		}
		if ( score < 70 ) {
			System.out.println("D");
		}
		
		//if else if 문으로 마무리 해보기
		if(score >= 90 ) {
			System.out.println("A");
		}else if(score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score < 70) {
			System.out.println("D");
		}
		
		
	
	
	}
}
