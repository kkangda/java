package office;

public abstract class Officer {
	protected String name;
	protected String oNum;
	protected double salary;
	
	public Officer(String name, String oNum, double salary) {
		this.name = name;
		this.oNum = oNum;
		this.salary = salary;
	}
	public abstract double getMonthDay();
	
	public void showEmployeeInfo() {
		System.out.println("이름: "+name);
		System.out.println("사번: "+oNum);
		System.out.println("연봉: "+salary);
	}
}
