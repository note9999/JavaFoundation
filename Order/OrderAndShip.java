package Order;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderAndShip {
  //  �ֹ� ������ ǰ�� String���� ����
  private static ArrayList<String> availableItems = new ArrayList<>();
  
  public static void main(String[] args) {
    // ����,����,����,�縻,�Ź� �ֹ� 
    availableItems.add("Shirt");
    availableItems.add("Pants");
    availableItems.add("Hat");
    availableItems.add("Socks");
    availableItems.add("Shoes");
    
    Scanner scanner = new Scanner(System.in);  //����ǰ�� �Է��ϵ���
    ArrayList<String> items = new ArrayList<>();
    
    // ���� �ֹ��ϵ���
    while (true) {
      System.out.println("�ֹ��� ǰ���� �̸��� �Է��Ͻʽÿ�(�Ϸ�Ǹ� '�Ϸ�' �Է�)");
      String item = scanner.nextLine();
      
      // ���࿡ ���� �ֹ� �Ϸ� �ϸ� ����Ż��
      if (item.equalsIgnoreCase("�Ϸ�")) {
        break;
      }
      
      // ���� "ã��"��� �ܾ �Է��� ��� ã�ƺ��⸦ ȣ��
      if (item.equalsIgnoreCase("ã��")) {
        browseItems();
        continue;
      }
      
      
      items.add(item);
    }
    
    // ���� �ֹ��� ��� �˷��ֱ� 
    System.out.println("���� ��ǰ���� �ֹ��ϼ̽��ϴ�.");
    for (String item : items) {
      System.out.println(item);
    }
    
    // ��� �ּ� �Է�
    System.out.println("��۹��� �ּҸ� �Է��ϼ���.");
    String address = scanner.nextLine();
    
    // Validate the shipping address
    if (!validateAddress(address)) {
      System.out.println("�߸��� �ּ��Դϴ�. �ùٸ� �ּҸ� �Է��Ͻʽÿ�.");
      return;
    }
    
    // ����������
    System.out.println("�ֹ��� �ּż� �����մϴ�! ������ ��ǰ�� ���� �ּҷ� ��۵˴ϴ�.");
    System.out.println(address);
  }
  
  
  private static void browseItems() {
    System.out.println("�ֹ� ������ ǰ���� ������ �����ϴ�.");
    for (String item : availableItems) {
      System.out.println(item);
    }
  }
  
  // ����ּҿ� ������ ������ Ȯ�� 
  private static boolean validateAddress(String address) {
	// �ּҿ� �ּ�, ����, �� �� ���� ��ȣ�� ���ԵǾ� �ִ��� Ȯ���մϴ�.
    if (address.matches(address)) {
      return true;
    }
    return false;
  }
}

