package threeOutGame;

import java.util.Scanner;

public class BaseBallMenu { // �޴� �����ִ� ���� Ŭ����
	private Scanner sc = new Scanner(System.in);
	private int[]spec = new int[3];
	private DecisionBall dc = new DecisionBall();
	private boolean regame;
	
	public void menu(int[]ball) {
		while(true) {
			System.out.print("ù��° ���� �Է�>> ");
			spec[0] = sc.nextInt();
			System.out.print("�ι�° ���� �Է�>> ");
			spec[1] = sc.nextInt();
			while(spec[0]==spec[1]) { // ���� ���� �Է��� ��� ó��
				System.out.println("�ߺ����� �ʴ� ���ڷ� �ٽ� �Է��ϼ���");
				spec[1] = sc.nextInt();
			}
			System.out.print("����° ���� �Է�>> ");
			spec[2] = sc.nextInt();
			while(spec[0]==spec[2]||spec[1]==spec[2]) { // ���� ���� �Է��� ��� ó��
				System.out.println("�ߺ����� �ʴ� ���ڷ� �ٽ� �Է��ϼ���");
				spec[2] = sc.nextInt();
			}
			regame = dc.decision(ball, spec);
			if(regame==false)
				break;
		}
	}
}
