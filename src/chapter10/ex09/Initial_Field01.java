package chapter10.ex09;
class Student {
	//필드
	
	String name;
	int stuID;
	int age;
	String stuAdd;
	String stuPhone;
	double weight;
	int month;
	
	//기본생성자
	Student(){}
	//매개변수 값 할당
	Student(String name, int stuID,	int age, String stuAdd,	String stuPhone, double weight){
	
	this.name=name;
	this.stuID=stuID;
	this.age=age;
	this.stuAdd=stuAdd;
	this.stuPhone=stuPhone;
	this.weight=weight;
	if (month >=1 && month <=12) {
		this.month = month;
	}else {
		System.out.println("잘못된 입력 값입니다. 1~12 사이의 정수 값을 할당하세요.");
		return;
	}
}	
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (month >=1 && month <=12) {
		this.month = month;
	}else {
		System.out.println("잘못된 입력 값입니다. 1~12 사이의 정수 값을 할당하세요.");
	}
}
	//getter(필드 값을 리턴으로 돌려줌), setter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//toStirng() 재정의 : 객체의 Heap메모리의 주소값 출력, hashcode로 출력 (16진수로)
	//객체자체를 출력했을 때 toString()가 작동
	//우클릭 - source - generate toString
	@Override
	public String toString() { //object클래스의 메소드, 모든 자바의 클래스는 object 상속
			return "Student [name="+name+", stuID="+stuID+", age="+age+", stuAdd="+stuAdd+", stuPhone="+stuPhone+", weight="+weight+"]" ;
	}


}
public class Initial_Field01 {

	public static void main(String[] args) {
		// 1. 객체 생성 후 직접 필드의 값들 할당
		// 2. 객체를 생성할 때 생성자를 사용해 필드의 값을 할당
		// 3. DTO(Data Transfer Object), VO(Value Object)
		//		: client에게 값을 받아 DAO에 값을 전송
		//		DAO(Data Access Object): Database에 insert, update, delete
		// 	getter(필드의 값을 읽을 때), setter(필드의 값을 할당할 때)를 사용해서 값을

		//1. 객체 생성 후 직접 필드의 값을 할당
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
		s1.stuAdd = "서울 종로구";
		s1.stuID = 1111;
		s1.stuPhone= "010-1111-1111";
		s1.weight= 80.5;
		System.out.println(s1);		//객체를 출력할 때 toString() 메소드가 호출됨
		System.out.println(s1.toString());
		
		//2. 객체 생성시 생성자를 통해 필드의 값을 할당
		Student s2 = new Student("이순신", 2222, 30, "서울 강남구", "010-2222-2222",85.5);
		System.out.println(s2);
		System.out.println(s2.toString());
		
		//3. setter로 값을 넣고 getter를 사용해 필드의 값 출력
		Student s3 = new Student();
		s3.setName("강감찬");
		s3.setAge(40);
		s3.setStuAdd("서울 성북구");
		s3.setStuID(3333);
		s3.setStuPhone("010-3333-3333");
		s3.setWeight(90.5);
		
		System.out.println(s3);
		System.out.println(s3.toString());
		System.out.println("================");
		//getter출력 : 필드의 값을 리턴으로 호출하는 곳으로 돌려줌
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getStuAdd());
		System.out.println(s3.getStuID());
		System.out.println(s3.getStuPhone());
		System.out.println(s3.getWeight());

	}

}
