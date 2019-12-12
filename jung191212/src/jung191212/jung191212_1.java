package jung191212;

import java.util.Scanner;

public class jung191212_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 배열(Array) : 같은 타임의 데이터를 하나의 변수에 저장하는 구조
		 * 배열선언
		 * 타입[] 배열이름 or 타입 배열이름[]
		 * 배열 선언
		 */
		Scanner scan = new Scanner(System.in);
		//배열 선언
		//double number[] = new double[5];
		//double num[] = null;
		//num = new bouble[5];
		int sum =0;
		int average ;
		int i = 0;
		int number[] = new int[3];
		
		//System.out.println("숫자를 입력하세요.");
		 //number[i] = scan.nextInt();
		System.out.println("숫자를 입력하세요.");
		
		for(i=0 ; i <number.length ;  i++) {
			 number[i] = scan.nextInt();
			sum += number[i];
		}
		average = sum / number.length;
		System.out.println("총합은 : " + sum);
		System.out.println("평균은 : " + average);
		scan.close();
	}
		
}


