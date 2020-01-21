package office;

import java.util.Scanner;

public class Controller {
	private Officer[] worker; // ȸ��� ������ �迭
	private int wNum; // ����� �� �ο�
	private final static int WORKER_NUM = 10; // �ִ� �ο���
	
	public Controller(){
		worker = new Officer[WORKER_NUM];
		wNum = 0;
	}
	public Controller(int num) {
		worker = new Officer[num];
		wNum = 0;
	}
	
	void addInfo(Officer of) {
		if(wNum<worker.length)
			worker[wNum++] = of;
		else
			System.out.println("���� ���� �ο��� �� á���ϴ�");
	}
	void add(int choice) {
		String name,oNum;
		double salary;
		int bonus, hireYear, workDay;
		
		Scanner sc = InfoView.getScanner();
		System.out.println("�̸�: "); name = sc.next();
		System.out.println("���: "); oNum = sc.next();
		System.out.println("����: "); salary = sc.nextDouble();
		
		if(choice == MENU.REGULAR_WORKER) {
			System.out.print("���ʽ�: "); bonus = sc.nextInt();
			addInfo(new Regular(name,oNum,salary,bonus));
		}
		else if(choice ==MENU.CONSTRACT_WORKER) {
			System.out.print("�ٹ���: "); workDay = sc.nextInt();
			addInfo(new Contract(name,oNum,salary,workDay));
		}
		else if(choice ==MENU.TEMPORARY_WORKER) {
			System.out.print("�����: "); hireYear = sc.nextInt();
			addInfo(new Temporary(name,oNum,salary,hireYear));
		}
		System.out.println("==�Է¿Ϸ�==\n");
	}
	void allView() {
		for(int i=0;i<worker.length;i++) {
			if(worker[i]==null) //�迭 ��ĭ�̸� ���߰�.
				break;
			worker[i].showEmployeeInfo();
		System.out.println();
		
		}
	}
	void payCalc() {
		for(int i=0;i<worker.length;i++) {
		System.out.println(worker[i].name+"�� ����: "+worker[i].getMonthDay());
		System.out.println();
		}
		
	}
	
}
