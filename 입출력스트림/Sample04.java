package ����½�Ʈ��;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class Sample04 {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("src/����½�Ʈ��/Sample01.java");
			br = new BufferedReader(fr); // ���۰� � ���� ��������(fr�� �����Ϸ��� fr�� ����)

			String txt = null;

			while ((txt = br.readLine()) != null) {
				System.out.println(txt);
			}

		} catch (Exception e) {
		
		}finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			
			}
		}
	}

}
