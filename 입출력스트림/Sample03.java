package ����½�Ʈ��;

import java.io.FileReader;

public class Sample03 {

	public static void main(String[] args) {

	FileReader fr= null;
	
	try {
		fr = new FileReader("src/����½�Ʈ��/Sample01.java");
		int data = 0;
		while( (data=fr.read())!= -1) {
			System.out.print((char)data);
		}
	} catch (Exception e) {
	
	}finally {
		try {
			fr.close();
		} catch (Exception e2) {
		}
	}
	}

}
