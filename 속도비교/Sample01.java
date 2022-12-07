package �ӵ���;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample01 {

	public static void main(String[] args) throws Exception { // ����ó�� ���ѱ��

		/** ��ǲ, �ƿ�Ǭ ���ν�Ʈ�� */
		FileInputStream fis = null;
		FileOutputStream fos = null;

		/** ��ǲ, �ƿ�ǫ ������Ʈ�� */
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		int data = 0;
		long start = 0;
		long end = 0;

		fis = new FileInputStream("src/�ӵ���/apple.png"); // ��������
		fos = new FileOutputStream("src/apple.png"); // �鿩������

		start = System.currentTimeMillis(); // ���� �ð�

		while ((data = fis.read()) != -1) { // �о����
			fos.write(data); // ��������
		}
		fos.flush(); // ��� ó��
		end = System.currentTimeMillis();
		fos.close();
		fis.close();

		System.out.println("���� ��� X : " + (end - start));

		fis = new FileInputStream("src/�ӵ���/apple.png");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("src/apple.png");
		bos = new BufferedOutputStream(fos);

		start = System.currentTimeMillis(); // ���� �ð�

		while ((data = bis.read()) != -1) { // �о����
			bos.write(data); // ��������
		}
		bos.flush(); // ��� ó��
		end = System.currentTimeMillis();
		bis.close();
		bos.close();
		fos.close();
		fis.close();

		System.out.println("���� ��� O : " + (end - start));

	}

}