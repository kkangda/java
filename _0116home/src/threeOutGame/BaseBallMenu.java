package threeOutGame;

import java.util.Scanner;

public class BaseBallMenu { // 메뉴 보여주는 역할 클래스
	private Scanner sc = new Scanner(System.in);
	private int[]spec = new int[3];
	private DecisionBall dc = new DecisionBall();
	private boolean regame;
	
	public void menu(int[]ball) {
		while(true) {
			System.out.print("첫번째 숫자 입력>> ");
			spec[0] = sc.nextInt();
			System.out.print("두번째 숫자 입력>> ");
			spec[1] = sc.nextInt();
			while(spec[0]==spec[1]) { // 같은 숫자 입력한 경우 처리
				System.out.println("중복되지 않는 숫자로 다시 입력하세요");
				spec[1] = sc.nextInt();
			}
			System.out.print("세번째 숫자 입력>> ");
			spec[2] = sc.nextInt();
			while(spec[0]==spec[2]||spec[1]==spec[2]) { // 같은 숫자 입력한 경우 처리
				System.out.println("중복되지 않는 숫자로 다시 입력하세요");
				spec[2] = sc.nextInt();
			}
			regame = dc.decision(ball, spec);
			if(regame==false)
				break;
		}
	}
}
