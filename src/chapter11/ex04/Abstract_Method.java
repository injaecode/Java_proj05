package chapter11.ex04;

abstract class Animal { //추상 클래스, 추상 메소드가 하나라도 있으면 추상 클래스
	abstract void eat();
	abstract void run();
	abstract void cry();
}
class Cat extends Animal {	//콘크리트 클래스 : 추상메소드를 모두 구현한 메소드
	
	@Override
	void cry() {
		System.out.println("고양이는 야옹");
		
	}
	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다");
			
	}
	@Override
	void run() {
		System.out.println("고양이가 달린다");
				
	}
	
}
abstract class Dog extends Animal {		//추상클래스의 추상 메소드를 일부만 구현한 경우 : 추상 클래스
	@Override
	void cry() {
		System.out.println("개는 멍멍");
		
	}
	@Override
	void eat() {
		System.out.println("개는 뼈다귀를 먹는다");
		
	}
}
class DogChild extends Dog { //콘크리트 클래스
	
	@Override
	void run() {
		 System.out.println("강아지는 깡총");
	
	}
}
public class Abstract_Method {

	public static void main(String[] args) {
	//추상 클래스는 객체를 생성하지 못한다. 타입으로는 지정 가능하다.
	//Animal, Dog는 추상 클래스이므로 객체 생성이 안된다.
		
	//1. Animal 객체 생성
	//	Animal a1 = new Animal(); 오류발생 : 추상클래스는 객체화하지 못한다.
	System.out.println("====================");
	//Cat()을 객체화해서 Animal 타입으로 정의
		Animal a2 = new Cat();
		a2.eat();
		a2.run();
		a2.cry();
	System.out.println("====================");
	//Dog는 추상클래스이므로 객체화할 수 없다.
	//	Dog d1 new Dog(); 오류발생
	
	//DogChild를 객체화해서 Animal타입으로 지정
	Animal a3 = new DogChild();
	a3.cry();	//dog
	a3.run();	//dogchild
	a3.eat();	//dog
	System.out.println("====================");	
	//DogChild를 객체화해서 Dog타입으로 지정
	Dog d3 = new DogChild();
	d3.cry();
	d3.run();
	d3.eat();
	System.out.println("====================");	
	//DogChild를 객체화해서
	DogChild dh1 = new DogChild();
	dh1.cry();
	dh1.eat();
	dh1.run();
	
	}

}
