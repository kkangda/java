package middle;

public class Sub extends Calc{
	void setValue(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		System.out.print("����: ");
		return a-b;
	}
}
