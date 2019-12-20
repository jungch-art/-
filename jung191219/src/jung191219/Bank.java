package jung191219;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
		 private int number;
		 private String name;
		 private String accountNumber;
		 private int money;
		 private int i=0;
		 private String aN;
		 private int j=0;
		 private String aNa;
		 
		Scanner scan = new Scanner(System.in);
		//고객정보를 저장할 ArrayList 선언
		ArrayList <Bank> list = new ArrayList<Bank>();
		//생성자 생성 2개(기본생성자)
		Bank(){
			
		}
		//필드값으로 이루어진 생성자
		Bank(int number,String name,String accountNumber  ){
			this.name = name;
			this.accountNumber = accountNumber;
			this.number = number;
		}
		@Override
		public String toString() {
			return "Bank [ number=" + number + ", name=" + name + ", accountNumber=" + accountNumber
					+ "]";
		}

		//2. 예금일떄의 로직
		void balance() {
			System.out.println("계좌번호를입력하세요");
			aN = scan.next();
			for(i=0 ; i< list.size() ; i++) {
				if(aN.equals(list.get(i).accountNumber)){
					System.out.println("예금할 금액을 입력하세요.");
					money = scan.nextInt();
					list.get(i).number += money;
					System.out.println("잔액 >" + list.get(i).number + "원");
				}	
			  }
			}
		//3. 출금일때의 로직
		void withdraw() {
			System.out.println("계좌번호를입력하세요");
			aN = scan.next();
			for(i=0 ; i< list.size() ; i++) {
				if(aN.equals(list.get(i).accountNumber)){
					System.out.println("출금할 금액을 입력하세요.");
					money = scan.nextInt();
					if(list.get(i).number > money) {
					list.get(i).number -= money;
					}
					else {
						System.out.println("잔고가부족합니다.");	
					}
					System.out.println("잔액 >" + list.get(i).number + "원");
				}	
			  }
			}
		
		//4. 잔액 확인 로직
		void balance1() {
			System.out.println("계좌번호를입력하세요");
			aN = scan.next();
			for(i=0 ; i< list.size() ; i++) {
				if(aN.equals(list.get(i).accountNumber)){
				  System.out.println("잔액 >" + list.get(i).number + "원");
				}	
			  }
		}		
		//5. 고객정보 확인 로직	
		void check() {
			System.out.println(name+ number+ accountNumber);
			}	
		//6. 송금일때 로직
		boolean end() {
			System.out.println("프로그램을 종료합니다.");
			return false;
		}
		//7. 프로그램 종료 로직
		void song() {
		System.out.println("계좌번호를입력하세요");
		aN = scan.next();
		for (i = 0; i < list.size(); i++) {
			if (aN.equals(list.get(i).accountNumber)) {
				System.out.println("송금할 계좌번호를입력하세요");
				aNa = scan.next();
				for (j = 1; j < list.size(); j++) {
					if (aNa.equals(list.get(j).accountNumber)) {
						System.out.println("송금할 금액을 입력하세요.");
						money = scan.nextInt();
						if (list.get(i).number > money) {
							list.get(j).number += money;
							list.get(i).number -= money;
						} else {
							System.out.println("잔고가부족합니다.");
							}
						}
					}
				}
			}
		}
			
		//setter, getter 메소드
		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		
		
}
