package advance04;

import java.util.Scanner;

public class PhoneMain {
	public static Scanner sc = new Scanner(System.in);
	
	public static void showMenu(){
		System.out.println("선택하세요...");
		System.out.println("1. 데이터 입력"); // 잘됨
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 수정");
		System.out.println("5. 데이터 전체 출력"); // 잘됨
		System.out.println("6. 프로그램 종료");
		System.out.print("선택: ");
	}
	
	public static void main(String[] args) {
		PhoneBookVer02 ver = new PhoneBookVer02();
		int choice;
		
		while(true){
			showMenu();
			choice=sc.nextInt();
			sc.nextLine();	
			
			switch(choice){
			case 1:
				System.out.println("저장할 이름, 전화번호, 생일을 차례로 입력하세요");
				String a = sc.next();
				String b = sc.next();
				String c = sc.next();
				ver.save(new PhoneNode(a,b,c));
				break;
			case 2:
				System.out.println("검색할 이름, 전화번호, 생일을 차례로 입력하세요");
				String a1 = sc.next();
				String b1 = sc.next();
				String c1 = sc.next();
//				PhoneNode node = new PhoneNode(a1,b1,c1);
//				PhoneNode ptr = ver.search(node);
				ver.search(new PhoneNode(a1,b1,c1));
				ver.print();
				break;
			case 3:
				System.out.println("삭제할 이름, 전화번호, 생일을 차례로 입력하세요");
//				String a2 = sc.next();
//				String b2 = sc.next();
//				String c2 = sc.next();
//				ver.delete(new PhoneNode(a2,b2,c2));
				ver.delete(new PhoneNode(sc.next(),sc.next(),sc.next()));
				System.out.println("삭제되었습니다.");
				break;
			case 4:
				System.out.println("수정해야 하는 이름, 전화번호, 생일을 차례로 입력하세요");
				String a3 = sc.next();
				String b3 = sc.next();
				String c3 = sc.next();
				ver.update(ver.search(new PhoneNode(a3,b3,c3)));
				System.out.println("변경되었습니다");
				break;
			case 5:
				System.out.println("전체 데이터를 출력합니다");
				ver.allView();
				// 아래는 현재노트 확인 테스트용
				System.out.println("%%아래 현재노드 확인 테스트%%");
				ver.print(); // 확인결과 crnt는 빈칸으로 나옴
				
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("1~6번 중 선택하세요.");
			}
		}
	}
}


