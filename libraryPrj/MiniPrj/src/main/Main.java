package main;


//import Person.Member;
import util.Util;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println(" ANONYMOUS�� ���� "); //���⵵... ���� �ǰ� ��Ź�帳�ϴ�.. 
		
		boolean isTrue = true;
		
		while(isTrue) {
		System.out.println("=================="); // �����ϰ� == ** ## �� Ư������ �̿��ص� �ǰ�, �����ǰ� ������ �������ּ���~
		System.out.println("1. �Ϲݻ����"); // ���� �ٲ㵵��
		System.out.println("2. ����������");
		System.out.println("3. ���������");
		
		int n = Util.scInt();
		
		switch(n) {
		case 1 :  new UserMenu().userLoginMenu(); break;
		case 2 :  break;
		case 3 : isTrue = false; break; 
		default : System.out.println(" �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���. ");
		}

		
		}
		
		
		

	}

}
