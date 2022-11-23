package chapter09.ex03;

class Student {
	String stuName;
	static int stuNo;	//모든 객체에서 공유
	String stuAdd;
	
	static {
		stuNo=0;
	}
	Student (String stuName, String stuAdd) {
		this.stuName = stuName;
		this.stuAdd = stuAdd;
		stuNo ++;		//객체가 생성될 때마다 1씩 증가하도록 설계 (모든 객체에서 공유)
	}
	//필드 값 출력 메소드
	void print() {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학생 주소 : " + stuAdd);
		System.out.println("학생 수 : " + stuNo);
	}
}
public class Student_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("홍길동", "서울 종로구") ;
		s1.print();
	
		System.out.println("==========");
		Student s2 = new Student("이순신", "서울 은평구") ;
		s2.print();
		
		System.out.println("==========");
		Student s3 = new Student("강감찬", "서울 중구") ;
		s3.print();
		
		System.out.println("=====인스턴스 필드=====");
		System.out.println(s1.stuName);
		System.out.println(s2.stuName);
		System.out.println(s3.stuName);
		
		System.out.println("=====정적 필드=====");
		System.out.println(s1.stuNo);
		System.out.println(s2.stuNo);
		System.out.println(s3.stuNo);
	}

}
