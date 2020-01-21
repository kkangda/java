package office; 

import java.util.Scanner;

class MENU{
	final static int REGULAR_WORKER = 1;
	final static int TEMPORARY_WORKER = 2;
	final static int CONSTRACT_WORKER = 3;
	final static int ALL_VIEW = 4;
	final static int PAY_CALC = 5;
	final static int EXIT_PROGRAM = 6;
	
}

public class InfoView {
	public static Scanner sc = new Scanner(System.in);
	Controller ctrl;
	
	public InfoView() {
		int num = getNum();
		ctrl = new Controller(num);
		
	}
	public static Scanner getScanner(){ // ��ĳ�� ��������
		return sc;
	}
	int getNum() {
		System.out.println("�� �� �����Ͻðڽ��ϱ�?");
		int num = sc.nextInt();
		return num;
	}
	void viewMenu() {
		System.out.println("***�޴� ����***");
		System.out.println("1. ������ ����");
		System.out.println("2. �ӽ��� ����");
		System.out.println("3. ����� ����");
		System.out.println("4. ��ü ���� ���");
		System.out.println("5. ���� ��� ���");
		System.out.println("6. ���α׷� ����");
	}
	int userSelect() {
		System.out.print("��ȣ ����>>");
		int choice = sc.nextInt();
		return choice;
	}
	boolean runChoice(int choice) {
		switch(choice) {
		case MENU.REGULAR_WORKER:
		case MENU.CONSTRACT_WORKER:
		case MENU.TEMPORARY_WORKER:
			ctrl.add(choice);
			break;
		case MENU.ALL_VIEW:
			ctrl.allView();
			break;
		case MENU.PAY_CALC:
			ctrl.payCalc();
			break;
		case MENU.EXIT_PROGRAM:
			System.out.println("==���α׷� ����==");
			return false;
		default:
			System.out.println("1~6�� �߿� �Է��ϼ���");
			break;
		}
		return true;
	}
	void menuLoop() {
		boolean isRun = true;
		while(isRun) {
			viewMenu();
			int choice = userSelect();
			isRun = runChoice(choice);
		}
	}

}
