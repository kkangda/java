package middle;

import java.util.Scanner;

public class Calculate {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Calc[]calc = new Calc[4];
		calc[0] = new Add();
		calc[1] = new Sub();
		calc[2] = new Mul();
		calc[3] = new Div();
		
		System.out.print("첫번째 수 입력: ");
		int a = sc.nextInt();
		System.out.print("두번째 수 입력: ");
		int b = sc.nextInt();
		
		for(int i=0;i<calc.length;i++) {
			calc[i].setValue(a, b);
			System.out.println(calc[i].calculate());
		}
	}

}
