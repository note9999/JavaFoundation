package ����½�Ʈ��;

import java.io.FileInputStream;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Sample02 {

   public static void main(String[] args) {
	   FileInputStream fis =null;
      
	   
	   try { //��ȣ�ȿ� ��θ� �����ϸ� ��ο� �ִ� �����͸� �����ͼ� fis ������ �����
         fis = new FileInputStream("src/����½�Ʈ��/Sample01.java");
               
            int data = 0; //�����Ű�� �ϱ� ���� ���� �ϳ� ����
            
            byte[] buf = new byte[fis.available()]; 
            
            while((data=fis.read(buf,0,buf.length)) != -1) {
               System.out.print(new String(buf,0,data));
            }
      } catch(Exception e) {
         
      } finally {
		try {
			fis.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}

   }

}