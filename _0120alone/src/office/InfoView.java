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
	public static Scanner getScanner(){ // 스캐너 가져오기
		return sc;
	}
	int getNum() {
		System.out.println("몇 명 저장하시겠습니까?");
		int num = sc.nextInt();
		return num;
	}
	void viewMenu() {
		System.out.println("***메뉴 선택***");
		System.out.println("1. 정규직 저장");
		System.out.println("2. 임시직 저장");
		System.out.println("3. 계약직 저장");
		System.out.println("4. 전체 정보 출력");
		System.out.println("5. 월급 계산 출력");
		System.out.println("6. 프로그램 종료");
	}
	int userSelect() {
		System.out.print("번호 선택>>");
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
			System.out.println("==프로그램 종료==");
			return false;
		default:
			System.out.println("1~6번 중에 입력하세요");
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
