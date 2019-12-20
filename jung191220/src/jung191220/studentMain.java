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
			System.out.println("1.학생등록 | 2.과목별 점수입력 | 3.점수리스트 | 4.과목별 최고점수 | 5.종료");
			System.out.println("-------------------------------------------------------------");
			selectNo = scan.nextInt();
			if(selectNo ==1) {
				st = new student();
				studentNumber = studentNumber+1;
				System.out.println("학생정보를입력하세요");
				System.out.println("이름 : ");
				name = scan.next();
				System.out.println("생년월일 : ");
				birth = scan.next();
				System.out.println("주소 : ");
				address = scan.next();
				System.out.println("전화번호 : ");
				phoneNumber = scan.next();
				st = new student(studentNumber,name, birth, address, phoneNumber,javaScore,jspScore,cssScore );
				list.add(st);
			}
			
			if(selectNo ==2) {
				System.out.println("과목별 성적을입력하세요");
				System.out.println("이름 : ");
				name = scan.next();
				for(i=0 ; i < list.size();  i++ ) {
					if(name.equals(list.get(i).getName())) {
						System.out.println("java점수 : ");
						javaScore = scan.nextInt();
						System.out.println("jsp점수 : ");
						jspScore = scan.nextInt();
						System.out.println("css점수 : ");
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
				System.out.println("과목을 입력하세요.");
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
					System.out.println("Java 최고점수는 " + person + "의" + max + "입니다");
				}

				if (number == 2) {
//					st.jsp();
					for (i = 0; i < list.size(); i++) {
						if (max < list.get(i).getJspScore()) {
							max = list.get(i).getJavaScore();
							person = list.get(i).getName();
						}
					}
					System.out.println("jsp 최고점수는 " + person + "의" + max + "입니다");
				}

				if (number == 3) {
//					st.css();
					for (i = 0; i < list.size(); i++) {
						if (max < list.get(i).getCssScore()) {
							max = list.get(i).getCssScore();
							person = list.get(i).getName();
						}
					}
					System.out.println("css 최고점수는 " + person + "의" + max + "입니다");
				}
			}

			if(selectNo ==5) {
				
			}
		}
		scan.close();
	}

}
