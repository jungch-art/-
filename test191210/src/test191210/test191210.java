package test191210;

import java.util.Scanner;

public class test191210 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number=0;
		int sum=0;
		int count=0;
		int average ;
		boolean run = true;
		System.out.println("�����Է��ϼ���");
		while(run) {
			sum+= number;
			number= scan.nextInt();
			if(number==0) {
				run=false;
			}
			else {
				count++;
			}
		}
		average = sum / count;
		System.out.println(count);
		System.out.println(average);
		
	}
}


/*

package test191210;

import java.util.Scanner;

public class test191210 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number;
		int sum=0;
		int count=0;
		int average ;
		int temp;
		System.out.println("�����Է��ϼ���");
		number = scan.nextInt();
		
		while ( number != 0) {
			sum += number;
			count++;
			number = scan.nextInt();
		}
		average = sum / count;
		System.out.println("���� ������ "+count+"�� �Դϴ�");
		System.out.println("�����"+ average + "�Դϴ�");
		
	}
}




/*


package test191210;

import java.util.Scanner;

public class test191210 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String number;
		int sum=0;
		int count=-1;
		int average ;
		int temp;
		System.out.println("�����Է��ϼ���");
		
		number = scan.nextLine(); // String Ÿ������ �� �� �Է��Ѵ�.

	    String[] change = number.split(" "); // �� ���� �������� " "�� �������� �߶� �迭�� ��´�.

	    for(int i=0; i<change.length; i++) { 
			sum += Integer.parseInt(change[i]); 
			count++;
	    }
		average = sum / count;
		System.out.println("���� ������ "+count+"�� �Դϴ�");
		System.out.println("�����"+ average + "�Դϴ�");
		
	}
}




*/