package chapter08.ex02;

public class Student { 		//public : 필드, 메소드 이름 앞에 

	//필드선언
	public String stuName;
	public String stuNo;
	public int stuYear;
	public String stuAdd ;
	
	//생성자
	public Student() {}
	public Student (String stuName, String stuNo, int stuYear, String stuAdd) {
		this.stuName = stuName ;  
		this.stuNo = stuNo;
		this.stuYear = stuYear ;
		this.stuAdd = stuAdd;
	}
	
	//메소드 선언
	public void print() {
		System.out.println("학생이름 : " + stuName);
		System.out.println("학번 : " + stuNo);
		System.out.println("학년 : " + stuYear);
		System.out.println("주소 : " + stuAdd);
	}

}
