package Ŭ��������;

public class Parents{

	public static void main(String[] args) {
	  //GroundUnit gu = new GroundUnit();
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		/**
		 * Ŭ������ ������ ���� ���ǵǾ� ���� �� ����ȯ�� �ùٸ��� ���� ���� ���� ��� ���ÿ�.
		 */
		
		/** ��ĳ���� */
		//��ĳ������ �̷���� �� �� �ٿ�ĳ������ ����
		//�ٿ�ĳ������ �׳��� �ȵ�
		
	/**1�� */		u = (Unit)ac; //����ȯ ����
	/**2�� */ 	u = ac; //1���̶� ���� �� ��ĳ�����ؼ� ����
	/**3�� (o)*/ 	GroundUnit gu = (GroundUnit)u; //������ �׶��� ���ֿ� �ٿ�ĳ����
										//(Unit u = new GroundUnit(); <-- �̰� �ֱ� ������ ����)
	/**4�� */ 	AirUnit au = ac; //�θ��� �θ� Ŭ������ ����ĳ�����̿��� ����
	/**5�� */		t = (Tank)u; // <-- �ٿ�ĳ���ý� �ٷ� �Ʒ� �ܰ��� �༮�� �����ؼ� 5���� �Ұ�
	/**6�� */		GroundUnit ga = t; 
		
	}

}

class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}