package JavaAlgorithmFundamentals8Questions;
//1+(-2)+3+(-4)... �� ���� ������ ��� ���س����� �� ����� ���ؾ� ������ 100�̻� �Ǵ��� ���Ͻÿ�. ���: 199 

public class Test02 {

	public static void main(String[] args) {

		int sum = 0; // �հ� ���� ���� 
		int num=0; // ����(���,���� �Ѵ� ǥ��)
		int i=0; // ����( ���, ���� ǥ�� x)
		int s=1;
	
	 while (true) {
		 i++;
		 num=i*s;
	 
		 sum = sum+num;
		 s=s*-1;
	 	
		 if (sum>=100) {
			 break;
		 	}
	 	}
	System.out.println("����: "+num);
	System.out.println("�հ�: "+ sum);
	}
}
