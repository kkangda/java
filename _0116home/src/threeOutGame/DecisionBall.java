package threeOutGame;

import java.util.Scanner;

public class DecisionBall { // ��Ʈ����ũ�� �� �Ǵ� ���� Ŭ����
	private int s;
	private int b;
	private boolean regame = true;
	private Scanner sc = new Scanner(System.in);
	
	public boolean decision(int[]ball, int[]spec) {
		s = 0;
		b = 0;
		
		for(int i=0;i<ball.length;i++) {
			for(int j=0;j<spec.length;j++) {
				if(i==j && ball[i]==spec[j])
					++s;
				else if(i!=j&&ball[i]==spec[j])
					++b;
			}
		}
		if(s<3) {
			System.out.println("=> "+s+"��Ʈ����ũ "+b+"��");
		}
		else {
			System.out.println(s+"��Ʈ����ũ�� �����ƿ�!!");
			System.out.println();
			System.out.print("�ٽ� �Ͻðڽ��ϱ�?(Y/N) ");
			if(sc.next()=="n")
				regame = false;
		}
		return regame;
	}
}
