package office;

public class Temporary extends Officer {
	private int hireYear;
	
	public Temporary(String name,String oNum, double salary, int hireYear) {
		super(name, oNum, salary);
		this.hireYear = hireYear;
	}
	public double getMonthDay() {
		double pay = salary/12;
		return pay;
	}
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무일: "+hireYear+"일");
	}
	
}
