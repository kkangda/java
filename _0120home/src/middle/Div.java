package middle;

public class Div extends Calc{
	void setValue(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		System.out.print("³ª´°¼À: ");
		return a/b;
	}
}
