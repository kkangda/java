package middle;

import java.util.Scanner;

/*1) int타입의 a, b 필드 : 연산하고자 하는 숫자들
2) void setValue(int a, int b) : 숫자를 객체에 설정
3) int calculate(): 해당 목적에 맞는 연산을 실행하고 그 결과를 리턴합니다

Add, Sub, Mul, Div모두 공통된 필드와 메서드가 존재하므로
Calc를 정의하고 이들이 Calc를 상속받게 하세요
그리고 Calc의 배열에 자식 객체들을 담고
calculate를 실행시키세요*/

public abstract class Calc {
	static Scanner sc = new Scanner(System.in);
	int a;
	int b;

	void setValue(int a,int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();

}
