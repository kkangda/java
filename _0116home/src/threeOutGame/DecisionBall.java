package threeOutGame;

import java.util.Scanner;

public class DecisionBall { // 스트라이크와 볼 판단 역할 클래스
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
			System.out.println("=> "+s+"스트라이크 "+b+"볼");
		}
		else {
			System.out.println(s+"스트라이크로 삼진아웃!!");
			System.out.println();
			System.out.print("다시 하시겠습니까?(Y/N) ");
			if(sc.next()=="n")
				regame = false;
		}
		return regame;
	}
}
