package ����½�Ʈ��;

import java.io.FileWriter;

public class Sample06 {

	public static void main(String[] args) {

		FileWriter fw = null;

		try {
			fw= new FileWriter("text2.txt");

			fw.write('A');
			char[] buf = { 'B', 'C', 'D' };
			fw.write(buf);
			fw.write(buf, 1, 2); // buf 1���� ���� 2���� �ְڴ�

			String str = "�����ٶ�";
			fw.write(str);
			fw.write(str, 2, 2); // str 2���� ���� 2���� �־��

		} catch (Exception e) {
		} finally {
			try {
				fw.flush();
				fw.close();
			} catch (Exception e2) {

			}
		}
	}

}
