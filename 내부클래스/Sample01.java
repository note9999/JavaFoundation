package ����Ŭ����;

public class Sample01 {

	public static void main(String[] args) {
		// �ڵ� �ϼ�
		Outer outer = new Outer();
		Outer.Inner oInner = outer.new Inner();
	
//		System.out.println(oInner.iv);
		oInner.method();
		
	}
}