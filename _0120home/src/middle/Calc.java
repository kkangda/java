package middle;

import java.util.Scanner;

/*1) intŸ���� a, b �ʵ� : �����ϰ��� �ϴ� ���ڵ�
2) void setValue(int a, int b) : ���ڸ� ��ü�� ����
3) int calculate(): �ش� ������ �´� ������ �����ϰ� �� ����� �����մϴ�

Add, Sub, Mul, Div��� ����� �ʵ�� �޼��尡 �����ϹǷ�
Calc�� �����ϰ� �̵��� Calc�� ��ӹް� �ϼ���
�׸��� Calc�� �迭�� �ڽ� ��ü���� ���
calculate�� �����Ű����*/

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
