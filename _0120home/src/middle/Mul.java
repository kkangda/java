package middle;

public class Mul extends Calc{
	void setValue(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		System.out.print("����: ");
		return a*b;
	}
}
