import java.util.Random;
import java.util.Scanner;

//2023 - 04 - 07 
// 작성자 : 김영문
// 내용 : 과제 피드백
//int i  = 0; => 변수이름은 의미있는것을 쓰면 좋음. 
// 점수 잘못입력 시 다시 반복하여 재입력 받는부분 처리가 좋은것같습니다.
//고생하셨습니다.
public class 김수봉 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = new Random().nextInt(100) + 1; // 랜덤한 숫자 1~100까지 주는 것

		System.out.println(random);

		int i = 0;

		while (true) {

			i++;

			System.out.println("1부터 100사이의 정수를 입력하세요");

			int num = Integer.parseInt(sc.nextLine());

			if (num > random) {

				System.out.println("더 작은 수를 입력하세요!");

				continue;

			} else if (num < random) {

				System.out.println("더 큰 수를 입력하세요!");

				continue;

			} else if (num == random) {

				System.out.println("맞췄습니다." + "시도횟수는" + i + "번");

				break;

			}

			while (true) {

				int scoreKor, scoreEng, scoreMath;

				while (true) {

					System.out.println("국어점수를 입력하세요");

					scoreKor = Integer.parseInt(sc.nextLine());

					if (scoreKor > 100 || scoreKor < 0) {

						System.out.println("0~100까지의 숫자를 재입력해주세요");

						continue;

					}

					while (true) {

						System.out.println("영어점수를 입력하세요");

						scoreEng = Integer.parseInt(sc.nextLine());

						if (scoreEng > 100 || scoreEng < 0) {

							System.out.println("0~100까지의 숫자를 재입력해주세요");

							continue;

						}

						while (true) {

							System.out.println("수학점수를 입력하세요");

							scoreMath = Integer.parseInt(sc.nextLine());

							if (scoreMath > 100 || scoreMath < 0) {

								System.out.println("0~100까지의 숫자를 재입력해주세요");

								continue;

							}

							int sum;

							double avg;

							sum = scoreKor + scoreEng + scoreMath;

							avg = (double) sum / 3;

							System.out.println("총점 : " + sum);

							System.out.println("평균 : " + avg);

							break;

						}

					}

				}

			}
		}
	}
}
