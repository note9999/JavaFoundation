package ��ü�����;

import java.io.File;

public class Sample02 {

	public static void main(String[] args) {

		File f= new File("text.txt");
		
		
		
		
		System.out.println(f.length()+"byte");	// ���� �뷮 �˷���
		
		System.out.println(f.canWrite()); 	// �������
		
		System.out.println(f.canRead());	// �б� ���ѿ� ���� �˷��� 
		
		System.out.println(f.getPath());
		
		System.out.println(f.getAbsolutePath());  		// ��� �˷���
		
		System.out.println(f.getName()); // ���ϸ� �����Բ� 			
		
		System.out.println(f.isDirectory()); 		
		
		System.out.println(f.isFile());		//�������� �ƴ��� true or false�� ���ϵ�

	}

}
