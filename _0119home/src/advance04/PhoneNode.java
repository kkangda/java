package advance04;

public class PhoneNode {
	String name;
	String pNum;
	String birth;
	
	PhoneNode next;
	
	public PhoneNode() {
		this.name = null;
		this.pNum = null;
		this.birth = null;
		this.next = null;
	}
	
	public PhoneNode(String name,String pNum,String birth) {
	this.name = name;
	this. pNum = pNum;
	this.birth = birth;
	this.next = null;
	}
	
	public void infoBook() {
		System.out.println("===========");
		System.out.println("이름: "+name);
		System.out.println("전화번호: "+pNum);
		System.out.println("생일: "+birth);
	}
	
}
