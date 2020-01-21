package office;

import java.util.Scanner;

public class Controller {
	private Officer[] worker; // 회사원 저장할 배열
	private int wNum; // 저장된 총 인원
	private final static int WORKER_NUM = 10; // 최대 인원수
	
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
			System.out.println("저장 가능 인원이 꽉 찼습니다");
	}
	void add(int choice) {
		String name,oNum;
		double salary;
		int bonus, hireYear, workDay;
		
		Scanner sc = InfoView.getScanner();
		System.out.println("이름: "); name = sc.next();
		System.out.println("사번: "); oNum = sc.next();
		System.out.println("연봉: "); salary = sc.nextDouble();
		
		if(choice == MENU.REGULAR_WORKER) {
			System.out.print("보너스: "); bonus = sc.nextInt();
			addInfo(new Regular(name,oNum,salary,bonus));
		}
		else if(choice ==MENU.CONSTRACT_WORKER) {
			System.out.print("근무일: "); workDay = sc.nextInt();
			addInfo(new Contract(name,oNum,salary,workDay));
		}
		else if(choice ==MENU.TEMPORARY_WORKER) {
			System.out.print("고용년수: "); hireYear = sc.nextInt();
			addInfo(new Temporary(name,oNum,salary,hireYear));
		}
		System.out.println("==입력완료==\n");
	}
	void allView() {
		for(int i=0;i<worker.length;i++) {
			if(worker[i]==null) //배열 빈칸이면 멈추게.
				break;
			worker[i].showEmployeeInfo();
		System.out.println();
		
		}
	}
	void payCalc() {
		for(int i=0;i<worker.length;i++) {
		System.out.println(worker[i].name+"의 연봉: "+worker[i].getMonthDay());
		System.out.println();
		}
		
	}
	
}
