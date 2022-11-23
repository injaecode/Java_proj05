package chapter10.ex01;

class Animal {				//자식 클래스로 tiger, eagle, lion 생성, 필드1 메소드1 정의
	String name;			// LionChild는 lion클래스를 상속해 필드1 메소드1 정의
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal {
	String feeding;
	void cry() {
		System.out.println("호랑이는 어흥");
	}
}
class Eagle extends Animal {
	String animaltype;
	void wings() {
		System.out.println("독수리는 날아서 사냥을 합니다.");
	}
}
class Lion extends Animal {
	int legs ;
	void hair() {
		System.out.println("숫사자는 갈기가 있습니다.");
	}
}
class LionChild extends Lion {
	int lifespan ;
	void king() {
		System.out.println("사자는 '동물의 왕'이라 불립니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eagle a1 = new Eagle() ;
		a1.age = 5;
		System.out.println(a1.age);
		
		LionChild b1 = new LionChild() ;
		b1.name = "심바";
		System.out.println(b1.name);
		b1.sleep();
		
	}

}
