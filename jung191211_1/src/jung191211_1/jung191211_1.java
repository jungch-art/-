package jung191211_1;

import java.util.Scanner;


public class jung191211_1 {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			
			int number  ;
			int count = 0;
			int val;
			int sum;
			boolean run = true;
			
			System.out.println("1~10까지의 숫자를 입력하세요");
			val = scan.nextInt();
			
			number = (int)(Math.random() *10) +1;
			
			while(run) {
				count++;
				if(number == val) {
					System.out.println("정답입니다.");
					run = false;
				}
				else if(number < val) {
					System.out.println("더 작은수를입력하세요");
					val = scan.nextInt();
				}
				else {
					System.out.println("더 큰수를입력하세요");
					val = scan.nextInt();
				}
			}
			System.out.println("시도한 횟수는 " + count + "번 입니다");		
		}
	}

		
