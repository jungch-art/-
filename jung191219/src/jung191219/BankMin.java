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
		int i=0;
		
		Scanner scan = new Scanner(System.in);
		Bank bank = null;
		
		while(run) {
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("0. �����1 | 1.�����2 | 2.���� | 3.��� | 4.�ܾ� | 5.������ | 6. �۱� | 7.����");
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("���� ->");
			selectNo = scan.nextInt();
			if(selectNo == 0) {
				System.out.println("�̸��� �Է��ϼ���.");
				name = scan.next();
				System.out.println("���¹�ȣ�� ����ϼ���.");
				accountNumber = scan.next();
				System.out.println("�ܾ��� ����ϼ���.");
				number = scan.nextInt();
				bank = new Bank(number, name, accountNumber);
				bank.list.add(bank);
				}
			if(selectNo == 1) {
				bank = new Bank();
				System.out.println("�̸��� �Է��ϼ���.");
				name = scan.next();
				bank.setName(name) ;
				System.out.println("���¹�ȣ�� �Է��ϼ���.");
				accountNumber = scan.next();
				bank.setAccountNumber(accountNumber) ;
				System.out.println("�ܾ��� �Է��ϼ���.");
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
					System.out.println("����ȣ : "+(i+1) + 
					" �̸� : " + bank.list.get(i).getName()+
					" ���¹�ȣ : " + bank.list.get(i).getAccountNumber()+
					" �ܾ� : " + bank.list.get(i).getNumber());
				}
			}
			if(selectNo == 6) {
				bank.song();
			}
			if(selectNo == 7) {
				bank.end();
			}
	
		}
		scan.close();
	}
}






