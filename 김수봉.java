import java.util.Random;
import java.util.Scanner;

//2023 - 04 - 07 
// �ۼ��� : �迵��
// ���� : ���� �ǵ��
//int i  = 0; => �����̸��� �ǹ��ִ°��� ���� ����. 
// ���� �߸��Է� �� �ٽ� �ݺ��Ͽ� ���Է� �޴ºκ� ó���� �����Ͱ����ϴ�.
//����ϼ̽��ϴ�.
public class ����� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int random = new Random().nextInt(100) + 1; // ������ ���� 1~100���� �ִ� ��

		System.out.println(random);

		int i = 0;

		while (true) {

			i++;

			System.out.println("1���� 100������ ������ �Է��ϼ���");

			int num = Integer.parseInt(sc.nextLine());

			if (num > random) {

				System.out.println("�� ���� ���� �Է��ϼ���!");

				continue;

			} else if (num < random) {

				System.out.println("�� ū ���� �Է��ϼ���!");

				continue;

			} else if (num == random) {

				System.out.println("������ϴ�." + "�õ�Ƚ����" + i + "��");

				break;

			}

			while (true) {

				int scoreKor, scoreEng, scoreMath;

				while (true) {

					System.out.println("���������� �Է��ϼ���");

					scoreKor = Integer.parseInt(sc.nextLine());

					if (scoreKor > 100 || scoreKor < 0) {

						System.out.println("0~100������ ���ڸ� ���Է����ּ���");

						continue;

					}

					while (true) {

						System.out.println("���������� �Է��ϼ���");

						scoreEng = Integer.parseInt(sc.nextLine());

						if (scoreEng > 100 || scoreEng < 0) {

							System.out.println("0~100������ ���ڸ� ���Է����ּ���");

							continue;

						}

						while (true) {

							System.out.println("���������� �Է��ϼ���");

							scoreMath = Integer.parseInt(sc.nextLine());

							if (scoreMath > 100 || scoreMath < 0) {

								System.out.println("0~100������ ���ڸ� ���Է����ּ���");

								continue;

							}

							int sum;

							double avg;

							sum = scoreKor + scoreEng + scoreMath;

							avg = (double) sum / 3;

							System.out.println("���� : " + sum);

							System.out.println("��� : " + avg);

							break;

						}

					}

				}

			}
		}
	}
}
