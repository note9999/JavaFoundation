package Thread;
/**
 * 	Ŭ���� �ΰ��� ����
 * 	Thread1->Thread Ŭ������ ���
 *	Thread2-> Runnable �������̽��� ���(����)
 *	���� 1~100���� ��¹� ����
 *	���ι� ����
 */
public class ThreadMain {

	public static void main(String[] args) {

		Thread1 t1= new Thread1();
		
		Thread t2= new Thread(new Thread2());
		
		t1.start(); // ������ �����ų ���� .start �̿�! 
		t2.start();
	}

}
