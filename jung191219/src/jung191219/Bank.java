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
		//�������� ������ ArrayList ����
		ArrayList <Bank> list = new ArrayList<Bank>();
		//������ ���� 2��(�⺻������)
		Bank(){
			
		}
		//�ʵ尪���� �̷���� ������
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

		//2. �����ϋ��� ����
		void balance() {
			System.out.println("���¹�ȣ���Է��ϼ���");
			aN = scan.next();
			for(i=0 ; i< list.size() ; i++) {
				if(aN.equals(list.get(i).accountNumber)){
					System.out.println("������ �ݾ��� �Է��ϼ���.");
					money = scan.nextInt();
					list.get(i).number += money;
					System.out.println("�ܾ� >" + list.get(i).number + "��");
				}	
			  }
			}
		//3. ����϶��� ����
		void withdraw() {
			System.out.println("���¹�ȣ���Է��ϼ���");
			aN = scan.next();
			for(i=0 ; i< list.size() ; i++) {
				if(aN.equals(list.get(i).accountNumber)){
					System.out.println("����� �ݾ��� �Է��ϼ���.");
					money = scan.nextInt();
					if(list.get(i).number > money) {
					list.get(i).number -= money;
					}
					else {
						System.out.println("�ܰ������մϴ�.");	
					}
					System.out.println("�ܾ� >" + list.get(i).number + "��");
				}	
			  }
			}
		
		//4. �ܾ� Ȯ�� ����
		void balance1() {
			System.out.println("���¹�ȣ���Է��ϼ���");
			aN = scan.next();
			for(i=0 ; i< list.size() ; i++) {
				if(aN.equals(list.get(i).accountNumber)){
				  System.out.println("�ܾ� >" + list.get(i).number + "��");
				}	
			  }
		}		
		//5. ������ Ȯ�� ����	
		void check() {
			System.out.println(name+ number+ accountNumber);
			}	
		//6. �۱��϶� ����
		boolean end() {
			System.out.println("���α׷��� �����մϴ�.");
			return false;
		}
		//7. ���α׷� ���� ����
		void song() {
		System.out.println("���¹�ȣ���Է��ϼ���");
		aN = scan.next();
		for (i = 0; i < list.size(); i++) {
			if (aN.equals(list.get(i).accountNumber)) {
				System.out.println("�۱��� ���¹�ȣ���Է��ϼ���");
				aNa = scan.next();
				for (j = 1; j < list.size(); j++) {
					if (aNa.equals(list.get(j).accountNumber)) {
						System.out.println("�۱��� �ݾ��� �Է��ϼ���.");
						money = scan.nextInt();
						if (list.get(i).number > money) {
							list.get(j).number += money;
							list.get(i).number -= money;
						} else {
							System.out.println("�ܰ������մϴ�.");
							}
						}
					}
				}
			}
		}
			
		//setter, getter �޼ҵ�
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
