package jung191219;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
		 private int seq;
		 private int number;
		 private String name;
		 private String accountNumber;
		 private int money;
		 private int totalmoney;
		 private int i;
		 private String aN=null;
		 private boolean run = true;
		Scanner scan = new Scanner(System.in);
		
		ArrayList <Bank> list = new ArrayList<Bank>();
		Bank(){
			
		}
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

	
		
		//0.생성자를 이용한 고객등록 로직
		void registration() {
		
		}
		
		//1.getter , setter를 이용한 고객등록 로직
		void registration1() {
			
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
			
			
		
		//3.출금일때의 로직
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
		
		//5.고객정보 확인 로직
		
		void check() {
			System.out.println(name+ number+ accountNumber);
			}
		
		
		//7.프로그램 종료 로직
		boolean end() {
			System.out.println("프로그램을 종료합니다.");
			return false;
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
