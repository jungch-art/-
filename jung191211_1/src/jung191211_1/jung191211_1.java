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
			
			System.out.println("1~10������ ���ڸ� �Է��ϼ���");
			val = scan.nextInt();
			
			number = (int)(Math.random() *10) +1;
			
			while(run) {
				count++;
				if(number == val) {
					System.out.println("�����Դϴ�.");
					run = false;
				}
				else if(number < val) {
					System.out.println("�� ���������Է��ϼ���");
					val = scan.nextInt();
				}
				else {
					System.out.println("�� ū�����Է��ϼ���");
					val = scan.nextInt();
				}
			}
			System.out.println("�õ��� Ƚ���� " + count + "�� �Դϴ�");		
		}
	}

		
