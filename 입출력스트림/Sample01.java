package ����½�Ʈ��;

import java.io.IOException;
import java.io.InputStream;

public class Sample01 {

	public static void main(String[] args) {

		try {
			InputStream in = System.in;
			int data = 0;

			while ((data = in.read()) != -1) {				//read ��ü�� 1byte�� �о� ������ �������·� �о���� �ǰ�
				System.out.print((char) data);				// �׳� ����ع����� �о���� ���ڷ� ����
			}
		} catch (IOException e) {
		
		}
	}
}
