package jung191212;

import java.util.Scanner;

public class jung191212_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �迭(Array) : ���� Ÿ���� �����͸� �ϳ��� ������ �����ϴ� ����
		 * �迭����
		 * Ÿ��[] �迭�̸� or Ÿ�� �迭�̸�[]
		 * �迭 ����
		 */
		Scanner scan = new Scanner(System.in);
		//�迭 ����
		//double number[] = new double[5];
		//double num[] = null;
		//num = new bouble[5];
		int sum =0;
		int average ;
		int i = 0;
		int number[] = new int[3];
		
		//System.out.println("���ڸ� �Է��ϼ���.");
		 //number[i] = scan.nextInt();
		System.out.println("���ڸ� �Է��ϼ���.");
		
		for(i=0 ; i <number.length ;  i++) {
			 number[i] = scan.nextInt();
			sum += number[i];
		}
		average = sum / number.length;
		System.out.println("������ : " + sum);
		System.out.println("����� : " + average);
		scan.close();
	}
		
}


