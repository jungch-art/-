package jung191219;

import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class BankMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		String accountNumber=null;
		int number=0;
		Boolean run = true;
		int selectNo;
		int balance=0;
		int money=0;
		int i=0;
		int seq=0;
		
		ArrayList <Bank> list = new ArrayList<Bank>();
		Scanner scan = new Scanner(System.in);
		Bank bank = new Bank();
		Bank bank2 = new Bank(number,name,accountNumber);
				
	
		while(run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("0. 고객등록1 | 1.고객등록2 | 2.예금 | 3.출금 | 4.잔액 | 5.고객정보 | 6. 종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("선택 ->");
			selectNo = scan.nextInt();
			if(selectNo == 0) {
				System.out.println("이름을 입력하세요.");
				name = scan.next();
				System.out.println("계좌번호를 등록하세요.");
				accountNumber = scan.next();
				System.out.println("잔액을 등록하세요.");
				number = scan.nextInt();
				Bank bank1 = new Bank(number, name, accountNumber);
				bank.list.add(bank1);
				}
			
			
			if(selectNo == 1) {
				System.out.println("이름을 입력하세요.");
				name = scan.next();
				bank.setName(name) ;
				System.out.println("계좌번호를 입력하세요.");
				accountNumber = scan.next();
				bank.setAccountNumber(accountNumber) ;
				System.out.println("잔액을 입력하세요.");
				number = scan.nextInt();
				bank.setNumber(number) ;
				bank.list.add(bank);
			}
			if(selectNo == 2) {
				bank.balance();
			}
			if(selectNo == 3) {
				bank.withdraw();
			}
			if(selectNo == 4) {
				bank.balance1();
			}

			if(selectNo == 5) {
				for( i=0 ; i< bank.list.size() ; i++) {
					System.out.println(i+1+"." + 
					"이름 : " + bank.list.get(i).getName()+
					"계좌번호 : " + bank.list.get(i).getNumber()+
					"잔액 : " + bank.list.get(i).getNumber());
				}
			}
			if(selectNo == 6) {
				bank.end();
			}
			
	
		}
	
	}
}






