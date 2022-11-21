package chapter07;

class Student {
	//필드 선언
	String stuName ;
	int stuNum;
	String stuPhone ;
	String stuAddr ;
	double weight ;
	
	//생성자 오버로딩
	// 기본생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	Student(){} 
	
	Student(String stuName, String stuPhone, String stuAddr) {
		this.stuName = stuName ;
		this.stuPhone = stuPhone ;
		this.stuAddr = stuAddr ;
		
	}
	
	Student(String stuName, String stuPhone, String stuAddr, int stuNum, double weight ) {
		this.stuName = stuName ;
		this.stuPhone = stuPhone ;
		this.stuAddr = stuAddr ;
		this.stuNum = stuNum ;
		this.weight = weight ;
	}
	//필드의 값을 출력하는 메소드 void print() {필드의 값} 출력
	void print() {
		System.out.println("이름 : " + stuName);
		System.out.println("연락처 : " + stuPhone);
		System.out.println("주소 : " + stuAddr);
		System.out.println("학번 : " + stuNum);
		System.out.println("몸무게 : " + weight);
	}
}

public class Ex02 {

	public static void main(String[] args) {
		Student stu1 = new Student() ;
		stu1.print();
		System.out.println("============");
		
		Student stu2 = new Student("김개똥", "010-1234-9876", "서울시 중구 명동") ;
		stu2.print();
		System.out.println("============");
		
		Student stu3 = new Student("최영희", "010-9638-1472", "제주도 서귀포시 노형동", 202214752, 87.4);
		stu3.print();

	}

}
