package jung191220;

import java.util.*;


public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int selectNo;
		int studentNumber=0;
		String name;
		String birth;
		String address;
		String phoneNumber;
		int i;
		int javaScore=0;
		int jspScore=0;
		int cssScore=0;
		int max=0;
		String person=null;
		
		Scanner scan = new Scanner(System.in);
		ArrayList <student> list = new ArrayList <student>();
		student st = null;
		st = new student();
		
		while(run) {
			System.out.println("-------------------------------------------------------------");
			System.out.println("1.�л���� | 2.���� �����Է� | 3.��������Ʈ | 4.���� �ְ����� | 5.����");
			System.out.println("-------------------------------------------------------------");
			selectNo = scan.nextInt();
			if(selectNo ==1) {
				st = new student();
				studentNumber = studentNumber+1;
				System.out.println("�л��������Է��ϼ���");
				System.out.println("�̸� : ");
				name = scan.next();
				System.out.println("������� : ");
				birth = scan.next();
				System.out.println("�ּ� : ");
				address = scan.next();
				System.out.println("��ȭ��ȣ : ");
				phoneNumber = scan.next();
				st = new student(studentNumber,name, birth, address, phoneNumber,javaScore,jspScore,cssScore );
				list.add(st);
			}
			
			if(selectNo ==2) {
				System.out.println("���� �������Է��ϼ���");
				System.out.println("�̸� : ");
				name = scan.next();
				for(i=0 ; i < list.size();  i++ ) {
					if(name.equals(list.get(i).getName())) {
						System.out.println("java���� : ");
						javaScore = scan.nextInt();
						System.out.println("jsp���� : ");
						jspScore = scan.nextInt();
						System.out.println("css���� : ");
						cssScore = scan.nextInt();
						list.get(i).setJavaScore(javaScore) ;
						list.get(i).setJspScore(jspScore);
						list.get(i).setCssScore(cssScore);
						//System.out.println(list.toString());
					}
				}
			}
			
			if(selectNo ==3) {
				for(i=0 ; i<list.size() ; i++) {
					System.out.println(list.get(i));
				}
			}
			
			if (selectNo == 4) {
				System.out.println("������ �Է��ϼ���.");
				System.out.println("1.java | 2.jsp | 3.css");
				int number = scan.nextInt();
				if (number == 1) {
//					st.java();
					for (i = 0; i < list.size(); i++) {
						if (max < list.get(i).getJavaScore()) {
							max = list.get(i).getJavaScore();
							person = list.get(i).getName();
						}
					}
					System.out.println("Java �ְ������� " + person + "��" + max + "�Դϴ�");
				}

				if (number == 2) {
//					st.jsp();
					for (i = 0; i < list.size(); i++) {
						if (max < list.get(i).getJspScore()) {
							max = list.get(i).getJavaScore();
							person = list.get(i).getName();
						}
					}
					System.out.println("jsp �ְ������� " + person + "��" + max + "�Դϴ�");
				}

				if (number == 3) {
//					st.css();
					for (i = 0; i < list.size(); i++) {
						if (max < list.get(i).getCssScore()) {
							max = list.get(i).getCssScore();
							person = list.get(i).getName();
						}
					}
					System.out.println("css �ְ������� " + person + "��" + max + "�Դϴ�");
				}
			}

			if(selectNo ==5) {
				
			}
		}
		scan.close();
	}

}
