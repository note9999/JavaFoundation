package ����½�Ʈ��;

import java.io.FileOutputStream;
import java.io.PrintStream;

//�ƿ�ǲ

public class Sample05 {

   public static void main(String[] args) {
      
      FileOutputStream fos = null;
      PrintStream ps = null;
      
      try {
         fos = new FileOutputStream("test.txt", true);
         ps = new PrintStream(fos); //���� ��Ʈ��, ������ ����� �Ұ�ȣ�ȿ� �ִ´�.
         
         ps.println("������");
         ps.print(123);
         ps.println(true);
         ps.print(3.14);

               
      } catch (Exception e) {
         
      } finally {
         try {
            fos.flush(); //��Ʈ���� �����ִ� ����(���)�� �� ������ ��
            fos.close(); //��Ʈ���� �ݾ��ش�.
         } catch(Exception e) {
            
         }
      }

   }

}