package JavaAlgorithmFundamentals8Questions;

// �ΰ��� �ֻ����� ������ �� �� ���� ���� 6�̵Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ�
// ��� 1,5   2,4    3,3     4,2  5,1 
public class Test03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6) {
					System.out.println(i + " " + j);
				}

			}
		}
	}
}