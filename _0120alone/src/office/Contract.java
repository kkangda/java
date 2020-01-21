package office;

public class Contract extends Officer{
	private int workDay;

	public Contract(String name,String oNum, double salary, int workDay) {
			super(name, oNum, salary);
			this.workDay = workDay;
		}

	public double getMonthDay() { 
		double pay = salary / workDay;
		return pay;
	}
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무일: "+workDay+"일");
	}
}
