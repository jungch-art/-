package jung191211_1;

import java.util.Scanner;

public class jung191211_2 {

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
		int number[] = {20,30,40,50};
		int sum = 0;
		int average ;
		int i;
		
		for(i=0 ; i < number.length ; i ++) {
			sum += number[i];
		}
		average = sum / number.length ;
		System.out.println("총합은 : " +sum);
		System.out.println("평균은 : " +average);
		
		
		//배열 선언하면서 값 주기
//		int number2[] = {1,2,3};
//		System.out.println(number2[0]);
//		System.out.println(number2[1]);
//		System.out.println(number2[2]);
		
		
//		String name[] = {"홍","김","정","박"};
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
//		System.out.println(name[3]);
		
		//for문을 이용해서 name에 저장된 값을 모두 출력해보세요.
//		int i = 0;
//		 for(name[i] ; i=3 ; i++) {
//			System.out.println(name[i]);
		 }
		
	}


