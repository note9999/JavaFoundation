package JavaAlgorithmFundamentals8Questions;

public class Test07 {
// ������ �迭�� ��� �����͸� �а� �� ������ ������ ��� ������ŭ * �� �� 
//	�׷����� �׸��� ���α׷��̴�
//	<���� ���>
//	1:***
//	2:**
//	3:**
//	4:****

	public static void main(String[] args) {

		int[] arr = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] cnt = new int[4]; // �� ���ں� ���������迭
		int i, j;

		for (i = 0; i < arr.length; i++) {
//			arr[i] -1;                 ������ �����ϴ� �迭�� ��ȣ  
//		cnt[ arr[i]- 1 ]++;				�ش� ������ ������ �����ϴ� �迭 ��ġ 
			cnt[arr[i] - 1]++;
		}
		for (i = 0; i < cnt.length; i++) {
			System.out.print(i + 1 + " : ");
			for (j = 0; j < cnt[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
