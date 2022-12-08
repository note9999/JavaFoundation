package JavaAlgorithmFundamentals8Questions;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class Test08 {

	public static void main(String[] args) {
		// �Ž��� �� �ݾ��� �Է¹޾� ����Ѵ�.
		// ������ ������ ������ �Ž������� ������ �� ������
		// '�Ž��� ���� �����մϴ�.' ��� ����ϰ� �����Ѵ�.
		// ������ ���� ����� ������ �Ž������� ������ ��ŭ ���������� ����
		// ���� ������ ������ ȭ�鿡 ����Ѵ�.
		// ��� ���
//		�Ž��� ���� �ݾ��� �Է��ϼ���. 2680
//		money:2680
//		500��:5
//		100��:1
//		50��:1
//		10��:3
//		==���� �����ǰ���--
//		500��:0
//		100��:4
//		50��:4
//		10��:2

		int[] coinUnit = { 500, 100, 50, 10 }; // ���� ���� ���� �迭
		int[] coin = { 5, 5, 5, 5 }; // ���� ���� ���� �迭
		int[] passCoin = new int[4];
		int money;

		System.out.print("�Ž��� ���� �ݾ��� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		money = sc.nextInt();

		for (int i = 0; i < coin.length; i++) {

			passCoin[i] = money / coinUnit[i]; // �ݾ׿��� ���� ���� ������ ���� ������ ����

			if (passCoin[i] > coin[i]) { // ������ �ִ� ���� �������� ū �� ����� ��
				passCoin[i] = coin[i]; // �ӽ������ ������ ���� ������ �ִ� ���� ������
				coin[i] = 0;
			} else {
				coin[i] = coin[i] - passCoin[i]; // ���� ���� ������������ �ӽ����� ���� ������ ����
			}

			money = money - (coinUnit[i] * passCoin[i]); // 2700�� �̶�� 500��¥�� �ټ����� 2500�� ���༭ 200�� ����� �۾�

		}
		if (money > 0) {
			System.out.println("�Ž����� �ܵ��� �����մϴ�.");
		} else {

			System.out.println("�Ž����� ��������");
			for (int i = 0; i < coin.length; i++) {
				System.out.println(coinUnit[i] + "��" + coin[i] + "��");

				System.out.println("===������������====");
				for (i = 0; i < coin.length; i++) {
					System.out.println(coinUnit[i] + "��" + coin[i] + "��");
				}
			}
		}
	}
}
