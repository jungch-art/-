package jung191220;

import java.util.ArrayList;


public class student {

	private int studentNumber;
	private String name;
	private String birth;
	private String address;
	private String phoneNumber;
	private int javaScore;
	private int jspScore;
	private int cssScore;
	ArrayList <studentMain> list = new ArrayList <studentMain>();
	
	//toString 메소드 생성

	// 생성자 생성
	public student() {
	}

	@Override
	public String toString() {
		return "student [studentNumber=" + studentNumber + ", name=" + name + ", birth=" + birth + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", javaScore=" + javaScore + ", jspScore=" + jspScore
				+ ", cssScore=" + cssScore + "]";
	}

	public student(int studentNumber, String name, String birth, String address, String phoneNumber, int javaScore,
			int jspScore, int cssScore) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.javaScore = javaScore;
		this.jspScore = jspScore;
		this.cssScore = cssScore;
	}

	public student(int studentNumber, String name, String birth, String address, String phoneNumber) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	//학생정보등록
	public void stdentInfo() {
			}
	
	//학생성적입력

	
	//5.종료 로직

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public int getJspScore() {
		return jspScore;
	}

	public void setJspScore(int jspScore) {
		this.jspScore = jspScore;
	}

	public int getCssScore() {
		return cssScore;
	}

	public void setCssScore(int cssScore) {
		this.cssScore = cssScore;
	}

	//getter , setter 메소드

	
	
}
