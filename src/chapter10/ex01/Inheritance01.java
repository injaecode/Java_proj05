package chapter10.ex01;

class Human { //부모 클래스 (Super Class) : 자식 클래스의 공통된 특징을 저장 (필드, 메소드)

	//필드(속성)
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
	
	void sleep() {
		System.out.println("모든 사람은 잠을 잡니다.");
	}
}

//자식 클래스 : 부모 클래스의 모든 필드와 메소드를 물려받는다.
class Student extends Human {
	//1. 부모 클래스의 모든 필드와 메소드를 그대로 자식 클래스 내부에서 사용 가능 
	//2. 자식 클래스에서만 적용되는 필드와 메소드를 추가적으로 등록해서 사용
	int studentID ;
	void goToSchool () {
		System.out.println("학생은 학교에 다닙니다.");
	}
}
class Worker extends Human {
	int workerID;
	void goToWork () {
		System.out.println("근로자는 일을 하러 갑니다.");
	}
}
class Professor extends Human {
	int professorID ;
	void goToTeach () {
		System.out.println("교수님은 강의를 하러 갑니다.");
	}
}
class Student2 extends Student {
	//Human -> Student -> Student2
	//Human의 모든 필드와 메소드 상속
	//Student의 모든 필드와 메소드 상속
}
public class Inheritance01 {

	public static void main(String[] args) {
		// 상속(Inheritance) : 부모 클래스의 필드(속성)와 메소드를 자식 클래스에서 물려받아 사용함
			//중복 코드를 줄일 수 있음
			//다형성 : 부모 클래스를 상속받아 다양한 형태로 출력
			//배열이나 컬렉션에 부모클래스 이름으로(업캐스팅) 저장해서 출력
		
		//1. 학생 객체 생성 : 부모 필드와 메소드 + 자식 필드와 메소드 모두 사용 가능
		Student s1 = new Student();
		
		//부모의 필드와 메소드 출력
		s1.name = "홍길동";
		s1.age = 30 ; 
		System.out.println(s1.age);
		System.out.println(s1.name);
		
		s1.eat();
		s1.sleep();
		
		System.out.println("==============");
		
		//자식의 필드와 메소드 출력
		s1.studentID = 2222 ;
		System.out.println(s1.studentID);
		s1.goToSchool();
		
		System.out.println("==============");
		
		//2. 근로자 객체 생성 : 부모 필드와 메소드 + 자식 필드와 메소드 모두 사용 가능
		Worker w1 = new Worker();
		//부모의 필드와 메소드 출력
		w1.age = 40;
		w1.name = "이순신";
		System.out.println(w1.age);
		System.out.println(w1.name);
		
		w1.eat();
		w1.sleep();
		
		System.out.println("==============");
		
		//자식의 필드와 메소드 출력
		System.out.println(w1.workerID);
		w1.goToWork();

		System.out.println("==============");
		Student2 s2 = new Student2() ;
		
		//Human의 필드와 메소드 출력
		s2.age = 27 ;
		s2.name = "신사임당";
		System.out.println(s2.age);
		System.out.println(s2.name);
		
		s2.eat();
		s2.sleep();
		System.out.println("==============");
		
		//Student의 필드와 메소드 출력
		s2.studentID=1234;
		System.out.println(s2.studentID);
		s2.goToSchool();
		
		
	}

}
