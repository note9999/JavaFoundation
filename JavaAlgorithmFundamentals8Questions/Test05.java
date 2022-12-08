package JavaAlgorithmFundamentals8Questions;

// ������ ���ڸ��߱� ������ �ۼ��� ���̴� 1�� ������ 100���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ������
// ����ڰ� ���� �Է��ϸ� ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷��ش�
// ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������
// ������� ���ڸ� ����� �� �˷��ش�
// ex) ��ǻ�Ͱ� ������ 1~100���ڸ� ���� ->80�̶�� ����
// ���� �Է� :50 -> �Է��� ���ں���ũ��, ���� �Է�: 90 �Է��� ���ں��� �۴�
// �������� ������ �Է��ϸ� ������ϴ�. �� �õ� Ƚ���� 3���Դϴ�. 
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 100) + 1; // 1���� 100���� ���ڻ�����Ű�� 

		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		int numGuesses = 0;
		while (guess != number) {
			System.out.println("���ڸ� �Է��ϼ��� :");
			guess = scanner.nextInt();
			numGuesses++;

			if (guess < number) {
				System.out.println("�Է��� ���ں��� Ů�ϴ�.");
			} else if (guess > number) {
				System.out.println("�Է��� ���ں��� �۽��ϴ�.");
			}
		}
		System.out.println("������ϴ�. " + " �� �õ�Ƚ��: " + numGuesses);
	}
}
