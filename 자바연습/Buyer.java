package �ڹٿ���;

public class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ ���� �迭
	int i = 0; // cart�迭 ������ ���� �ε���

	void buy(Product p) {
//      1. ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��� ����
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� " + p + "�� ��� �����ϴ�.");
			return;
		}
//      2. ���� ���� ����ϸ� ��ǰ�� ������ ���� ������ ��
		money = money - p.price;

//      3. ��ٱ��Ͽ� ������ ������ ��´� ( add�޼��� ȣ�� )
		add(p);
	}

	void add(Product p) {
//      1. i ���� ��ٱ��� ũ�⺸�� ���ų� ũ��?
		if (i >= cart.length) {
//         1-1. ���� ��ٱ��Ϻ��� 2�� ū ���ο� �迭�� ����
			Product[] temp = new Product[cart.length * 2];
//         1-2. ���� ��ٱ����� ������ ���ο� �迭�� ����     
			System.arraycopy(cart, 0, temp, 0, cart.length);
//         1-3. ���ο� ��ٱ��Ͽ� ���� ��ٱ��ϸ� ��ü
			cart = temp;
		}
//      2. ������ ��ٱ���(cart)�� ����, �׸��� i ����
		cart[i] = p;
		i++;
	}

	void summary() {
		int i;
		int sum = 0;
//      1. ��ٱ��Ͽ� ��� ������ ����� ����� ���
		for (i = 0; i < cart.length; i++) {
			System.out.print(cart[i] + ",");

//      2. ��ٱ��Ͽ� ��� ������ ������ ��� ���ؼ� ���
			sum = sum + cart[i].price;
		}
		System.out.println();
		System.out.println("����� �ݾ� : " + sum);
//      3. ������ ��� ���� �ݾ�(��)�� ���
		System.out.println("���� �ݾ� : " + money);
	}
}