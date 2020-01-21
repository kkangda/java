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
		System.out.println("�̸�: "+name);
		System.out.println("���: "+oNum);
		System.out.println("����: "+salary);
	}
}
