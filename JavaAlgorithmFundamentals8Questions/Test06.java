package JavaAlgorithmFundamentals8Questions;

import java.util.Scanner;

// �Է¹��� ���ڰ� ȸ�������� �ƴ��� ����ϴ� ���α׷��� �ϼ��Ͻÿ�
//ȸ������? 12321, 15751, 131 -> ������ �о �ڷ� �о �Ȱ�����
public class Test06 {

	public static void main(String[] args) {

		int num; // �Է¹޴� ����
		int tmp;	// �ӽ�����
		int result=0;		// ������ ���� ����
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();

		tmp= num;
		
		while(tmp!=0){
			
		result = result*10+ tmp%10;
		tmp=tmp/10; //123456�� ���� 12345�� ��
		}
		if (num==result) {
			System.out.println("ȸ�����Դϴ�.");
		}else {
			System.out.println("ȸ������ �ƴմϴ�.");
		}
	}

}
