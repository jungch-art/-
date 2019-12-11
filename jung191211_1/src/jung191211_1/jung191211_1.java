package jung191211_1;

import java.util.Scanner;


public class jung191211_1 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			
			int number  ;
			int money;
			int totalMoney = 0;
			boolean run = true; 
			
					
			while(run) {
				System.out.println("-----------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-----------------------------");
				System.out.println("선택>");
				number = scan.nextInt();
				//1번 예금일경우 로직
				if(number == 1) {
				System.out.println("예금액 > ");
				money = scan.nextInt();
				totalMoney += money;
				System.out.println("현재잔액은"+ totalMoney+"입니다");
				}
				//2번 출금 일경우 로직
				else if(number ==2) {
				System.out.println("출금액 > ");
				money = scan.nextInt();
					if(money > totalMoney) {
					System.out.println("잔고가 부족합니다.");
					System.out.println("현재잔액은"+ totalMoney+"입니다");
					}
					else {
					totalMoney-=money;
					System.out.println("출금처리가되었습니다.");
					System.out.println("현재잔액은"+ totalMoney+"입니다");
					}
				}
				//3번 잔고 일경우 로직
				if(number == 3) {
					System.out.println("잔고 > 현재잔액은"+ totalMoney+"입니다");	
				}
				//4번 프로그램종료 일경우 로직
				if(number == 4) {
					run = false;
					System.out.println("프로그램이 종료되었습니다");
				}	
			}
		}
	}

		
