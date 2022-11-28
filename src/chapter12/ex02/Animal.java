package chapter12.ex02;

public interface Animal {
	//추상 메소드 : 구현부{} 없음
	void cry();
	void run();
	
//	void eat() {}; //인터페이스 내부에 구현부가 있는 메소드 기입 시 오류 발생
}
//Animal의 메소드를 구현한 클래스
//Cat 클래스는 Animal인터페이스의 구현되지 않은 메소드를 구현한 클래스
