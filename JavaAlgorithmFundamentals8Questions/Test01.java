package JavaAlgorithmFundamentals8Questions;
// 1+(1+2)+(1+2+3)...(1+2+3+..10)�� ����� ����Ͻÿ�
public class Test01 {

	public static void main(String[] args) {

	int sum=0;
	
	for (int i = 0; i <= 10; i++) {
		for (int j = 1; j <= i; j++) {
			sum=sum+j;
		}
	}
		System.out.println(sum);
	
	}

}
