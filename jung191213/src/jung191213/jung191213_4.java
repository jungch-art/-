package jung191213;

import java.util.Scanner;

public class jung191213_4 {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer[][] = { 
				{"chair", "����"},
				{"desk", "å��"},
				{"water", "��"},
				{"pencil", "����"},
				{"watch", "�ð�"}
		};
		int i;
		int j=0;
		String input;
		int count=0;
		double average=0;
		
		for(i=0 ; i<answer.length ; i++) {
			System.out.println("����"+(i+1)+". "+ answer[i][0]+"�� ���� �����ΰ���?");
			input = scan.next();
			for(j=1 ; j<answer[i].length ; j++) {
				if(input.equals(answer[i][j])) {
					System.out.println("�����Դϴ�.");
					count++;
				}
				else {
					System.out.println("�����Դϴ�.");
					System.out.println("������" + answer[i][j] + "�Դϴ�.");
				}
			}
			
		}
		average =  100/ answer.length *count ;
		System.out.println("��" +count + "�� �����Դϴ�.");
		System.out.println("�������" +average + "% �Դϴ�.");
		
		
		}
}


//(answer.length * answer[0].length)