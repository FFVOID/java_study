package pop;

import java.util.Scanner;

public class BankApplication {
	// static 필드

	// Account는 클래스지만 타입으로(int,string) 사용 가능하다 그래서 Account[]
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3. 예금 | 4.출금 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				// 계좌등록
				creatAccount();
				break;
			case 2:
				// 계좌목록
				accountList();
				break;
			case 3:
				// 예금
				deposit();
				break;
			case 4:
				// 출금
				withdraw();
				break;
			case 5:
				run = false;
				System.out.println("프로그램 종료.");
				break;
			default:
				System.out.println("1~5 사이의 숫자를 입력해주세요");
				break;
			}
		}
	}

	// 계좌생성
	private static void creatAccount() {
		System.out.println("---------");
		System.out.println("계좌생성");
		System.out.println("---------");

		System.out.println("계좌번호:");
		String ano = scanner.next(); // String 타입으로 입력 받는다

		System.out.println("계좌주:");
		String owner = scanner.next(); // String 타입으로 입력 받는다

		System.out.println("초기입금액:");
		int balance = scanner.nextInt(); // int 타입으로 입력 받는다.

		// 계좌생성
		Account newAccount = new Account(ano, owner, balance);
		// String이 참조 타입이기 떄문에 아래와같이 사용하는 것 처럼
		// Account도 참조 타입이다.
		/*
		 * String[] arr = {"a","b"}; for(String a: arr){System.out.println(a);}
		 * 
		 */

		// 배열안에 객체를 넣는다.
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount; // 생성한 계좌객체를 배열에 넣어준다
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; // 계좌를 생성하면 for문을 빠져 나온다.
			}
		}

		// 계좌가 잘 생성이 되었나 확인(객체 이므로 주소가 찍힌다
		/*
		 * for (Account account : accountArray) { System.out.println(account); }
		 */
	}

	// 계좌목록
	private static void accountList() {
		System.out.println("---------");
		System.out.println("  계좌목록 ");
		System.out.println("---------");

		for (Account account : accountArray) {
			if (account != null) {

				System.out.println(account.getAno() + "   " + account.getOwner() + "   " + account.getBalance());

			} else {
				break;
			}
		}
	}

	// 예금하기
	private static void deposit() {

		System.out.println("---------");
		System.out.println("   예금  ");
		System.out.println("---------");
		System.out.println("계좌번호:");
		String input = scanner.next();
		for (Account account : accountArray) {

			if (account.getAno().equals(input)) {

				System.out.println(account.getAno());
				System.out.println("예금액:");
				account.setBalance(account.getBalance() + scanner.nextInt());
				System.out.println("잔고:" + account.getBalance());
				break;

			}

		}

	}

	// 출금하기
	private static void withdraw() {
		System.out.println("---------");
		System.out.println(" 출금 ");
		System.out.println("---------");
		System.out.println("계좌번호:");
		String input2 = scanner.next();
		for (Account account : accountArray) {

			if (account.getAno().equals(input2)) {
				System.out.println("출금액:");
				account.setBalance(account.getBalance() - scanner.nextInt());
				System.out.println("출금이 성공 되었습니다 잔고:" + account.getBalance());
				break;
			}
		}
	}

}