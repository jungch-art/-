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
		System.out.println("수를입력하세요");
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
		System.out.println("수를입력하세요");
		number = scan.nextInt();
		
		while ( number != 0) {
			sum += number;
			count++;
			number = scan.nextInt();
		}
		average = sum / count;
		System.out.println("받은 갯수는 "+count+"개 입니다");
		System.out.println("평균은"+ average + "입니다");
		
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
		System.out.println("수를입력하세요");
		
		number = scan.nextLine(); // String 타입으로 한 번 입력한다.

	    String[] change = number.split(" "); // 두 수를 구분짓는 " "를 기준으로 잘라 배열에 담는다.

	    for(int i=0; i<change.length; i++) { 
			sum += Integer.parseInt(change[i]); 
			count++;
	    }
		average = sum / count;
		System.out.println("받은 갯수는 "+count+"개 입니다");
		System.out.println("평균은"+ average + "입니다");
		
	}
}




*/