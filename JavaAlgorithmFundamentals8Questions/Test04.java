package JavaAlgorithmFundamentals8Questions;

import java.util.Scanner;

//int Ÿ���� ���� num�� �Է¹޾� ���ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�
//���� ���� num�� ���� 12345���, '1+2+3+4+5' �� ����� 15�� ����϶�
//�����Է�:12345
//���:15
public class Test04 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	        int sum = 0;
	        int number;
	        System.out.print("�����Է�: ");
	        number = sc.nextInt();


	        while (number > 0) {
	            sum += number % 10; // sum= sum+ number%10

	            number /= 10;			
	        }

	        System.out.println("����Է�: " + sum);
	    }
	}