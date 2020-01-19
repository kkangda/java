package advance04;

/*PhoneBookVer02.java 프로그램을 LinkedList를 사용하도록 수정해서
데이터 저장 / 검색 / 삭제 / 수정 / 전체출력
이름 / 전화번호 / 생일
*/
import java.util.Scanner;

public class PhoneBookVer02 {
	static Scanner sc = new Scanner(System.in);

	private PhoneNode head;
	private PhoneNode crnt;

	public PhoneBookVer02() {
		head = new PhoneNode();
		crnt = head;
	}

	public void save(PhoneNode node) { // 데이터 저장
		PhoneNode ptr = head;
		while (ptr.next != null)
			ptr = ptr.next;

		ptr.next = node;
		node.next = null;
	}

	public PhoneNode search(PhoneNode node) { // 데이터 검색
		PhoneNode ptr = head;
		while (ptr.next != null) {
			ptr = ptr.next;
			if (ptr.name == node.name && ptr.pNum == node.pNum && ptr.birth == node.birth) {
				crnt = ptr;
				break;
			}
		}
		return crnt;
	}

	public void delete(PhoneNode node) { // 데이터 삭제
		PhoneNode ptr = head;
		PhoneNode pre = null;
		while (ptr.next != null) {
			if (ptr == node) {
				pre.next = crnt.next;
				crnt = crnt.next;
			}
			pre = ptr;
			ptr = ptr.next;
		}
//		if(ptr.next == null) { // 맨끝 노드 삭제의 경우
//			if(ptr.name==node.name&&ptr.pNum==node.pNum&&ptr.birth==node.birth)
//				ptr = crnt;
//			ptr = null;
//		}
	}

	public PhoneNode update(PhoneNode node) { // 데이터 수정
		PhoneNode ptr = new PhoneNode(); // node는 검색으로 받아와야함★
		System.out.println("변경할 이름, 전화번호, 생일을 차례로 입력하세요");
		ptr.name = sc.next();
		ptr.pNum = sc.next();
		ptr.birth = sc.next();

		node.name = ptr.name;
		node.pNum = ptr.pNum;
		node.birth = ptr.birth;

		return node;
	}

	public void print() { // 현재노드 출력
		crnt.infoBook();
	}

	public void allView() { // 전체 출력
		PhoneNode ptr = head.next;
		System.out.println("↓↓↓전체출력↓↓↓");
		while (ptr.next != null) {
			ptr.infoBook();
			ptr = ptr.next;
		}
		if (ptr.next == null)
			ptr.infoBook();
	}
}