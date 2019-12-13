package jung191213;

import java.util.Scanner;

public class jung191213_4 {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer[][] = { 
				{"chair", "의자"},
				{"desk", "책상"},
				{"water", "물"},
				{"pencil", "연필"},
				{"watch", "시계"}
		};
		int i;
		int j=0;
		String input;
		int count=0;
		double average=0;
		
		for(i=0 ; i<answer.length ; i++) {
			System.out.println("문제"+(i+1)+". "+ answer[i][0]+"의 뜻은 무엇인가요?");
			input = scan.next();
			for(j=1 ; j<answer[i].length ; j++) {
				if(input.equals(answer[i][j])) {
					System.out.println("정답입니다.");
					count++;
				}
				else {
					System.out.println("오답입니다.");
					System.out.println("정답은" + answer[i][j] + "입니다.");
				}
			}
			
		}
		average =  100/ answer.length *count ;
		System.out.println("총" +count + "개 정답입니다.");
		System.out.println("정답률은" +average + "% 입니다.");
		
		
		}
}


//(answer.length * answer[0].length)