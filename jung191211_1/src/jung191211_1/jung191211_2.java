package jung191211_1;

import java.util.Scanner;

public class jung191211_2 {

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
		int number[] = {20,30,40,50};
		int sum = 0;
		int average ;
		int i;
		
		for(i=0 ; i < number.length ; i ++) {
			sum += number[i];
		}
		average = sum / number.length ;
		System.out.println("������ : " +sum);
		System.out.println("����� : " +average);
		
		
		//�迭 �����ϸ鼭 �� �ֱ�
//		int number2[] = {1,2,3};
//		System.out.println(number2[0]);
//		System.out.println(number2[1]);
//		System.out.println(number2[2]);
		
		
//		String name[] = {"ȫ","��","��","��"};
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
//		System.out.println(name[3]);
		
		//for���� �̿��ؼ� name�� ����� ���� ��� ����غ�����.
//		int i = 0;
//		 for(name[i] ; i=3 ; i++) {
//			System.out.println(name[i]);
		 }
		
	}


