package office;

public class Regular extends Officer {
	private int bonus;

	public Regular(String name, String oNum, double salary, int bonus) {
		super(name,oNum,salary);
		this.bonus = bonus;
	}

	public double getMonthDay() {
		double pay = (salary / 12) + (bonus / 12);
		return pay;
	}
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("º¸³Ê½º: "+bonus);
	}
}
