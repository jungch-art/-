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
				System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
				System.out.println("-----------------------------");
				System.out.println("����>");
				number = scan.nextInt();
				//1�� �����ϰ�� ����
				if(number == 1) {
				System.out.println("���ݾ� > ");
				money = scan.nextInt();
				totalMoney += money;
				System.out.println("�����ܾ���"+ totalMoney+"�Դϴ�");
				}
				//2�� ��� �ϰ�� ����
				else if(number ==2) {
				System.out.println("��ݾ� > ");
				money = scan.nextInt();
					if(money > totalMoney) {
					System.out.println("�ܰ� �����մϴ�.");
					System.out.println("�����ܾ���"+ totalMoney+"�Դϴ�");
					}
					else {
					totalMoney-=money;
					System.out.println("���ó�����Ǿ����ϴ�.");
					System.out.println("�����ܾ���"+ totalMoney+"�Դϴ�");
					}
				}
				//3�� �ܰ� �ϰ�� ����
				if(number == 3) {
					System.out.println("�ܰ� > �����ܾ���"+ totalMoney+"�Դϴ�");	
				}
				//4�� ���α׷����� �ϰ�� ����
				if(number == 4) {
					run = false;
					System.out.println("���α׷��� ����Ǿ����ϴ�");
				}	
			}
		}
	}

		
